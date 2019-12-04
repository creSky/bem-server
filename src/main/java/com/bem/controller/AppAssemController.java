package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.*;
import com.bem.mapper.AppAssemMapper;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppFileMapper;
import com.bem.service.AppFileService;
import com.bem.util.BemCommonUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.*;

/**
 * 竣工验收及装表接电
 */
@Controller
@RequestMapping("/appAssem")
public class AppAssemController {

    @Autowired
    private AppAssemMapper appAssemMapper;

    @Autowired
    private AppFileService appFileService;

    @Autowired
    private AppFileMapper appFileMapper;

    @Autowired
    private AppCircumstanceMapper appCircumstanceMapper;

    /**
     * @param appAssemJson
     * @return
     */
    @RequestMapping("/getAppAssem")
    @ResponseBody
    public HttpResult getAppAssem(@RequestBody String appAssemJson) throws Exception {
        AppAssem appAssem = JSONObject.parseObject(appAssemJson, AppAssem.class);
        List<AppAssem> returnAppAssem = new ArrayList<>();
        Map<String, Object> returnMap = new HashMap<>();
        AppAssemExample appAssemExample = new AppAssemExample();
        AppAssemExample.Criteria criteria = appAssemExample.createCriteria();
        criteria.andAppIdEqualTo(appAssem.getAppId()).
                andProcessInstanceIdEqualTo(appAssem.getProcessInstanceId());
        returnAppAssem = appAssemMapper.selectByExample(appAssemExample);
        if (null != returnAppAssem && returnAppAssem.size() > 0) {
            returnMap.put("appAssem", returnAppAssem.get(0));
        } else {
            returnMap.put("appAssem", appAssem);
        }

        AppFileExample appFileExample = new AppFileExample();
        AppFileExample.Criteria appFileExampleCriteria = appFileExample.createCriteria();
        appFileExampleCriteria.andTaskIdEqualTo(appAssem.getTaskId().toString())
                .andAppIdEqualTo(new Long(appAssem.getAppId()));
        List<AppFile> appFiles = appFileMapper.selectByExample(appFileExample);
        returnMap.put("appFiles", appFiles.size() == 0 ? null : appFiles);
        return new HttpResult(HttpResult.SUCCESS, "查询成功", returnMap);

    }

    /**
     * @param appAssemJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appAssemJson) throws Exception {
        List<AppFile> appFiles = appFileService.upload(appAssemJson);
        AppAssem appAssem = JSONObject.parseObject(appAssemJson, AppAssem.class);
        VerificationDomain verificationDomain = JSONObject.parseObject(appAssemJson, VerificationDomain.class);
        //关键数据校验
        String verificationData = BemCommonUtil.verificationData(verificationDomain);
        if (!"200".equals(verificationData)) {
            return new HttpResult(HttpResult.ERROR, "关键数据缺失", null);
        }

        boolean isExist = appAssemMapper.existsWithPrimaryKey(appAssem);
        appAssem.setSubmitDate(new Date());
        if (isExist) {
            appAssemMapper.updateByPrimaryKeySelective(appAssem);
        } else {
            appAssem.setCreateDate(new Date());
            appAssemMapper.insertSelective(appAssem);
        }
        Map<String, Object> returnMaps = new HashMap<>();

        returnMaps.put("appFiles", appFiles);
        returnMaps.put("appAssem", appAssem);
        return new HttpResult(HttpResult.SUCCESS, "保存成功", returnMaps);
    }

    /**
     * @param saveCirAndAssemJson
     * @return
     */
    @RequestMapping("/saveCirAndAssem")
    @ResponseBody
    public HttpResult saveCirAndAssem(@RequestBody String saveCirAndAssemJson) throws Exception {
        JSONObject saveCirAndcompelete = JSONObject.parseObject(saveCirAndAssemJson);
        //保存文件和装表信息
        Map<String, Object> returnMaps = new HashMap<>();
        if (saveCirAndcompelete.getString("appAssem") != null && !"".equals(saveCirAndcompelete.getString("appAssem"))) {
            HttpResult appAssem = save(saveCirAndcompelete.getString("appAssem"));
            //关键参数缺失
            if (!"200".equals(appAssem.getStatusCode().toString())) {
                return appAssem;
            }
            returnMaps = (Map<String, Object>) appAssem.getResultData();

        }
        //保存现场勘察信息
        AppCircumstance appCircumstance = JSONObject.parseObject(saveCirAndcompelete.getString("appCircumstance"), AppCircumstance.class);

        //关键数据校验
        VerificationDomain verificationDomain = JSONObject.parseObject(saveCirAndcompelete.getString("appCircumstance"), VerificationDomain.class);
        String verificationData = BemCommonUtil.verificationData(verificationDomain);
        if (!"200".equals(verificationData)) {
            return new HttpResult(HttpResult.ERROR, "关键数据缺失", null);
        }


        boolean isExist = appCircumstanceMapper.existsWithPrimaryKey(appCircumstance);
        appCircumstance.setCreateDate(new Date());
        appCircumstance.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(saveCirAndAssemJson)));
        if (isExist) {
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.updateByPrimaryKey(appCircumstance);
        } else {
            appCircumstance.setCreateDate(new Date());
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.insertSelective(appCircumstance);
        }
        returnMaps.put("appCircumstance", appCircumstance);
        return new HttpResult(HttpResult.SUCCESS, "保存成功", returnMaps);
    }


    /**
     * @param getCirAndAssemJson
     * @return
     */
    @RequestMapping("/getCirAndAssem")
    @ResponseBody
    public HttpResult getCirAndAssem(@RequestBody String getCirAndAssemJson) throws Exception {
        HttpResult cirAndAssem = getAppAssem(getCirAndAssemJson);
        Map<String, Object> returnMap = (Map<String, Object>) cirAndAssem.getResultData();
        AppCircumstance appCircumstance = JSONObject.parseObject(getCirAndAssemJson, AppCircumstance.class);
        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
        AppCircumstanceExample.Criteria criteria = appCircumstanceExample.createCriteria();
        criteria.andAppIdEqualTo(appCircumstance.getAppId()).
                andProcessInstanceIdEqualTo(appCircumstance.getProcessInstanceId());
        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
        if (null != returnAppCircumstance && returnAppCircumstance.size() > 0) {
            returnMap.put("appCircumstance", returnAppCircumstance.get(0));
        } else {
            returnMap.put("appCircumstance", appCircumstance);
        }
        return new HttpResult(HttpResult.SUCCESS, "查询成功", returnMap);


    }


}
