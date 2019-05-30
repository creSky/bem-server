package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppCompeleteMapper;
import com.bem.mapper.AppDispatchMapper;
import com.bem.service.ActivitiService;
import com.bem.service.AppFileService;
import com.bem.util.BemCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 勘察情况说明
 * 是否可行
 */
@Controller
@RequestMapping("/appCircumstance")
public class AppCircumstanceController {

    @Autowired
    private AppCircumstanceMapper appCircumstanceMapper;
    @Autowired
    private AppFileService appFileService;
    @Autowired
    private AppCompeleteMapper appCompeleteMapper;


    /**
     * @param appCircumstanceJson
     * @return
     */
    @RequestMapping("/getAppCircumstance")
    @ResponseBody
    public RestultContent getAppDispatch(@RequestBody String appCircumstanceJson) throws Exception {
        AppCircumstance appCircumstance = JSONObject.parseObject(appCircumstanceJson, AppCircumstance.class);
        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
        AppCircumstanceExample.Criteria criteria = appCircumstanceExample.createCriteria();
        criteria.andAppIdEqualTo(appCircumstance.getAppId()).
                andProcessInstanceIdEqualTo(appCircumstance.getProcessInstanceId());
        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
        restultContent.setStatus(200);
        if (null != returnAppCircumstance && returnAppCircumstance.size() > 0) {
            restultContent.setData(returnAppCircumstance.get(0));
        }
        return restultContent;

    }

    /**
     * @param appCircumstanceJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appCircumstanceJson) throws Exception {
        AppCircumstance appCircumstance = JSONObject.parseObject(appCircumstanceJson, AppCircumstance.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appCircumstanceMapper.existsWithPrimaryKey(appCircumstance);
        appCircumstance.setCreateDate(new Date());
        appCircumstance.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(appCircumstanceJson)));
        if (isExist) {
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.updateByPrimaryKey(appCircumstance);
        } else {
            appCircumstance.setCreateDate(new Date());
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.insertSelective(appCircumstance);
        }
        restultContent.setStatus(200);
        restultContent.setData(appCircumstance);
        return restultContent;
    }

}
