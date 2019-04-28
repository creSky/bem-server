package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppCustomerInfo;
import com.bem.domain.AppUserInfo;
import com.bem.mapper.AppCustomerInfoMapper;
import com.bem.mapper.AppUserInfoMapper;
import com.bem.service.ActivitiService;
import com.bem.util.BemCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

        // System.out.println(result);
        restultContent.setStatus(200);
        restultContent.setData(taskMap);
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
        JSONObject appBaseInfoObject = JSONObject.parseObject(appBaseInfoJson);
        //客户
        AppCustomerInfo appCustomerInfo = JSONObject.parseObject(appBaseInfoObject.getString("customer"), AppCustomerInfo.class);
        //用电户
        AppUserInfo appUserInfo = JSONObject.parseObject(appBaseInfoObject.getString("user"), AppUserInfo.class);
        RestultContent restultContent = new RestultContent();

        String appNo = BemCommonUtil.createAppNo();

        //判断客户是否存在
        boolean isExists = appCustomerInfoMapper.existsWithPrimaryKey(appCustomerInfo);
        if (isExists) {
            appCustomerInfoMapper.updateByPrimaryKeySelective(appCustomerInfo);
        } else {
            appCustomerInfo.setAppNo(appNo);
            appCustomerInfoMapper.insertSelective(appCustomerInfo);
        }

        //判断用电户是否存在
        isExists = appUserInfoMapper.existsWithPrimaryKey(appUserInfo);
        if (isExists) {
            appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);
        } else {
            appUserInfo.setId(appCustomerInfo.getId());
            appUserInfo.setAppNo(appNo);
            appUserInfo.setCustomerId(appCustomerInfo.getId());
            appUserInfoMapper.insertSelective(appUserInfo);
            //启动流程
            activitiService.start(appUserInfo.getTemplateId().toString(), appUserInfo.getAppNo());
        }
        Map<String, Object> appBaseInfo = new HashMap<>();
        appBaseInfo.put("customer", appCustomerInfo);
        appBaseInfo.put("user", appUserInfo);
        restultContent.setData(appBaseInfo);
        restultContent.setStatus(200);
        return restultContent;
    }


}
