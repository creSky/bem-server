package com.bem.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bem.domain.*;
import com.bem.entity.AppInfoQueryEntity;
import com.bem.entity.AppInfoQueryReturnEntity;
import com.bem.mapper.AppCustomerInfoMapper;
import com.bem.mapper.AppSettlementInfoMapper;
import com.bem.mapper.AppUserInfoMapper;
import com.bem.mapper.AppWebLogMapper;
import com.bem.service.ActivitiService;
import com.bem.service.SysSequenceNoService;
import com.bem.util.DateUtil;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
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
import java.net.URL;
import java.util.*;
import java.util.stream.Collectors;

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

    @Autowired
    private AppSettlementInfoMapper appSettlementInfoMapper;

    @RequestMapping("/getSystemTime")
    @ResponseBody
    public Date getSystemTime(@RequestBody(required = false) String getSystemTimeJson) throws Exception {
        return new Date();
    }

    @RequestMapping("/getAppBaseInfo")
    @ResponseBody
    public HttpResult getAppBaseInfo(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(appBaseInfoJson);
        AppUserInfo appUserInfo = appUserInfoMapper.selectByPrimaryKey(jsonObject.getString("appId"));
        AppCustomerInfo appCustomerInfo =
                appCustomerInfoMapper.selectByPrimaryKey(appUserInfo.getCustomerId());
        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("user", appUserInfo);
        returnMap.put("customer", appCustomerInfo);
        //提取文件注释
        /*returnMap.put("file", PropertiesUtil.post(PropertiesUtil.getValue(
                "getWebFile"),
                "user_no="+appUserInfo.getUserNo()
                +"&template_id="+appUserInfo.getTemplateId(),
                "utf-8",30);*/
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", returnMap);
    }


    @RequestMapping(value = "/getCustomer")
    @ResponseBody
    public HttpResult getCustomer(@RequestBody(required = false) String appBaseInfoObject) throws Exception {
        HttpResult<Object> httpResult = new HttpResult();
        AppCustomerInfo appCustomerInfo = JSONObject.parseObject(appBaseInfoObject, AppCustomerInfo.class);

        List<AppCustomerInfo> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        taskMap = appCustomerInfoMapper.select(appCustomerInfo);
        httpResult.setResultData(taskMap);
        if (null == taskMap || taskMap.size() < 1) {
            taskMap.clear();
            taskMap.add(new AppCustomerInfo());
            httpResult.setResultData(taskMap);
        }
        httpResult.setStatusCode(HttpResult.SUCCESS);
        return httpResult;
    }

    /**
     * 保存业扩流程基本信息
     *
     * @param appBaseInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    @Transactional
    public HttpResult save(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        JSONObject appBaseInfoObject = JSONObject.parseObject(appBaseInfoJson);
        //客户
        AppCustomerInfo appCustomerInfo = JSONObject.parseObject(appBaseInfoObject.getString("customer"), AppCustomerInfo.class);
        //用电户
        AppUserInfo appUserInfo = JSONObject.parseObject(appBaseInfoObject.getString("user"), AppUserInfo.class);

        //得到营业区域no
        String businessNo = restTemplate.getForObject("http://AUTH-CENTER/auth/dept/getDeptById/" + appUserInfo.getBusinessPlaceCode(),
                String.class);
        JSONObject preBusinessJson = JSONObject.parseObject(businessNo);
        JSONObject businessJson =
                JSONObject.parseObject(preBusinessJson.getString("resultData"));

        JSONObject postData = new JSONObject();
        postData.put("busi", businessJson.getString("deptId"));

        //生成户号和流程号 采用从档案服务读取的方式
        if (appUserInfo.getUserNo() == null || "".equals(appUserInfo.getUserNo())) {
            String userNo =
                    restTemplate.postForObject(PropertiesUtil.getValue("generateUserNo"), postData, String.class);
            appUserInfo.setUserNo(userNo);
            appCustomerInfo.setCustomerNo(userNo);
        }

        appUserInfo.setSource("4");
        String appNo = restTemplate.postForObject(PropertiesUtil.getValue("generateAppNo"), postData, String.class);

        //判断客户是否存在
        boolean isExists = false;
        if (appCustomerInfo.getCustomerNo() != null && !"".equals(appCustomerInfo.getCustomerNo())) {
            isExists = appCustomerInfoMapper.existsWithPrimaryKey(appCustomerInfo);
            if (isExists) {
                appCustomerInfoMapper.updateByPrimaryKeySelective(appCustomerInfo);
            } else {
                appCustomerInfo.setAppNo((null == appUserInfo.getAppNo() || "".equals(appUserInfo.getAppNo())) ? appNo :
                        appUserInfo.getAppNo());
                appCustomerInfo.setCreateDate(new Date());
                appCustomerInfoMapper.insertSelective(appCustomerInfo);
            }
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
            //appUserInfo.setId(appCustomerInfo.getId());
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
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appBaseInfo);
    }


    //网站包装
    @RequestMapping("/receiveFromWeb")
    @ResponseBody
    @Transactional
    public HttpResult receiveFromWeb(@RequestBody(required = false) String webJson) {
        System.out.println("提交网站参数======================" + webJson);
        JSONObject webJsonbject = JSONObject.parseObject(webJson);
        AppUserInfo appUserInfo = new AppUserInfo();
        appUserInfo.setUserName(webJsonbject.getString("account_name"));
        appUserInfo.setAddress(webJsonbject.getString("power_address"));
        appUserInfo.setTemplateId(new Integer(webJsonbject.getString("template_id")));
        appUserInfo.setBusinessPlaceCode(new Integer(webJsonbject.getString("business_area")));
        appUserInfo.setPhoneNumber(webJsonbject.getString("contact_number"));
        appUserInfo.setRemark(webJsonbject.getString("remark"));
        appUserInfo.setApplyDate(DateUtil.stampToTime(webJsonbject.getString("create_time")));
        appUserInfo.setSubmitDate(DateUtil.stampToTime(webJsonbject.getString("approval_time")));
        appUserInfo.setSource(webJsonbject.getString("source"));
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
            HttpResult returnResult = saveFromWeb(appCustomerInfoJson);
            appWebLog.setOutJson(JSONObject.toJSONString(returnResult));
            appWebLogMapper.insert(appWebLog);
            return new HttpResult<>(HttpResult.SUCCESS, "提交营销系统成功", null);
        } catch (Exception e) {
            e.printStackTrace();
            return new HttpResult<>(HttpResult.ERROR, "提交营销系统失败", null);
        }
    }


    @RequestMapping("/saveFromWeb")
    @ResponseBody
    @Transactional
    public HttpResult saveFromWeb(@RequestBody(required = false) String appBaseInfoJson) throws Exception {
        JSONObject appBaseInfoObject = JSONObject.parseObject(appBaseInfoJson);
        //用电户
        AppUserInfo appUserInfo = JSONObject.parseObject(appBaseInfoObject.getString("user"), AppUserInfo.class);

        //得到营业区域no
        String businessNo = restTemplate.getForObject("http://AUTH-CENTER/auth/dept/getDeptById/" + appUserInfo.getBusinessPlaceCode(),
                String.class);
        JSONObject preBusinessJson = JSONObject.parseObject(businessNo);

        JSONObject businessJson =
                JSONObject.parseObject(preBusinessJson.getString("resultData"));

        //生成户号和流程号 采用从档案服务读取的方式
        JSONObject postData = new JSONObject();
        postData.put("busi", businessJson.getString("deptId"));
        String userNo = restTemplate.postForObject(PropertiesUtil.getValue("generateUserNo"), postData, String.class);
        appUserInfo.setUserNo(userNo);

        //appUserInfo.setSource("4");
        String appNo = restTemplate.postForObject(PropertiesUtil.getValue("generateAppNo"), postData, String.class);

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
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appBaseInfo);
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


    @RequestMapping("/getUserByCim")
    @ResponseBody
    public HttpResult getUserByCim(@RequestBody(required = false) String userJson) throws Exception {
        Integer templateId = JSONObject.parseObject(userJson).getInteger("templateId");
        if (Objects.equals(templateId, 8)) {
            //销户查看是否有欠费-- 查看户号对应的计量点
            JSONObject userJsonObject = JSONObject.parseObject(userJson);
            JSONObject paramJsonObject = new JSONObject();
            paramJsonObject.put("no", userJsonObject.getString("userNo"));
            paramJsonObject.put("chargeObject", "1");
            paramJsonObject.put("name", userJsonObject.getString("userName"));
            paramJsonObject.put("chargeModeType", null);
            paramJsonObject.put("businessPlaceCode", null);
            paramJsonObject.put("bankNo", null);
            String resultMeters = restTemplate.postForObject
                    (PropertiesUtil.getValue("getMeters"), paramJsonObject, String.class);
            List<AppMeterInfo> appMeterInfos =
                    JSONObject.parseArray(resultMeters, AppMeterInfo.class);
            List<String> meterIds = new ArrayList<>();
            meterIds = appMeterInfos.stream().map(t -> {
                return t.getId().toString();
            }).collect(Collectors.toList());

            if (meterIds != null && meterIds.size() > 0) {
                //户下有计量点
                //根据计量带点查欠费
                String resultArrearages = restTemplate.postForObject
                        (PropertiesUtil.getValue("findArrearageByMeterIds"), meterIds, String.class);
                JSONArray arrearagesJsonArray =
                        JSONObject.parseArray(resultArrearages);
                //判断有无欠费记录
                if (arrearagesJsonArray != null && arrearagesJsonArray.size() > 0) {
                    return new HttpResult<>(HttpResult.ERROR,
                            "当前用户存在欠费记录，无法销户！", null);
                }
                //判断计量点所在结算户有无余额
                String resultSettlements = restTemplate.postForObject
                        (PropertiesUtil.getValue("getSettlementByMeterIds"), meterIds, String.class);

                String resultPreCharge = restTemplate.postForObject
                        (PropertiesUtil.getValue("findPreChargeBySettleIds"), resultSettlements, String.class);

                JSONArray preCharge =
                        JSONObject.parseArray(resultPreCharge);

                //判断有无欠费记录
                if (preCharge != null && preCharge.size() > 0) {
                    return new HttpResult<>(HttpResult.ERROR, "当前用户有余额，无法销户！",
                            null);
                }


            }
        }
        //根据userno username 请求cim 获取档案信息
        String appUserInfoJson = restTemplate.postForObject
                (PropertiesUtil.getValue("getUserInfo"), userJson, String.class);
        //获取用户对象
        AppUserInfo appUserInfo =
                JSONObject.parseArray(JSONObject.parseObject(appUserInfoJson).getString("list"), AppUserInfo.class).get(0);
        // 将id替换到userid 清空主键 赋值业务类别
        appUserInfo.setUserId(appUserInfo.getId());
        appUserInfo.setId(null);
        appUserInfo.setApplyDate(new Date());
        appUserInfo.setTemplateId(templateId);

        //查询客户
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("id", appUserInfo.getCustomerId());
        String appCustomerInfoJson = restTemplate.postForObject
                (PropertiesUtil.getValue("getCustomerInfo"), jsonObject, String.class);
        AppCustomerInfo appCustomerInfo =
                JSONObject.parseObject(appCustomerInfoJson, AppCustomerInfo.class);
        appCustomerInfo.setCustomerId(appCustomerInfo.getId());
        appCustomerInfo.setId(null);

        Map<String, Object> returnMap = new HashMap<>();
        returnMap.put("user", appUserInfo);
        returnMap.put("customer", appCustomerInfo);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", returnMap);
    }

    //业扩信息查询报表
    @RequestMapping("/getAppInfoByParam")
    @ResponseBody
    public HttpResult getAppInfoByParam(@RequestBody(required = false) String appBaseInfoJson) throws Exception {

        AppInfoQueryEntity appInfoQueryEntity =
                JSONObject.parseObject(appBaseInfoJson,AppInfoQueryEntity.class);

        List<AppInfoQueryReturnEntity> appInfoQueryReturnEntities =
                appUserInfoMapper.getAppInfoByParam(appInfoQueryEntity);

        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appInfoQueryReturnEntities);
    }
}
