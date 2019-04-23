package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.AppMidCheckReport;
import com.bem.domain.AppMidCheckReportExample;
import com.bem.mapper.AppMidCheckReportMapper;
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
    public RestultContent getAppDeclareInfo(@RequestBody String appMidCheckReportJson) throws Exception {
        AppMidCheckReport appMidCheckReport = JSONObject.parseObject(appMidCheckReportJson, AppMidCheckReport.class);
        List<AppMidCheckReport> returnAppDeclareInfo = new ArrayList<>();
        RestultContent restultContent = new RestultContent();
        AppMidCheckReportExample appMidCheckReportExample = new AppMidCheckReportExample();
        AppMidCheckReportExample.Criteria criteria = appMidCheckReportExample.createCriteria();
        criteria.andAppIdEqualTo(appMidCheckReport.getAppId());
        returnAppDeclareInfo = appMidCheckReportMapper.selectByExample(appMidCheckReportExample);
        //返回值
        restultContent.setStatus(200);
        if (null != returnAppDeclareInfo && returnAppDeclareInfo.size() > 0) {
            restultContent.setData(returnAppDeclareInfo.get(0));
        }
        return restultContent;

    }

    /**
     * @param appMidCheckReportJson
     * @return
     * @throws Exception
     */
    @RequestMapping("/save")
    @ResponseBody
    public RestultContent save(@RequestBody String appMidCheckReportJson) throws Exception {
        AppMidCheckReport appMidCheckReport = JSONObject.parseObject(appMidCheckReportJson, AppMidCheckReport.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appMidCheckReportMapper.existsWithPrimaryKey(appMidCheckReport);
        if (isExist) {
            appMidCheckReportMapper.updateByPrimaryKeySelective(appMidCheckReport);
        } else {
            appMidCheckReportMapper.insertSelective(appMidCheckReport);
        }
        restultContent.setStatus(200);
        restultContent.setData(appMidCheckReport);
        return restultContent;
    }
}
