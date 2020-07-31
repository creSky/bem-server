package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.*;
import com.bem.entity.ChargeParamEntity;
import com.bem.entity.PreChargeEntity;
import com.bem.mapper.AppRefundPreMoneyInfoMapper;
import com.bem.mapper.AppReplyAdviceMapper;
import com.bem.mapper.AppSettlementInfoMapper;
import com.bem.mapper.AppTransformerInfoMapper;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @author ：zjd
 * @date ：Created in 2020年6月5日19:30:34
 * @modified By：预存退款
 */
@Controller
@RequestMapping("/appRefundPreMoney")
public class AppRefundPreMoneyController {
    @Autowired
    private AppRefundPreMoneyInfoMapper appRefundPreMoneyInfoMapper;
    @Autowired
    private AppSettlementInfoMapper appSettlementInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/getAppRefundPreMoney")
    public HttpResult getAppRefundPreMoney(@RequestBody String appRefundPreMoneyJson) {

        JSONObject jsonObject = JSONObject.parseObject(appRefundPreMoneyJson);
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        String taskId = jsonObject.getString("taskId");
        String appId = jsonObject.getString("appId");

        AppRefundPreMoneyInfoExample appRefundPreMoneyInfoExample =
                new AppRefundPreMoneyInfoExample();
        com.bem.domain.AppRefundPreMoneyInfoExample.Criteria appRefundPreMoneyInfoExampleCriteria =
                appRefundPreMoneyInfoExample.createCriteria();
        appRefundPreMoneyInfoExampleCriteria.andAppIdEqualTo(appId).andTaskIdEqualTo(taskId)
                .andProcessInstanceIdEqualTo(processInstanceId);
        List<AppRefundPreMoneyInfo> appRefundPreMoneyInfos =
                appRefundPreMoneyInfoMapper.selectByExample(appRefundPreMoneyInfoExample);

        if(appRefundPreMoneyInfos!=null&&appRefundPreMoneyInfos.size()==1){
            return new HttpResult(HttpResult.SUCCESS,
                    "查询成功",appRefundPreMoneyInfos.get(0));
        }

        AppSettlementInfo paramAppSettlement=new AppSettlementInfo();

        //取记录
        paramAppSettlement.setId(Long.valueOf(appId));

        AppSettlementInfo returnAppSettlementInfo =
                appSettlementInfoMapper.selectOne(paramAppSettlement);

        if (null == returnAppSettlementInfo) {
            return new HttpResult<>(HttpResult.ERROR, "无此类数据");
        }
        jsonObject.clear();
        jsonObject.put("settlementId",
                returnAppSettlementInfo.getSettlementId());
        String resultPreCharge = restTemplate.postForObject
                (PropertiesUtil.getValue("findPreChargeSelect"), jsonObject, String.class);

        List<PreChargeEntity> preChargeEntities=
                JSONObject.parseArray(resultPreCharge,PreChargeEntity.class);

        if(preChargeEntities==null || preChargeEntities.size()>1){
            return new HttpResult<>(HttpResult.ERROR, "结算户不存在余额或多条余额记录");
        }

        AppRefundPreMoneyInfo appRefundPreMoneyInfo=new AppRefundPreMoneyInfo();
        appRefundPreMoneyInfo.setAppId(appId);
        appRefundPreMoneyInfo.setTaskId(taskId);
        appRefundPreMoneyInfo.setProcessInstanceId(processInstanceId);
        appRefundPreMoneyInfo.setSettlementId(returnAppSettlementInfo.getSettlementId());
        appRefundPreMoneyInfo.setSettlementNo(returnAppSettlementInfo.getSettlementNo());
        appRefundPreMoneyInfo.setSettlementName(returnAppSettlementInfo.getSettlementName());
        appRefundPreMoneyInfo.setApplyDate(returnAppSettlementInfo.getApplyDate());
        appRefundPreMoneyInfo.setApplyMan(returnAppSettlementInfo.getApplyManId());
        appRefundPreMoneyInfo.setBackType(1);
        appRefundPreMoneyInfo.setfChargeMode(1);
        appRefundPreMoneyInfo.setPreCharge(preChargeEntities.get(0).getBalance());
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appRefundPreMoneyInfo);
    }

    @ResponseBody
    @RequestMapping("/getPassAppRefundPreMoney")
    public HttpResult getPassAppRefundPreMoney(@RequestBody String appRefundPreMoneyJson) {

        JSONObject jsonObject = JSONObject.parseObject(appRefundPreMoneyJson);
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        String taskId = jsonObject.getString("taskId");
        String appId = jsonObject.getString("appId");

        AppRefundPreMoneyInfoExample appRefundPreMoneyInfoExample =
                new AppRefundPreMoneyInfoExample();
        com.bem.domain.AppRefundPreMoneyInfoExample.Criteria appRefundPreMoneyInfoExampleCriteria =
                appRefundPreMoneyInfoExample.createCriteria();
        appRefundPreMoneyInfoExampleCriteria.andAppIdEqualTo(appId).andProcessInstanceIdEqualTo(processInstanceId);
        List<AppRefundPreMoneyInfo> appRefundPreMoneyInfos =
                appRefundPreMoneyInfoMapper.selectByExample(appRefundPreMoneyInfoExample);

        if(appRefundPreMoneyInfos==null||appRefundPreMoneyInfos.size()!=1){
            return new HttpResult(HttpResult.ERROR,"退款登记记录错误");
        }
        AppRefundPreMoneyInfo appRefundPreMoneyInfo=
                appRefundPreMoneyInfos.get(0);

        if (appRefundPreMoneyInfo.getPassMan()==null){
            appRefundPreMoneyInfo.setPassMan(jsonObject.getInteger("managerId"));
            appRefundPreMoneyInfo.setPassDate(new Date());
            appRefundPreMoneyInfo.setPassOption(1);
        }

        return new HttpResult(HttpResult.SUCCESS,"查询成功",appRefundPreMoneyInfo);
    }


    /**
     * 保存记录和审批意见
     *
     * @param appRefundPreMoneyJson
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveAppRefundPreMoney")
    public HttpResult saveAppRefundPreMoney(@RequestBody String appRefundPreMoneyJson) {
        AppRefundPreMoneyInfo appRefundPreMoneyInfo=
                JSONObject.parseObject(appRefundPreMoneyJson, AppRefundPreMoneyInfo.class);
        boolean isExists = appRefundPreMoneyInfoMapper.existsWithPrimaryKey(appRefundPreMoneyInfo);
        if (isExists) {
            appRefundPreMoneyInfoMapper.updateByPrimaryKeySelective(appRefundPreMoneyInfo);
        } else {
            appRefundPreMoneyInfoMapper.insertSelective(appRefundPreMoneyInfo);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appRefundPreMoneyInfo);
    }

    /**
     * 缴费
     *
     * @param appRefundPreMoneyJson
     * @return
     */
    @ResponseBody
    @RequestMapping("/appRefundPreMoneyPay")
    public HttpResult appRefundPreMoneyPay(@RequestBody String appRefundPreMoneyJson) {
        JSONObject paramJsonObject =
                JSONObject.parseObject(appRefundPreMoneyJson);

        AppRefundPreMoneyInfo appRefundPreMoneyInfo=
                JSONObject.parseObject(appRefundPreMoneyJson, AppRefundPreMoneyInfo.class);
        if(appRefundPreMoneyInfo.getIsPay()!=null && appRefundPreMoneyInfo.getIsPay()==1){
            return new HttpResult<>(HttpResult.ERROR, "该用户已交完费，请勿重复操作");
        }

        ChargeParamEntity chargeParamEntity=new ChargeParamEntity();
        chargeParamEntity.setArrearageDetails(null);
        chargeParamEntity.setSettleMentNo(appRefundPreMoneyInfo.getSettlementNo());
        chargeParamEntity.setfChargeMode(appRefundPreMoneyInfo.getfChargeMode());
        chargeParamEntity.setShouldMoney(BigDecimal.ZERO);
        chargeParamEntity.setFactMoney(appRefundPreMoneyInfo.getBackMoney());
        chargeParamEntity.setFactChange(BigDecimal.ZERO);
        chargeParamEntity.setBalance(appRefundPreMoneyInfo.getBackMoney());
        chargeParamEntity.setYcys(BigDecimal.ZERO);
        JSONObject jsonObject=new JSONObject();
        jsonObject.put("countData",chargeParamEntity);
        jsonObject.put("managerId",paramJsonObject.getInteger("managerId"));
        String resultPreCharge = restTemplate.postForObject
                (PropertiesUtil.getValue("charge"), jsonObject, String.class);

        HttpResult httpResult=JSONObject.parseObject(resultPreCharge,
                HttpResult.class);

        if(httpResult.getStatusCode()!=HttpResult.SUCCESS){
            return new HttpResult<>(HttpResult.ERROR, "缴费失败");
        }

        appRefundPreMoneyInfo.setIsPay(1);
        appRefundPreMoneyInfoMapper.updateByPrimaryKey(appRefundPreMoneyInfo);

        return new HttpResult<>(HttpResult.SUCCESS, "缴费成功",
                appRefundPreMoneyInfo);
    }
}
