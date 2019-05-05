package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.*;
import com.bem.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping("/appUpdateInformation")
public class AppUpdateInformation {
    @Autowired
    private AppUserInfoMapper appUserInfoMapper;

    @Autowired
    private AppCustomerInfoMapper appCustomerInfoMapper;

    @Autowired
    private AppMeterInfoMapper appMeterInfoMapper;

    @Autowired
    private AppMeterAssetsInfoMapper appMeterAssetsInfoMapper;

    @Autowired
    private AppInductorAssetsInfoMapper appInductorAssetsInfoMapper;


    @Autowired
    private AppTransformerInfoMapper appTransformerInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/update")
    public RestultContent update(@RequestBody(required = false) String appIdJson) {
        String appId = JSONObject.parseObject(appIdJson).getString("appId");
        //组装用户信息
        AppUserInfo appUserInfo = appUserInfoMapper.selectByPrimaryKey(appId);

        //组装客户信息
        AppCustomerInfo appCustomerInfo = appCustomerInfoMapper.selectByPrimaryKey(appId);

        //组装变压器信息
        AppTransformerInfoExample appTransformerInfoExample  = new AppTransformerInfoExample();
        AppTransformerInfoExample.Criteria appTransInfoCriteria = appTransformerInfoExample.createCriteria();
        appTransInfoCriteria.andAppIdEqualTo(Long.valueOf(appId));
        List<AppTransformerInfo> appTransformerInfos = appTransformerInfoMapper.selectByExample(appTransformerInfoExample);


        //组装计量点信息
        AppMeterInfoExample appMeterInfoExample = new AppMeterInfoExample();
        AppMeterInfoExample.Criteria appMeterInfoCriteria = appMeterInfoExample.createCriteria();
        appMeterInfoCriteria.andAppIdEqualTo(Long.valueOf(appId));
        List<AppMeterInfo> appMeterInfos = appMeterInfoMapper.selectByExample(appMeterInfoExample);

        //组装电能表信息
        AppMeterAssetsInfoExample appMeterAssetsInfoExample = new AppMeterAssetsInfoExample();
        AppMeterAssetsInfoExample.Criteria appMeterAssetsInfoCriteria = appMeterAssetsInfoExample.createCriteria();
        appMeterAssetsInfoCriteria.andAppIdEqualTo(Long.valueOf(appId));
        List<AppMeterAssetsInfo> appMeterAssetsInfos = appMeterAssetsInfoMapper.selectByExample(appMeterAssetsInfoExample);


        //组装互感器信息
        AppInductorAssetsInfoExample appInductorAssetsInfoExample = new AppInductorAssetsInfoExample();
        AppInductorAssetsInfoExample.Criteria appInductorAssetsInfoCriteria = appInductorAssetsInfoExample.createCriteria();
        appInductorAssetsInfoCriteria.andAppIdEqualTo(Long.valueOf(appId));
        List<AppInductorAssetsInfo> appInductorAssetsInfos = appInductorAssetsInfoMapper.selectByExample(appInductorAssetsInfoExample);

        JSONObject postData = new JSONObject();
        postData.put("userInfo", appUserInfo);
        postData.put("customerInfo", appCustomerInfo);
        postData.put("transformerInfo", appTransformerInfos);
        postData.put("meterInfo", appMeterInfos);
        postData.put("meterAssetsInfo", appMeterAssetsInfos);
        postData.put("inductorAssetsInfo", appInductorAssetsInfos);

        //发送到cim 更新档案
        String result = restTemplate.postForObject(PropertiesUtil.getValue("bemAddReceive"), postData, String.class);

        return null;
    }

}
