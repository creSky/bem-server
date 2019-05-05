package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppDispatch;
import com.bem.domain.AppDispatchExample;
import com.bem.mapper.AppDispatchMapper;
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
 * 勘察派工
 */
@Controller
@RequestMapping("/appDispatch")
public class AppDispatchController {

    @Autowired
    private AppDispatchMapper appDispatchMapper;

    @Autowired
    private ActivitiService activitiService;

    /**
     * @param appDispatchJson
     * @return
     */
    @RequestMapping("/getAppDispatch")
    @ResponseBody
    public RestultContent getAppDispatch(@RequestBody String appDispatchJson) throws Exception {
        String userId=BemCommonUtil.getOpeartorId(appDispatchJson);
        AppDispatch appDispatch = JSONObject.parseObject(appDispatchJson, AppDispatch.class);
        List<AppDispatch> returnAppDispatch = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppDispatchExample appDispatchExample = new AppDispatchExample();
        AppDispatchExample.Criteria criteria = appDispatchExample.createCriteria();
             criteria.andAppIdEqualTo(appDispatch.getAppId()).
                     andProcessInstanceIdEqualTo(appDispatch.getProcessInstanceId());
        returnAppDispatch = appDispatchMapper.selectByExample(appDispatchExample);
        restultContent.setStatus(200);
        if(null!=returnAppDispatch && returnAppDispatch.size()>0){
            restultContent.setData(returnAppDispatch.get(0));
        }
        return restultContent;

    }

    /**
     * @param appDispatchJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appDispatchJson) throws Exception {
        AppDispatch appDispatch = JSONObject.parseObject(appDispatchJson, AppDispatch.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appDispatchMapper.existsWithPrimaryKey(appDispatch);
        appDispatch.setCreateDate(new Date());
        appDispatch.setCreateMan(new Integer(BemCommonUtil.getOpeartorId(appDispatchJson)));
        if (isExist) {
            appDispatchMapper.updateByPrimaryKeySelective(appDispatch);
        } else {
            appDispatchMapper.insertSelective(appDispatch);
        }
        restultContent.setStatus(200);
        restultContent.setData(appDispatch);
        return restultContent;
    }


}
