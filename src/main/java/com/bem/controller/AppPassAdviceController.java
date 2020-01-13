package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppPassAdvice;
import com.bem.domain.AppPassAdviceExample;
import com.bem.mapper.AppPassAdviceMapper;
import com.bem.service.ActivitiService;
import com.bem.util.BemCommonUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

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
    public HttpResult getAppPassAdvice(@RequestBody String appPassAdviceJson) throws Exception {
        String userId = BemCommonUtil.getOpeartorId(appPassAdviceJson);
        AppPassAdvice appPassAdvice = JSONObject.parseObject(appPassAdviceJson, AppPassAdvice.class);
        List<AppPassAdvice> returnAppPassAdvice = new ArrayList<>();
        HttpResult<AppPassAdvice> httpResult = new HttpResult();
        AppPassAdviceExample appPassAdviceExample = new AppPassAdviceExample();
        com.bem.domain.AppPassAdviceExample.Criteria criteria = appPassAdviceExample.createCriteria();
        criteria.andAppIdEqualTo(appPassAdvice.getAppId()).
                andProcessInstanceIdEqualTo(appPassAdvice.getProcessInstanceId()).
                andArgeeOidEqualTo(new Integer(userId));
        returnAppPassAdvice = appPassAdviceMapper.selectByExample(appPassAdviceExample);
        httpResult.setStatusCode(HttpResult.SUCCESS);
        if (null != returnAppPassAdvice && returnAppPassAdvice.size() > 0) {
            httpResult.setResultData(returnAppPassAdvice.get(0));
        }else{
            httpResult.setResultData(new AppPassAdvice());
        }
        httpResult.setMessage("查询成功");
        return httpResult;

    }

    /**
     * @param appPassAdviceJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appPassAdviceJson) throws Exception {
        AppPassAdvice appPassAdvice = JSONObject.parseObject(appPassAdviceJson, AppPassAdvice.class);
        boolean isExist = appPassAdviceMapper.existsWithPrimaryKey(appPassAdvice);
        appPassAdvice.setArgeeDate(new Date());
        appPassAdvice.setArgeeOid(new Integer(BemCommonUtil.getOpeartorId(appPassAdviceJson)));
        if (isExist) {
            appPassAdviceMapper.updateByPrimaryKeySelective(appPassAdvice);
        } else {
            appPassAdvice.setCreateDate(new Date());
            appPassAdviceMapper.insertSelective(appPassAdvice);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appPassAdvice);
    }


}
