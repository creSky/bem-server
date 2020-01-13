package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppReplyAdvice;
import com.bem.domain.AppReplyAdviceExample;
import com.bem.domain.AppTransformerInfoExample;
import com.bem.mapper.AppReplyAdviceMapper;
import com.bem.mapper.AppTransformerInfoMapper;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author ：zjd
 * @date ：Created in 2019/3/4 16:10
 * @modified By：
 */
@Controller
@RequestMapping("/appReply")
public class AppReplyController {
    @Autowired
    private AppReplyAdviceMapper appReplyAdviceMapper;

    @Autowired
    private AppTransformerInfoMapper appTransformerInfoMapper;

    @ResponseBody
    @RequestMapping("/getAppRely")
    public HttpResult getAppRely(@RequestBody String appRelyJson) {

        AppReplyAdvice appReplyAdvice = JSONObject.parseObject(appRelyJson, AppReplyAdvice.class);
        //取记录
        AppReplyAdviceExample appReplyAdviceExample = new AppReplyAdviceExample();
        AppReplyAdviceExample.Criteria replayCriteria = appReplyAdviceExample.createCriteria();
        replayCriteria.andAppIdEqualTo(appReplyAdvice.getAppId());
        List<AppReplyAdvice> appReplyAdvices = appReplyAdviceMapper.selectByExample(appReplyAdviceExample);
        if (null != appReplyAdvices && 0 < appReplyAdvices.size()) {
            return new HttpResult<>(HttpResult.SUCCESS, "查询成功",
                    appReplyAdvices.get(0));
        }

        //自动生成审批方案
        StringBuilder passAdviceInfo = new StringBuilder();
        //取变压器信息
        AppTransformerInfoExample appTransformerInfoExample = new AppTransformerInfoExample();
        AppTransformerInfoExample.Criteria transCriteria = appTransformerInfoExample.createCriteria();
        transCriteria.andAppIdEqualTo(appReplyAdvice.getAppId());

        passAdviceInfo.append("　　1、 ");
        appTransformerInfoMapper.selectByExample(appTransformerInfoExample).forEach(n -> {
            passAdviceInfo.append("变压器资产号_" + n.getTransformerNo());
        });

        appReplyAdvice.setReplyAdvice(passAdviceInfo.toString());
        appReplyAdviceMapper.insert(appReplyAdvice);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appReplyAdvice);
    }

    /**
     * 保存审批意见
     *
     * @param appRelyJson
     * @return
     */
    @ResponseBody
    @RequestMapping("/save")
    public HttpResult save(@RequestBody String appRelyJson) {
        AppReplyAdvice appReplyAdvice = JSONObject.parseObject(appRelyJson, AppReplyAdvice.class);
        boolean isExists = appReplyAdviceMapper.existsWithPrimaryKey(appReplyAdvice);
        if (isExists) {
            appReplyAdviceMapper.updateByPrimaryKeySelective(appReplyAdvice);
        } else {
            appReplyAdviceMapper.insertSelective(appReplyAdvice);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appReplyAdvice);
    }
}
