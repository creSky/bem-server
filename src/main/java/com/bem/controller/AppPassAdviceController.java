package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppPassAdvice;
import com.bem.domain.AppPassAdviceExample;
import com.bem.mapper.AppPassAdviceMapper;
import com.bem.service.ActivitiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 申请登记都审批
 */
@Controller
@RequestMapping("/appPassAdvice")
public class AppPassAdviceController {

    @Autowired
    private AppPassAdviceMapper appPassAdviceMapper;

    @Autowired
    private ActivitiService activitiService;


    /**
     * @param appPassAdviceJson
     * @return
     */
    @RequestMapping("/getAppPassAdvice")
    @ResponseBody
    public RestultContent getAppPassAdvice(@RequestBody String appPassAdviceJson) throws Exception {
        String userId=JSONObject.parseObject(appPassAdviceJson).get("userId").toString();
        AppPassAdvice appPassAdvice = JSONObject.parseObject(appPassAdviceJson, AppPassAdvice.class);
        List<AppPassAdvice> returnAppPassAdvice = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppPassAdviceExample appPassAdviceExample = new AppPassAdviceExample();
        com.bem.domain.AppPassAdviceExample.Criteria criteria = appPassAdviceExample.createCriteria();
        criteria.andAppIdEqualTo(appPassAdvice.getAppId()).
                andTaskIdEqualTo(appPassAdvice.getTaskId()).
                andProcessInstanceIdEqualTo(appPassAdvice.getProcessInstanceId()).
                andArgeeOidEqualTo(userId);
        returnAppPassAdvice = appPassAdviceMapper.selectByExample(appPassAdviceExample);
        restultContent.setStatus(200);
        if(null!=returnAppPassAdvice && returnAppPassAdvice.size()>0){
            restultContent.setData(returnAppPassAdvice.get(0));
        }
        return restultContent;

    }

    /**
     * @param appPassAdviceJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appPassAdviceJson) throws Exception {
        AppPassAdvice appPassAdvice = JSONObject.parseObject(appPassAdviceJson, AppPassAdvice.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appPassAdviceMapper.existsWithPrimaryKey(appPassAdvice);
        appPassAdvice.setArgeeDate(new Date());
        appPassAdvice.setArgeeOid(JSONObject.parseObject(appPassAdviceJson).get("userId").toString());
        if (isExist) {
            appPassAdviceMapper.updateByPrimaryKeySelective(appPassAdvice);
        } else {
            appPassAdvice.setCreateDate(new Date());
            appPassAdviceMapper.insertSelective(appPassAdvice);
        }
        restultContent.setStatus(200);
        restultContent.setData(appPassAdvice);
        return restultContent;
    }


}
