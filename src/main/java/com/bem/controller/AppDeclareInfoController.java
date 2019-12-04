package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppDeclareInfo;
import com.bem.domain.AppDeclareInfoExample;
import com.bem.mapper.AppDeclareInfoMapper;
import com.riozenc.titanTool.spring.web.http.HttpResult;
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
     *
     * @param appDeclareInfoJson
     * @return
     * @throws Exception
     */
    @RequestMapping("/getAppDeclareInfo")
    @ResponseBody
    public HttpResult getAppDeclareInfo(@RequestBody String appDeclareInfoJson) throws Exception {
        AppDeclareInfo appDeclareInfo = JSONObject.parseObject(appDeclareInfoJson, AppDeclareInfo.class);
        List<AppDeclareInfo> returnAppDeclareInfo = new ArrayList<>();
        HttpResult httpResult = new HttpResult();
        AppDeclareInfoExample appDeclareInfoExample = new AppDeclareInfoExample();
        AppDeclareInfoExample.Criteria criteria = appDeclareInfoExample.createCriteria();
        criteria.andAppIdEqualTo(appDeclareInfo.getAppId());
        returnAppDeclareInfo = appDeclareInfoMapper.selectByExample(appDeclareInfoExample);
        //返回值
        httpResult.setStatusCode(HttpResult.SUCCESS);
        if (null != returnAppDeclareInfo && returnAppDeclareInfo.size() > 0) {
            httpResult.setResultData(returnAppDeclareInfo.get(0));
        }
        httpResult.setMessage("查询成功");
        return httpResult;

    }

    /**
     * @param appDeclareInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appDeclareInfoJson) throws Exception {
        AppDeclareInfo appDeclareInfo = JSONObject.parseObject(appDeclareInfoJson, AppDeclareInfo.class);
        boolean isExist = appDeclareInfoMapper.existsWithPrimaryKey(appDeclareInfo);
        if (isExist) {
            appDeclareInfoMapper.updateByPrimaryKeySelective(appDeclareInfo);
        } else {
            appDeclareInfoMapper.insertSelective(appDeclareInfo);
        }
        return new HttpResult(HttpResult.SUCCESS, "保存成功", appDeclareInfo);
    }

}
