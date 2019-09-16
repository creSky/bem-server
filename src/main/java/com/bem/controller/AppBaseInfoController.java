package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppCustomerInfo;
import com.bem.domain.AppUserInfo;
import com.bem.domain.AppWebLog;
import com.bem.mapper.AppCustomerInfoMapper;
import com.bem.mapper.AppUserInfoMapper;
import com.bem.mapper.AppWebLogMapper;
import com.bem.service.ActivitiService;
import com.bem.service.SysSequenceNoService;
import com.bem.util.BemCommonUtil;
import com.bem.util.DateUtil;
import com.bem.util.PropertiesUtil;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

@Controller
@RequestMapping("/appBaseInfo")
public class AppBaseInfoController {
    //客户
    @Autowired
    private AppCustomerInfoMapper appCustomerInfoMapper;

    //用电户
    @Autowired
    private AppUserInfoMapper appUserInfoMapper;

    @Autowired
    private ActivitiService activitiService;

    @Autowired
    private SysSequenceNoService sysSequenceNoService;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppWebLogMapper appWebLogMapper;


    @RequestMapping("/getAppBaseInfo")
    @ResponseBody
    public RestultContent getAppBaseInfo(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(appBaseInfoJson);
        RestultContent restultContent = new RestultContent();
        AppUserInfo appUserInfo = appUserInfoMapper.selectByPrimaryKey(jsonObject.getString("appId"));
        AppCustomerInfo appCustomerInfo = appCustomerInfoMapper.selectByPrimaryKey(jsonObject.getString("appId"));
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("user", appUserInfo);
        returnMap.put("customer", appCustomerInfo);
        //提取文件注释
        /*returnMap.put("file", PropertiesUtil.post(PropertiesUtil.getValue(
                "getWebFile"),
                "user_no="+appUserInfo.getUserNo()
                +"&template_id="+appUserInfo.getTemplateId(),
                "utf-8",30);*/
        restultContent.setData(returnMap);
        restultContent.setStatus(200);
        return restultContent;
    }


    @RequestMapping(value = "/getCustomer")
    @ResponseBody
    public RestultContent getCustomer(@RequestBody(required = false) String appBaseInfoObject) throws Exception {
        RestultContent restultContent = new RestultContent();
        AppCustomerInfo appCustomerInfo = JSONObject.parseObject(appBaseInfoObject, AppCustomerInfo.class);

        List<AppCustomerInfo> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        taskMap = appCustomerInfoMapper.select(appCustomerInfo);
        restultContent.setData(taskMap);
        if (null == taskMap || taskMap.size() < 1) {
            taskMap.clear();
            taskMap.add(new AppCustomerInfo());
            restultContent.setData(taskMap);
        }
        restultContent.setStatus(200);
        return restultContent;
    }

    /**
     * 保存流程基本信息
     *
     * @param appBaseInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    @Transactional
    public RestultContent save(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        JSONObject appBaseInfoObject = JSONObject.parseObject(appBaseInfoJson);
        //客户
        AppCustomerInfo appCustomerInfo = JSONObject.parseObject(appBaseInfoObject.getString("customer"), AppCustomerInfo.class);
        //用电户
        AppUserInfo appUserInfo = JSONObject.parseObject(appBaseInfoObject.getString("user"), AppUserInfo.class);

        //得到营业区域no
        String businessNo = restTemplate.getForObject("http://AUTH-DATA/auth-data/dept/getDeptById/" + appUserInfo.getBusinessPlaceCode(),
                String.class);
        JSONObject preBusinessJson = JSONObject.parseObject(businessNo);

        JSONObject businessJson = JSONObject.parseObject(preBusinessJson.getString("data"));
        //生成户号
        appUserInfo.setUserNo(sysSequenceNoService.getUserNo(businessJson.getString("deptId")));

        String appNo = sysSequenceNoService.getAppNo(businessJson.getString("deptId"));

        //判断客户是否存在
        boolean isExists = appCustomerInfoMapper.existsWithPrimaryKey(appCustomerInfo);
        if (isExists) {
            appCustomerInfoMapper.updateByPrimaryKeySelective(appCustomerInfo);
        } else {
            appCustomerInfo.setAppNo((null == appUserInfo.getAppNo() || "".equals(appUserInfo.getAppNo())) ? appNo :
                    appUserInfo.getAppNo());
            appCustomerInfo.setCreateDate(new Date());
            appCustomerInfoMapper.insertSelective(appCustomerInfo);
        }

        //增加流程运行标识
        appUserInfo.setAppStatus("Y");
        //判断用电户是否存在
        AppUserInfo appUserInfo1 =
                appUserInfoMapper.selectByPrimaryKey(appUserInfo);
        isExists = appUserInfoMapper.existsWithPrimaryKey(appUserInfo);
        if (isExists) {
            appUserInfo.setApplyDate(appUserInfo1.getApplyDate());
            appUserInfo.setSubmitDate(new Date());
            appUserInfo.setCustomerId(appCustomerInfo.getId());
            appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);
        } else {
            appUserInfo.setId(appCustomerInfo.getId());
            appUserInfo.setAppNo(appNo);
            appUserInfo.setSubmitDate(new Date());
            appUserInfo.setCreateDate(new Date());
            appUserInfo.setCustomerId(appCustomerInfo.getId());
            //启动流程
            ProcessInstance processInstance = activitiService.start(appUserInfo.getTemplateId().toString(),
                    appUserInfo.getAppNo());
            appUserInfo.setProcInstId(processInstance.getId());
            appUserInfo.setTaskId(activitiService.getTaskByProInsId(processInstance.getId()));
            appUserInfoMapper.insertSelective(appUserInfo);
        }
        Map<String, Object> appBaseInfo = new HashMap<>();
        appBaseInfo.put("customer", appCustomerInfo);
        appBaseInfo.put("user", appUserInfo);
        restultContent.setData(appBaseInfo);
        restultContent.setStatus(200);
        return restultContent;
    }


    //网站包装
    @RequestMapping("/receiveFromWeb")
    @ResponseBody
    @Transactional
    public RestultContent receiveFromWeb(@RequestBody(required = false) String webJson) {
        System.out.println("提交网站参数======================" + webJson);
        RestultContent restultContent = new RestultContent();
        JSONObject webJsonbject = JSONObject.parseObject(webJson);
        AppUserInfo appUserInfo = new AppUserInfo();
        appUserInfo.setUserName(webJsonbject.getString("account_name"));
        appUserInfo.setAddress(webJsonbject.getString("power_address"));
        appUserInfo.setTemplateId(new Integer(webJsonbject.getString("template_id")));
        appUserInfo.setBusinessPlaceCode(webJsonbject.getString("business_area"));
        appUserInfo.setPhoneNumber(webJsonbject.getString("contact_number"));
        appUserInfo.setRemark(webJsonbject.getString("remark"));
        appUserInfo.setApplyDate(DateUtil.stampToTime(webJsonbject.getString("create_time")));
        appUserInfo.setSubmitDate(DateUtil.stampToTime(webJsonbject.getString("approval_time")));

        /*AppCustomerInfo appCustomerInfo = new AppCustomerInfo();
        appCustomerInfo.setCustomerName(webJsonbject.getString("account_name"));
        appCustomerInfo.setAddress(webJsonbject.getString("power_address"));
        appCustomerInfo.setCustomerNameSpell(PropertiesUtil.ToPinyin(webJsonbject.getString("account_name")));
        appCustomerInfo.setAddressSpell(webJsonbject.getString("power_address"));*/
        /*switch (webJsonbject.getString("template_id")){
            case "1" :
                appCustomerInfo.setCardType(new Short("6"));
                break;
            case "2" :
                appCustomerInfo.setCardType(new Short("0"));
                break;
            default :
                appCustomerInfo.setCardType(new Short("0"));
                break;
        }*/
       /* if (null != webJsonbject.getString("template_id") && "1".equals(webJsonbject.getString("template_id"))) {
            appCustomerInfo.setCardType(new Short("6"));
        } else {
            appCustomerInfo.setCardType(new Short("0"));
        }
        appCustomerInfo.setCardNo(webJsonbject.getString("id_number"));
        appCustomerInfo.setLinkMan(webJsonbject.getString("agent_name"));
        appCustomerInfo.setContactInformation(webJsonbject.getString("contact_number"));*/
/*
        "account_name":"czy","id_number":"12312312","power_address":"\u4efb\u52a1\u5206\u4e3a\u798f\u5c14\u6cd5\u4eba","contact_number":"","agent_name":"qweqw","status":"1","remarks":"","id":"1","approval_time":1563003055
*/
        Map<String, Object> appBaseInfo = new HashMap<>();
        //appBaseInfo.put("customer", appCustomerInfo);
        appBaseInfo.put("user", appUserInfo);
        String appCustomerInfoJson = JSONObject.toJSONString(appBaseInfo);
        //保存日志
        AppWebLog appWebLog = new AppWebLog();
        appWebLog.setId(webJsonbject.getString("id"));
        appWebLog.setTemplateId(webJsonbject.getString("template_id"));
        appWebLog.setReceiveJson(webJson);
        try {
            restultContent = saveFromWeb(appCustomerInfoJson);
            appWebLog.setOutJson(JSONObject.toJSONString(restultContent));
            appWebLogMapper.insert(appWebLog);
        } catch (Exception e) {
            e.printStackTrace();
            restultContent.setStatus(300);
            restultContent.setErrorMsg("提交营销系统失败");
        }
        return restultContent;
    }


    @RequestMapping("/saveFromWeb")
    @ResponseBody
    @Transactional
    public RestultContent saveFromWeb(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        JSONObject appBaseInfoObject = JSONObject.parseObject(appBaseInfoJson);
        //用电户
        AppUserInfo appUserInfo = JSONObject.parseObject(appBaseInfoObject.getString("user"), AppUserInfo.class);

        //得到营业区域no
        String businessNo = restTemplate.getForObject("http://AUTH-DATA/auth-data/dept/getDeptById/" + appUserInfo.getBusinessPlaceCode(),
                String.class);
        JSONObject preBusinessJson = JSONObject.parseObject(businessNo);

        JSONObject businessJson = JSONObject.parseObject(preBusinessJson.getString("data"));
        //生成户号
        appUserInfo.setUserNo(sysSequenceNoService.getUserNo(businessJson.getString("deptId")));

        String appNo = sysSequenceNoService.getAppNo(businessJson.getString("deptId"));

        //增加流程运行标识
        appUserInfo.setAppStatus("Y");
        //判断用电户是否存在
        AppUserInfo appUserInfo1 =
                appUserInfoMapper.selectByPrimaryKey(appUserInfo);
        boolean isExists = appUserInfoMapper.existsWithPrimaryKey(appUserInfo);
        if (isExists) {
            appUserInfo.setApplyDate(appUserInfo1.getApplyDate());
            appUserInfo.setSubmitDate(new Date());
            appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);
        } else {
            appUserInfo.setAppNo(appNo);
            //启动流程
            ProcessInstance processInstance = activitiService.start(appUserInfo.getTemplateId().toString(),
                    appUserInfo.getAppNo());
            appUserInfo.setProcInstId(processInstance.getId());
            appUserInfo.setTaskId(activitiService.getTaskByProInsId(processInstance.getId()));
            appUserInfoMapper.insertSelective(appUserInfo);
        }
        Map<String, Object> appBaseInfo = new HashMap<>();
        appBaseInfo.put("user", appUserInfo);
        restultContent.setData(appBaseInfo);
        restultContent.setStatus(200);
        return restultContent;
    }


    /**
     * post请求
     *
     * @return
     * @throws Exception
     */
    @RequestMapping("/getWebFile")
    @ResponseBody
    public String getWebFile(String userNo, String templateId) throws Exception {
        HttpURLConnection http = null;
        InputStream inputStream = null;
        OutputStream outputStream = null;
        StringBuffer result = new StringBuffer();
        try {
            URL url = new URL(PropertiesUtil.getValue("getWebFile"));
            http = (HttpURLConnection) url.openConnection();
            http.setDoInput(true);
            http.setDoOutput(true);
            http.setUseCaches(false);
            http.setConnectTimeout(30 * 1000);// 设置连接超时
            // 如果在建立连接之前超时期满，则会引发一个
            // java.net.SocketTimeoutException。超时时间为零表示无穷大超时。
            http.setReadTimeout(30 * 1000);// 设置读取超时
            // 如果在数据可读取之前超时期满，则会引发一个
            // java.net.SocketTimeoutException。超时时间为零表示无穷大超时。
            http.setRequestMethod("POST");
            http.setRequestProperty("Content-Type",
                    "application/x-www-form-urlencoded; charset=utf-8");
            http.connect();

            outputStream = http.getOutputStream();
            OutputStreamWriter osw = new OutputStreamWriter(outputStream,
                    "utf-8");
            osw.write("user_no=" + userNo + "&template_id=" + templateId);
            osw.flush();
            osw.close();

            if (http.getResponseCode() == 200) {
                BufferedReader in = new BufferedReader(new InputStreamReader(http.getInputStream()));
                String line;
                while ((line = in.readLine()) != null) {
                    result.append(line);
                }
                return result.toString();
            } else {
                throw new RuntimeException("http read [" + http.getResponseCode() + "]");
            }
        } catch (Exception e) {
            throw e;
        } finally {
            if (http != null)
                http.disconnect();
            if (inputStream != null) {
                inputStream.close();
            }
            if (outputStream != null) {
                outputStream.close();
            }
        }
    }

}
