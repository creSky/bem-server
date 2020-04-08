package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.entity.AppMeterAssetsEntity;
import com.bem.domain.AppPowerRecall;
import com.bem.mapper.AppPowerRecallMapper;
import com.bem.util.BemCommonUtil;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;

@Controller
@RequestMapping(value = "/appPowerRecall")
public class AppPowerRecallController {
    @Autowired
    private AppPowerRecallMapper appPowerRecallMapper;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/generatorPowerRecall")
    @ResponseBody
    @Transactional
    public HttpResult generatorPowerRecall(@RequestBody String appPowerRecallsJson) {
        JSONObject jsonObject = JSONObject.parseObject(appPowerRecallsJson);
        List<AppPowerRecall> appPowerAssetsList =
                JSONObject.parseArray(jsonObject.getString("meterData"),
                        AppPowerRecall.class);
        String appId = jsonObject.getString("appId");
        Integer taskId = jsonObject.getInteger("taskId");
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        String applyReason = jsonObject.getString("applyReason");
        List<AppPowerRecall> returnAppPowerRecall = new ArrayList<>();
        for (AppPowerRecall appPowerRecall : appPowerAssetsList) {
            //检验是否存在
            AppPowerRecall powerRecallExists = new AppPowerRecall();
            powerRecallExists.setAppId(appId);
            powerRecallExists.setTaskId(taskId);
            powerRecallExists.setProcessInstanceId(processInstanceId);
            powerRecallExists.setMeterId(appPowerRecall.getMeterId());
            powerRecallExists.setMeterAssetsId(appPowerRecall.getMeterAssetsId());
            powerRecallExists.setFunctionCode(appPowerRecall.getFunctionCode());
            List<AppPowerRecall> powerRecallsExistsList =
                    appPowerRecallMapper.select(powerRecallExists);
            if (powerRecallsExistsList != null && powerRecallsExistsList.size() > 0) {
                appPowerRecallMapper.delete(powerRecallExists);
            }
            appPowerRecall.setId(null);
            appPowerRecall.setAppId(appId);
            appPowerRecall.setTaskId(taskId);
            appPowerRecall.setProcessInstanceId(processInstanceId);
            appPowerRecall.setApplyReason(applyReason);
            appPowerRecall.setApplyDate(new Date());
            appPowerRecallMapper.insert(appPowerRecall);
            returnAppPowerRecall.add(appPowerRecall);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "增加退补记录成功", returnAppPowerRecall);
    }

    @RequestMapping(value = "/update")
    @ResponseBody
    public HttpResult update(@RequestBody String appPowerRecallsJson) {
        JSONObject jsonObject = JSONObject.parseObject(appPowerRecallsJson);
        List<AppPowerRecall> appPowerAssetsList =
                JSONObject.parseArray(jsonObject.getString("meterData"),
                        AppPowerRecall.class);
        for (AppPowerRecall appPowerRecall : appPowerAssetsList) {
            appPowerRecall.setApplyPerson(BemCommonUtil.getOpeartorId(appPowerRecallsJson));
            appPowerRecallMapper.updateByPrimaryKey(appPowerRecall);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "退补记录修改成功",
                appPowerAssetsList);
    }


    @RequestMapping(value = "/findAppPowerRecall")
    @ResponseBody
    public HttpResult findAppPowerRecall(@RequestBody String appPowerRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appPowerRecallJson);
            String appId = jsonObject.getString("appId");
        Integer taskId = jsonObject.getInteger("taskId");
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        AppPowerRecall powerRecallExists = new AppPowerRecall();
        powerRecallExists.setAppId(appId);
        powerRecallExists.setTaskId(taskId);
        powerRecallExists.setProcessInstanceId(processInstanceId);
        List<AppPowerRecall> powerRecallsExistsList =
                appPowerRecallMapper.select(powerRecallExists);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", powerRecallsExistsList);
    }

    @RequestMapping(value = "/findMeterAssetsByUser")
    @ResponseBody
    public HttpResult findMeterAssetsByUser(@RequestBody String userNoJson) {
        JSONObject postData = JSONObject.parseObject(userNoJson);
        Map<String, String> maps = new HashMap<>();
        maps.put("userNo", postData.getString("userNo"));
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getAssetsByUser"), maps, String.class);
        List<AppPowerRecall> cimAppMeterAssets =
                JSONObject.parseArray(result, AppPowerRecall.class);
        for (AppPowerRecall appPowerRecall : cimAppMeterAssets) {
            appPowerRecall.setId(null);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", cimAppMeterAssets);
    }
}
