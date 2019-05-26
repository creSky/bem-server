package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppCircumstance;
import com.bem.domain.AppCircumstanceExample;
import com.bem.domain.AppCompelete;
import com.bem.domain.AppCompeleteExample;
import com.bem.mapper.AppCircumstanceMapper;
import com.bem.mapper.AppCompeleteMapper;
import com.bem.service.ActivitiService;
import com.bem.util.BemCommonUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 竣工验收及装表接电
 */
@Controller
@RequestMapping("/appCompelete")
public class AppCompeleteController {

    @Autowired
    private AppCompeleteMapper appCompeleteMapper;

    @Autowired
    private ActivitiService activitiService;

    /**
     * @param appCompeleteJson
     * @return
     */
    @RequestMapping("/getAappCompelete")
    @ResponseBody
    public RestultContent getAppDispatch(@RequestBody String appCompeleteJson) throws Exception {
        String userId = BemCommonUtil.getOpeartorId(appCompeleteJson);
        AppCompelete appCompelete = JSONObject.parseObject(appCompeleteJson, AppCompelete.class);
        List<AppCompelete> returnAppCompelete = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppCompeleteExample appCompeleteExample = new AppCompeleteExample();
        AppCompeleteExample.Criteria criteria = appCompeleteExample.createCriteria();
        criteria.andAppIdEqualTo(appCompelete.getAppId()).
                andProcessInstanceIdEqualTo(appCompelete.getProcessInstanceId());
        returnAppCompelete = appCompeleteMapper.selectByExample(appCompeleteExample);
        restultContent.setStatus(200);
        if (null != returnAppCompelete && returnAppCompelete.size() > 0) {
            restultContent.setData(returnAppCompelete.get(0));
        }
        return restultContent;

    }

    /**
     * @param appCompeleteJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appCompeleteJson) throws Exception {
        AppCompelete appCompelete = JSONObject.parseObject(appCompeleteJson, AppCompelete.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appCompeleteMapper.existsWithPrimaryKey(appCompelete);
        if (isExist) {
            appCompelete.setSubmitDate(new Date());
            appCompeleteMapper.updateByPrimaryKeySelective(appCompelete);
        } else {
            appCompelete.setSubmitDate(new Date());
            appCompeleteMapper.insertSelective(appCompelete);
        }
        restultContent.setStatus(200);
        restultContent.setData(appCompelete);
        return restultContent;
    }


}
