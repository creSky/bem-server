package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppCircumstance;
import com.bem.domain.AppCircumstanceExample;
import com.bem.domain.VerificationDomain;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppCompeleteMapper;
import com.bem.service.AppFileService;
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
    public HttpResult getAppDispatch(@RequestBody String appCircumstanceJson) throws Exception {
        AppCircumstance appCircumstance = JSONObject.parseObject(appCircumstanceJson, AppCircumstance.class);
        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
        HttpResult httpResult = new HttpResult();
        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
        AppCircumstanceExample.Criteria criteria = appCircumstanceExample.createCriteria();
        criteria.andAppIdEqualTo(appCircumstance.getAppId()).
                andProcessInstanceIdEqualTo(appCircumstance.getProcessInstanceId());
        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
        httpResult.setStatusCode(HttpResult.SUCCESS);
        if (null != returnAppCircumstance && returnAppCircumstance.size() > 0) {
            httpResult.setResultData(returnAppCircumstance.get(0));
        }
        httpResult.setMessage("查询成功");
        return httpResult;

    }

    /**
     * @param appCircumstanceJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appCircumstanceJson) throws Exception {
        AppCircumstance appCircumstance = JSONObject.parseObject(appCircumstanceJson, AppCircumstance.class);

        //关键数据校验
        VerificationDomain verificationDomain = JSONObject.parseObject(appCircumstanceJson, VerificationDomain.class);
        String verificationData = BemCommonUtil.verificationData(verificationDomain);
        if (!"200".equals(verificationData)) {
            return new HttpResult(HttpResult.ERROR, "关键数据缺失", null);
        }


        boolean isExist = appCircumstanceMapper.existsWithPrimaryKey(appCircumstance);
        appCircumstance.setCreateDate(new Date());
        appCircumstance.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(appCircumstanceJson)));
        if (isExist) {
            appCircumstance.setSubmitDate(new Date());
        } else {
            appCircumstance.setCreateDate(new Date());
            appCircumstance.setSubmitDate(new Date());
        }
        appCircumstanceMapper.insertSelective(appCircumstance);
        return new HttpResult(HttpResult.SUCCESS, "保存成功", appCircumstance);
    }

}
