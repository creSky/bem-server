package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppMeterInfo;
import com.bem.domain.AppPassAdvice;
import com.bem.domain.AppPassAdviceExample;
import com.bem.domain.AppUserInfo;
import com.bem.mapper.AppMeterInfoMapper;
import com.bem.mapper.AppPassAdviceMapper;
import com.bem.mapper.AppUserInfoMapper;
import com.bem.service.ActivitiService;
import com.bem.util.BemCommonUtil;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 修改计量点信息
 */
@Controller
@RequestMapping("/appMeterInfo")
public class AppMeterInfoController {

    @Autowired
    private AppMeterInfoMapper appMeterInfoMapper;

    @Autowired
    private AppUserInfoMapper appUserInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param meterInfoJson
     * @return
     */
    @RequestMapping("/getMeterInfo")
    @ResponseBody
    public HttpResult getMeterInfo(@RequestBody String meterInfoJson) throws Exception {
        //先从流程库差 若流程库没有 则去档案查询计量点信息
        Long appId =JSONObject.parseObject(meterInfoJson).getLong("id");
        AppMeterInfo paramAppMeter=new AppMeterInfo();
        paramAppMeter.setAppId(appId);
        List<AppMeterInfo> appMeterInfosByBem=
                appMeterInfoMapper.select(paramAppMeter);

        if(appMeterInfosByBem==null || appMeterInfosByBem.size()<1){
            AppUserInfo appUserInfo=new AppUserInfo();
            appUserInfo.setId(appId);
            AppUserInfo returnAppBaseInfo=
                    appUserInfoMapper.selectByPrimaryKey(appUserInfo);
            if (returnAppBaseInfo==null){
                return new HttpResult(HttpResult.ERROR,"查询不到此流程",null);
            }
            //从档案查询
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("userId",returnAppBaseInfo.getUserId());
            String meterJsons =
                    restTemplate.postForObject(PropertiesUtil.getValue("getMeterByWhere"), jsonObject, String.class);

            List<AppMeterInfo> appMeterInfosByCim=
                    JSONObject.parseArray(JSONObject.parseObject(meterJsons).get("list").toString(), AppMeterInfo.class);

            appMeterInfosByCim.forEach(t->{
                t.setMeterId(t.getId());
                t.setId(null);
                jsonObject.clear();
                jsonObject.put("id",t.getWriteSectionId());
                //查询抄表区段名称
                String writeSectJson=
                        restTemplate.postForObject(PropertiesUtil.getValue("getWriteSectByKey"), jsonObject, String.class);
                t.setWriteSectName(JSONObject.parseObject(writeSectJson).getString("writeSectName"));
                jsonObject.clear();
                jsonObject.put("id",t.getUserId());
                //查询用户号
                String userJson=
                        restTemplate.postForObject(PropertiesUtil.getValue("getUserByKey"), jsonObject, String.class);
                t.setUserNo(JSONObject.parseObject(userJson).getString("userNo"));
                t.setTemplateId(returnAppBaseInfo.getTemplateId());
            });
            return new HttpResult(HttpResult.SUCCESS,"查询成功",appMeterInfosByCim);
        }

       return new HttpResult(HttpResult.SUCCESS,"查询成功",appMeterInfosByBem);

    }

    /**
     * @param meterInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String meterInfoJson) throws Exception {
        AppMeterInfo appMeterInfos =JSONObject.parseObject(meterInfoJson, AppMeterInfo.class);
        boolean isExist = appMeterInfoMapper.existsWithPrimaryKey(appMeterInfos);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("id",appMeterInfos.getWriteSectionId());
        String writeSectJson=
                restTemplate.postForObject(PropertiesUtil.getValue("getWriteSectByKey"), jsonObject, String.class);
        appMeterInfos.setWriteSectName(JSONObject.parseObject(writeSectJson).getString("writeSectName"));
        jsonObject.clear();
        jsonObject.put("id",appMeterInfos.getUserId());
        //查询用户号
        String userJson=
                restTemplate.postForObject(PropertiesUtil.getValue("getUserByKey"), jsonObject, String.class);
        appMeterInfos.setUserNo(JSONObject.parseObject(userJson).getString("userNo"));
        if (isExist) {
            appMeterInfoMapper.updateByPrimaryKeySelective(appMeterInfos);
        } else {
            appMeterInfoMapper.insertSelective(appMeterInfos);
        }

        return new HttpResult(HttpResult.SUCCESS, "保存成功", appMeterInfos);
    }


}
