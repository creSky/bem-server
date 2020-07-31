package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppRefundPreMoneyInfo;
import com.bem.domain.AppSettlementInfo;
import com.bem.mapper.AppRefundPreMoneyInfoMapper;
import com.bem.mapper.AppSettlementInfoMapper;
import com.bem.service.ActivitiService;
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

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author ：zjd
 * @date ：Created in 2020年6月5日19:30:34
 * @modified By：电费流程申请登记
 */
@Controller
@RequestMapping("/appSettlement")
public class AppSettlementController {
    @Autowired
    private AppSettlementInfoMapper appSettlementInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private ActivitiService activitiService;


    @ResponseBody
    @RequestMapping("/getAppSettlement")
    public HttpResult getAppSettlement(@RequestBody String appSettlementJson) {

        AppSettlementInfo paramAppSettlementInfo =
                JSONObject.parseObject(appSettlementJson,AppSettlementInfo.class);
        //取记录
        AppSettlementInfo appSettlementInfo=new AppSettlementInfo();
        appSettlementInfo.setId(paramAppSettlementInfo.getId());
        AppSettlementInfo returnAppSettlement =
                appSettlementInfoMapper.selectOne(appSettlementInfo);
        returnAppSettlement.setAppId(returnAppSettlement.getId());

        if (null == returnAppSettlement ) {
            return new HttpResult<>(HttpResult.ERROR, "无此类数据");
        }
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", returnAppSettlement);
    }


    /**
     * 保存业扩流程基本信息
     *
     * @param appSettleMentJson
     * @return
     */
    @RequestMapping("/saveElecProcess")
    @ResponseBody
    @Transactional
    public HttpResult saveElecProcess(@RequestBody(required = false) String appSettleMentJson) throws Exception {
        JSONObject appBaseInfoObject = JSONObject.parseObject(appSettleMentJson);
        //结算户
        AppSettlementInfo appSettlementInfo =
                JSONObject.parseObject(appBaseInfoObject.getString("settlement"), AppSettlementInfo.class);

        appSettlementInfo.setId(appSettlementInfo.getAppId());

        //得到营业区域no
        String businessNo = restTemplate.getForObject("http://AUTH-CENTER/auth/dept/getDeptById/" + appSettlementInfo.getBusinessPlaceCode(),
                String.class);
        JSONObject preBusinessJson = JSONObject.parseObject(businessNo);
        JSONObject businessJson =
                JSONObject.parseObject(preBusinessJson.getString("resultData"));

        JSONObject postData = new JSONObject();
        postData.put("busi", businessJson.getString("deptId"));


        //判断结算户户是否存在
        AppSettlementInfo appSettlementInfo1 =
                appSettlementInfoMapper.selectByPrimaryKey(appSettlementInfo);
        boolean isExists = appSettlementInfoMapper.existsWithPrimaryKey(appSettlementInfo);
        if (isExists) {
            //增加流程运行标识
            //appUserInfo.setId(appCustomerInfo.getId());
            appSettlementInfo.setApplyDate(appSettlementInfo1.getApplyDate());
            appSettlementInfoMapper.updateByPrimaryKeySelective(appSettlementInfo);
        } else {
            appSettlementInfo.setApplyDate(new Date());
            appSettlementInfo.setApplyManId(appBaseInfoObject.getInteger("managerId"));
            appSettlementInfo.setSource("4");
            appSettlementInfo.setAppStatus("Y");
            String appNo = restTemplate.postForObject(PropertiesUtil.getValue("generateAppNo"), postData, String.class);

            appSettlementInfo.setAppNo(appNo);
            //启动流程
            ProcessInstance processInstance = activitiService.start(appSettlementInfo.getTemplateId().toString(),
                    appSettlementInfo.getAppNo());
            appSettlementInfo.setProcInstId(processInstance.getId());
            appSettlementInfo.setTaskId(activitiService.getTaskByProInsId(processInstance.getId()));
            appSettlementInfoMapper.insertSelective(appSettlementInfo);
        }

        Map<String, Object> appBaseInfo = new HashMap<>();
        appBaseInfo.put("settlement", appSettlementInfo);
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appBaseInfo);
    }
}
