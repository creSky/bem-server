package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppDesignAppraise;
import com.bem.domain.AppDesignAppraiseExample;
import com.bem.domain.AppFile;
import com.bem.domain.AppFileExample;
import com.bem.mapper.AppDesignAppraiseMapper;
import com.bem.mapper.AppFileMapper;
import com.bem.service.AppFileService;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 设计审核
 */
@Controller
@RequestMapping("/appDesignAppraise")
public class AppDesignAppraiseController {
    @Autowired
    private AppDesignAppraiseMapper appDesignAppraiseMapper;
    @Autowired
    private AppFileService appFileService;
    @Autowired
    private AppFileMapper appFileMapper;


    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody(required = false) String appDesignAppraiseJson) {
        //文件上传
        List<AppFile> appFiles = appFileService.upload(appDesignAppraiseJson);

        AppDesignAppraise appDesignAppraise = JSONObject.parseObject(appDesignAppraiseJson, AppDesignAppraise.class);

        boolean isExists = appDesignAppraiseMapper.existsWithPrimaryKey(appDesignAppraise);
        if (isExists) {
            appDesignAppraiseMapper.updateByPrimaryKeySelective(appDesignAppraise);
        } else {
            appDesignAppraiseMapper.insert(appDesignAppraise);
        }


        Map<String, Object> returnMaps = new HashMap<>();

        returnMaps.put("appFiles", appFiles);
        returnMaps.put("appDesignAppraise", appDesignAppraise);

        return new HttpResult(HttpResult.SUCCESS, "保存成功", returnMaps);
    }

    @RequestMapping(value = "/getAppDesignAppraise")
    @ResponseBody
    public HttpResult getAppDesignAppraise(@RequestBody(required = false) String appDesignAppraiseJson) {
        Map<String, Object> returnMap = new HashMap<>();
        AppDesignAppraise appDesignAppraise = JSONObject.parseObject(appDesignAppraiseJson, AppDesignAppraise.class);

        AppDesignAppraiseExample appDesignAppraiseExample = new AppDesignAppraiseExample();
        AppDesignAppraiseExample.Criteria criteria = appDesignAppraiseExample.createCriteria();
        criteria.andTaskIdEqualTo(appDesignAppraise.getTaskId()).andAppIdEqualTo(appDesignAppraise.getAppId());

        List<AppDesignAppraise> appDesignAppraises = appDesignAppraiseMapper.selectByExample(appDesignAppraiseExample);

        if (null != appDesignAppraises && appDesignAppraises.size() > 0) {
            returnMap.put("appDesignAppraise", appDesignAppraises.get(0));
        } else {
            returnMap.put("appDesignAppraise", appDesignAppraise);
        }

        AppFileExample appFileExample = new AppFileExample();
        AppFileExample.Criteria appFileExampleCriteria = appFileExample.createCriteria();
        criteria.andTaskIdEqualTo(appDesignAppraise.getTaskId()).andAppIdEqualTo(appDesignAppraise.getAppId());
        List<AppFile> appFiles = appFileMapper.selectByExample(appFileExample);
        returnMap.put("appFiles", appFiles.size() == 0 ? null : appFiles);

        return new HttpResult(HttpResult.SUCCESS, "查询成功", returnMap);
    }


}
