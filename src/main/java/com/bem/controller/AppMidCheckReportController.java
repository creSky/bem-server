package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppMidCheckReport;
import com.bem.domain.AppMidCheckReportExample;
import com.bem.mapper.AppMidCheckReportMapper;
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
 * @date ：Created in 2019/3/11 11:34
 * 中间检查
 * @modified By：
 */
@Controller
@RequestMapping("/appMidCheckReport")
public class AppMidCheckReportController {

    @Autowired
    private AppMidCheckReportMapper appMidCheckReportMapper;

    @RequestMapping("/getAppMidCheckReport")
    @ResponseBody
    public HttpResult getAppDeclareInfo(@RequestBody String appMidCheckReportJson) throws Exception {
        AppMidCheckReport appMidCheckReport = JSONObject.parseObject(appMidCheckReportJson, AppMidCheckReport.class);
        List<AppMidCheckReport> returnAppDeclareInfo = new ArrayList<>();
        HttpResult<AppMidCheckReport> httpResult = new HttpResult();
        AppMidCheckReportExample appMidCheckReportExample = new AppMidCheckReportExample();
        AppMidCheckReportExample.Criteria criteria = appMidCheckReportExample.createCriteria();
        criteria.andAppIdEqualTo(appMidCheckReport.getAppId());
        returnAppDeclareInfo = appMidCheckReportMapper.selectByExample(appMidCheckReportExample);
        //返回值
        httpResult.setStatusCode(HttpResult.SUCCESS);
        if (null != returnAppDeclareInfo && returnAppDeclareInfo.size() > 0) {
            httpResult.setResultData(returnAppDeclareInfo.get(0));
        }else{
            httpResult.setResultData(new AppMidCheckReport());
        }
        httpResult.setMessage("查询成功");
        return httpResult;

    }

    /**
     * @param appMidCheckReportJson
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appMidCheckReportJson) throws Exception {
        AppMidCheckReport appMidCheckReport = JSONObject.parseObject(appMidCheckReportJson, AppMidCheckReport.class);
        boolean isExist = appMidCheckReportMapper.existsWithPrimaryKey(appMidCheckReport);
        if (isExist) {
            appMidCheckReportMapper.updateByPrimaryKeySelective(appMidCheckReport);
        } else {
            appMidCheckReportMapper.insertSelective(appMidCheckReport);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appMidCheckReport);
    }
}
