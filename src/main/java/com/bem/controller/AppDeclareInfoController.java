package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppDeclareInfo;
import com.bem.domain.AppDeclareInfoExample;
import com.bem.mapper.AppDeclareInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ：zjd
 * @date ：Created in 2019/3/9 10:26
 * 录入工程信息 竣工报验
 * @modified By：
 */
@Controller
@RequestMapping("/appDeclareInfo")
public class AppDeclareInfoController {

    @Autowired
    private AppDeclareInfoMapper appDeclareInfoMapper;

    /**
     * 得到录入工程信息和竣工报验信息
     * @param appDeclareInfoJson
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAppDeclareInfo")
    @ResponseBody
    public RestultContent getAppDeclareInfo(@RequestBody String appDeclareInfoJson) throws Exception {
        AppDeclareInfo appDeclareInfo = JSONObject.parseObject(appDeclareInfoJson, AppDeclareInfo.class);
        List<AppDeclareInfo> returnAppDeclareInfo = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppDeclareInfoExample appDeclareInfoExample = new AppDeclareInfoExample();
        AppDeclareInfoExample.Criteria criteria = appDeclareInfoExample.createCriteria();
        criteria.andAppIdEqualTo(appDeclareInfo.getAppId());
        returnAppDeclareInfo = appDeclareInfoMapper.selectByExample(appDeclareInfoExample);
        //返回值
        restultContent.setStatus(200);
        if(null!=returnAppDeclareInfo && returnAppDeclareInfo.size()>0){
            restultContent.setData(returnAppDeclareInfo.get(0));
        }
        return restultContent;

    }

    /**
     * @param appDeclareInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appDeclareInfoJson) throws Exception {
        AppDeclareInfo appDeclareInfo = JSONObject.parseObject(appDeclareInfoJson, AppDeclareInfo.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appDeclareInfoMapper.existsWithPrimaryKey(appDeclareInfo);
        if (isExist) {
            appDeclareInfoMapper.updateByPrimaryKeySelective(appDeclareInfo);
        } else {
            appDeclareInfoMapper.insertSelective(appDeclareInfo);
        }
        restultContent.setStatus(200);
        restultContent.setData(appDeclareInfo);
        return restultContent;
    }

}
