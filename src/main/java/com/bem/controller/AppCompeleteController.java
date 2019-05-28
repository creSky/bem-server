package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppCompeleteMapper;
import com.bem.mapper.AppFileMapper;
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
 * 竣工验收及装表接电
 */
@Controller
@RequestMapping("/appCompelete")
public class AppCompeleteController {

    @Autowired
    private AppCompeleteMapper appCompeleteMapper;

    @Autowired
    private AppFileService appFileService;

    @Autowired
    private AppFileMapper appFileMapper;

    @Autowired
    private AppCircumstanceMapper appCircumstanceMapper;

    /**
     * @param appCompeleteJson
     * @return
     */
    @RequestMapping("/getAappCompelete")
    @ResponseBody
    public RestultContent getAappCompelete(@RequestBody String appCompeleteJson) throws Exception {
        AppCompelete appCompelete = JSONObject.parseObject(appCompeleteJson, AppCompelete.class);
        List<AppCompelete> returnAppCompelete = new ArrayList<>();
        Map<String, Object> returnMap = new HashMap<>();
        RestultContent restultContent = new RestultContent();
        AppCompeleteExample appCompeleteExample = new AppCompeleteExample();
        AppCompeleteExample.Criteria criteria = appCompeleteExample.createCriteria();
        criteria.andAppIdEqualTo(appCompelete.getAppId()).
                andProcessInstanceIdEqualTo(appCompelete.getProcessInstanceId());
        returnAppCompelete = appCompeleteMapper.selectByExample(appCompeleteExample);
        restultContent.setStatus(200);
        if (null != returnAppCompelete && returnAppCompelete.size() > 0) {
            returnMap.put("appCompelete", returnAppCompelete.get(0));
        } else {
            returnMap.put("appCompelete", null);
        }

        AppFileExample appFileExample = new AppFileExample();
        AppFileExample.Criteria appFileExampleCriteria = appFileExample.createCriteria();
        appFileExampleCriteria.andTaskIdEqualTo(appCompelete.getTaskId().toString())
                .andAppIdEqualTo(new Long(appCompelete.getAppId()));
        List<AppFile> appFiles = appFileMapper.selectByExample(appFileExample);
        returnMap.put("appFiles", appFiles.size() == 0 ? null : appFiles);

        restultContent.setData(returnMap);
        restultContent.setStatus(200);
        return restultContent;

    }

    /**
     * @param appCompeleteJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appCompeleteJson) throws Exception {
        List<AppFile> appFiles = appFileService.upload(appCompeleteJson);
        AppCompelete appCompelete = JSONObject.parseObject(appCompeleteJson, AppCompelete.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appCompeleteMapper.existsWithPrimaryKey(appCompelete);
        if (isExist) {
            appCompelete.setSubmitDate(new Date());
            appCompeleteMapper.updateByPrimaryKeySelective(appCompelete);
        } else {
            appCompelete.setCreateDate(new Date());
            appCompelete.setSubmitDate(new Date());
            appCompeleteMapper.insertSelective(appCompelete);
        }
        Map<String, Object> returnMaps = new HashMap<>();

        returnMaps.put("appFiles", appFiles);
        returnMaps.put("appCompelete", appCompelete);

        restultContent.setStatus(200);
        restultContent.setData(returnMaps);
        return restultContent;
    }

    /**
     * @param saveCirAndcompeleteJson
     * @return
     */
    @RequestMapping("/saveCirAndcompelete")
    @ResponseBody
    public RestultContent saveCirAndcompelete(@RequestBody String saveCirAndcompeleteJson) throws Exception {
        JSONObject saveCirAndcompelete = JSONObject.parseObject(saveCirAndcompeleteJson);
        //保存文件和装表信息
        RestultContent appCompelete = save(saveCirAndcompelete.getString("appCompelete"));
        //保存现场勘察信息
        AppCircumstance appCircumstance = JSONObject.parseObject(saveCirAndcompelete.getString("appCircumstance"), AppCircumstance.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appCircumstanceMapper.existsWithPrimaryKey(appCircumstance);
        appCircumstance.setCreateDate(new Date());
        appCircumstance.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(saveCirAndcompeleteJson)));
        if (isExist) {
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.updateByPrimaryKeySelective(appCircumstance);
        } else {
            appCircumstance.setCreateDate(new Date());
            appCircumstance.setSubmitDate(new Date());
            appCircumstanceMapper.insertSelective(appCircumstance);
        }
        Map<String, Object> returnMaps = (Map<String, Object>) appCompelete.getData();
        returnMaps.put("appCircumstance",appCircumstance);
        restultContent.setStatus(200);
        restultContent.setData(returnMaps);
        return restultContent;
    }


    /**
     * @param cirAndcompeleteJson
     * @return
     */
    @RequestMapping("/getCirAndcompelete")
    @ResponseBody
    public RestultContent getCirAndcompelete(@RequestBody String cirAndcompeleteJson) throws Exception {
        RestultContent cirAndcompelete=getAappCompelete(cirAndcompeleteJson);
        Map<String,Object> returnMap= (Map<String, Object>) cirAndcompelete.getData();
        AppCircumstance appCircumstance = JSONObject.parseObject(cirAndcompeleteJson, AppCircumstance.class);
        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
        AppCircumstanceExample.Criteria criteria = appCircumstanceExample.createCriteria();
        criteria.andAppIdEqualTo(appCircumstance.getAppId()).
                andProcessInstanceIdEqualTo(appCircumstance.getProcessInstanceId());
        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
        restultContent.setStatus(200);
        if (null != returnAppCircumstance && returnAppCircumstance.size() > 0) {
            returnMap.put("appCircumstance",returnAppCircumstance.get(0));
        }else{
            returnMap.put("appCircumstance",null);
        }
        restultContent.setData(returnMap);
        restultContent.setStatus(200);
        return restultContent;


    }


}
