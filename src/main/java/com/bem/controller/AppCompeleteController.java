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
    @RequestMapping("/getAppCompelete")
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
        if (null != returnAppCompelete && returnAppCompelete.size() > 0) {
            returnMap.put("appCompelete", returnAppCompelete.get(0));
        } else {
            returnMap.put("appCompelete", appCompelete);
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
        appCompelete.setSubmitDate(new Date());
        appCompelete.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(appCompeleteJson)));
        if (isExist) {
            appCompeleteMapper.updateByPrimaryKey(appCompelete);
        } else {
            appCompelete.setCreateDate(new Date());
            appCompeleteMapper.insertSelective(appCompelete);
        }
        Map<String, Object> returnMaps = new HashMap<>();

        returnMaps.put("appFiles", appFiles);
        returnMaps.put("appCompelete", appCompelete);

        restultContent.setStatus(200);
        restultContent.setData(returnMaps);
        return restultContent;
    }




}
