package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.AppAssemMapper;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppCompeleteMapper;
import com.bem.mapper.AppFileMapper;
import com.bem.service.AppFileService;
import com.bem.util.BemCommonUtil;
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
    public RestultContent getAppAssem(@RequestBody String appAssemJson) throws Exception {
        AppAssem appAssem = JSONObject.parseObject(appAssemJson, AppAssem.class);
        List<AppAssem> returnAppAssem = new ArrayList<>();
        Map<String, Object> returnMap = new HashMap<>();
        RestultContent restultContent = new RestultContent();
        AppAssemExample appAssemExample = new AppAssemExample();
        AppAssemExample.Criteria criteria = appAssemExample.createCriteria();
        criteria.andAppIdEqualTo(appAssem.getAppId()).
                andProcessInstanceIdEqualTo(appAssem.getProcessInstanceId());
        returnAppAssem = appAssemMapper.selectByExample(appAssemExample);
        restultContent.setStatus(200);
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

        restultContent.setData(returnMap);
        restultContent.setStatus(200);
        return restultContent;

    }

    /**
     * @param appAssemJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appAssemJson) throws Exception {
        List<AppFile> appFiles = appFileService.upload(appAssemJson);
        AppAssem appAssem = JSONObject.parseObject(appAssemJson, AppAssem.class);
        RestultContent restultContent = new RestultContent();
        VerificationDomain verificationDomain=JSONObject.parseObject(appAssemJson, VerificationDomain.class);
        //关键数据校验
        String verificationData= BemCommonUtil.verificationData(verificationDomain);
        if(!"200".equals(verificationData)){
            restultContent.setStatus(300);
            restultContent.setErrorMsg("关键数据缺失");
            return restultContent;
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

        restultContent.setStatus(200);
        restultContent.setData(returnMaps);
        return restultContent;
    }

    /**
     * @param saveCirAndAssemJson
     * @return
     */
    @RequestMapping("/saveCirAndAssem")
    @ResponseBody
    public RestultContent saveCirAndAssem(@RequestBody String saveCirAndAssemJson) throws Exception {
        JSONObject saveCirAndcompelete = JSONObject.parseObject(saveCirAndAssemJson);
        //保存文件和装表信息
        Map<String, Object> returnMaps = new HashMap<>();
        if (saveCirAndcompelete.getString("appAssem") != null && !"".equals(saveCirAndcompelete.getString("appAssem"))) {
            RestultContent appAssem = save(saveCirAndcompelete.getString("appAssem"));
            //关键参数缺失
            if(!"200".equals(appAssem.getStatus())){
                return appAssem;
            }
            returnMaps = (Map<String, Object>) appAssem.getData();

        }
        //保存现场勘察信息
        AppCircumstance appCircumstance = JSONObject.parseObject(saveCirAndcompelete.getString("appCircumstance"), AppCircumstance.class);
        RestultContent restultContent = new RestultContent();

        //关键数据校验
        VerificationDomain verificationDomain=JSONObject.parseObject(saveCirAndcompelete.getString("appCircumstance"), VerificationDomain.class);
        String verificationData= BemCommonUtil.verificationData(verificationDomain);
        if(!"200".equals(verificationData)){
            restultContent.setStatus(300);
            restultContent.setErrorMsg("关键数据缺失");
            return restultContent;
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
        restultContent.setStatus(200);
        restultContent.setData(returnMaps);
        return restultContent;
    }


    /**
     * @param getCirAndAssemJson
     * @return
     */
    @RequestMapping("/getCirAndAssem")
    @ResponseBody
    public RestultContent getCirAndAssem(@RequestBody String getCirAndAssemJson) throws Exception {
        RestultContent cirAndAssem = getAppAssem(getCirAndAssemJson);
        Map<String, Object> returnMap = (Map<String, Object>) cirAndAssem.getData();
        AppCircumstance appCircumstance = JSONObject.parseObject(getCirAndAssemJson, AppCircumstance.class);
        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
        AppCircumstanceExample.Criteria criteria = appCircumstanceExample.createCriteria();
        criteria.andAppIdEqualTo(appCircumstance.getAppId()).
                andProcessInstanceIdEqualTo(appCircumstance.getProcessInstanceId());
        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
        restultContent.setStatus(200);
        if (null != returnAppCircumstance && returnAppCircumstance.size() > 0) {
            returnMap.put("appCircumstance", returnAppCircumstance.get(0));
        } else {
            returnMap.put("appCircumstance", appCircumstance);
        }
        restultContent.setData(returnMap);
        restultContent.setStatus(200);
        return restultContent;


    }


}
