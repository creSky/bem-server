package com.bem.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.bem.domain.*;
import com.bem.entity.MeterMoneyMogoEntity;
import com.bem.entity.UserMongoEntity;
import com.bem.entity.WriteSectMongoEntity;
import com.bem.mapper.AppMoneyRecallMapper;
import com.bem.mapper.AppPowerRecallMapper;
import com.bem.mapper.AppUserInfoMapper;
import com.bem.util.BemCommonUtil;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

@Controller
@RequestMapping(value = "/appMoneyRecall")
public class AppMoneyRecallController {
    @Autowired
    private AppMoneyRecallMapper appMoneyRecallMapper;

    @Autowired
    private RestTemplate restTemplate;

    @Autowired
    private AppUserInfoMapper appUserInfoMapper;

    @RequestMapping(value = "/generatorMoneyRecall")
    @ResponseBody
    public HttpResult generatorMoneyRecall(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appMoneyRecallJson);
        List<AppMoneyRecall> appAppMoneyList =
                JSONObject.parseArray(jsonObject.getString("meterData"), AppMoneyRecall.class);
        String appId = jsonObject.getString("appId");
        Integer taskId = jsonObject.getInteger("taskId");
        Integer rpMon = jsonObject.getInteger("rpMon");
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        String applyReason = jsonObject.getString("applyReason");
        List<AppMoneyRecall> returnAppMoneyRecall = new ArrayList<>();
        for (AppMoneyRecall appMoneyRecall : appAppMoneyList) {
            //检验是否存在
            AppMoneyRecall moneyRecallExists = new AppMoneyRecall();
            moneyRecallExists.setAppId(appId);
            moneyRecallExists.setTaskId(taskId);
            moneyRecallExists.setProcessInstanceId(processInstanceId);
            moneyRecallExists.setMeterId(appMoneyRecall.getMeterId());
            moneyRecallExists.setRpMon(appMoneyRecall.getRpMon());
            moneyRecallExists.setRpMonSn(appMoneyRecall.getRpMonSn());
            List<AppMoneyRecall> powerRecallsExistsList =
                    appMoneyRecallMapper.select(moneyRecallExists);
            if (powerRecallsExistsList != null && powerRecallsExistsList.size() > 0) {
                appMoneyRecallMapper.delete(moneyRecallExists);
            }
            appMoneyRecall.setId(null);
            appMoneyRecall.setAppId(appId);
            appMoneyRecall.setTaskId(taskId);
            appMoneyRecall.setProcessInstanceId(processInstanceId);
            appMoneyRecall.setApplyReason(applyReason);
            appMoneyRecall.setApplyDate(new Date());
            appMoneyRecall.setRpMon(rpMon);
            appMoneyRecallMapper.insert(appMoneyRecall);
            returnAppMoneyRecall.add(appMoneyRecall);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "增加退补记录成功", returnAppMoneyRecall);
    }

    @RequestMapping(value = "/updateAppMoneyRecall")
    @ResponseBody
    public HttpResult update(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appMoneyRecallJson);
        List<AppMoneyRecall> appMoneyAssetsList =
                JSONObject.parseArray(jsonObject.getString("meterData"),
                        AppMoneyRecall.class);
        for (AppMoneyRecall appMoneyRecall : appMoneyAssetsList) {
            if (appMoneyRecall.getRpMode() == null || (
                    !appMoneyRecall.getRpMode().equals(1) && !appMoneyRecall.getRpMode().equals(2))) {
                return new HttpResult<>(HttpResult.ERROR, "请选择正确的退补类别",
                        appMoneyAssetsList);
            }
            appMoneyRecall.setApplyPerson(BemCommonUtil.getOpeartorId(appMoneyRecallJson));
            BigDecimal totalMoney =
                    (appMoneyRecall.getVolumeCharge() == null ? BigDecimal.ZERO : appMoneyRecall.getVolumeCharge())
                            .add(appMoneyRecall.getBasicMoney() == null ? BigDecimal.ZERO : appMoneyRecall.getBasicMoney())
                            .add(appMoneyRecall.getPowerRateMoney() == null ? BigDecimal.ZERO : appMoneyRecall.getPowerRateMoney())
                            .add(appMoneyRecall.getAddMoney1() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney1())
                            .add(appMoneyRecall.getAddMoney2() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney2())
                            .add(appMoneyRecall.getAddMoney3() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney3())
                            .add(appMoneyRecall.getAddMoney4() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney4())
                            .add(appMoneyRecall.getAddMoney5() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney5())
                            .add(appMoneyRecall.getAddMoney6() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney6())
                            .add(appMoneyRecall.getAddMoney7() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney7())
                            .add(appMoneyRecall.getAddMoney8() == null ? BigDecimal.ZERO : appMoneyRecall.getAddMoney8());

            appMoneyRecall.setTotalMoney(totalMoney);
            appMoneyRecallMapper.updateByPrimaryKey(appMoneyRecall);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "退补记录修改成功",
                appMoneyAssetsList);
    }

    @RequestMapping(value = "/deleteAppMoneyRecall")
    @ResponseBody
    public HttpResult deleteAppMoneyRecall(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appMoneyRecallJson);
        List<AppMoneyRecall> appMoneyAssetsList =
                JSONObject.parseArray(jsonObject.getString("meterData"),
                        AppMoneyRecall.class);
        for (AppMoneyRecall appMoneyRecall : appMoneyAssetsList) {
            appMoneyRecallMapper.deleteByPrimaryKey(appMoneyRecall);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "退补记录删除成功", null);
    }

    @RequestMapping(value = "/updateMoneyRecallPass")
    @ResponseBody
    public HttpResult updateMoneyRecallPass(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appMoneyRecallJson);
        String appId = jsonObject.getString("appId");
        Long processInstanceId = jsonObject.getLong("processInstanceId");

        JSONObject approvalForm =
                JSONObject.parseObject(jsonObject.getString("approvalForm"));
        Integer passResult = approvalForm.getInteger("passResult");
        String passReason = approvalForm.getString("passReason");
        AppMoneyRecall appMoneyRecall = new AppMoneyRecall();
        appMoneyRecall.setAppId(appId);
        appMoneyRecall.setProcessInstanceId(processInstanceId);
        List<AppMoneyRecall> appMoneyAssetsList = appMoneyRecallMapper.select(appMoneyRecall);
        for (AppMoneyRecall t : appMoneyAssetsList) {
            t.setPassPerson(BemCommonUtil.getOpeartorId(appMoneyRecallJson));
            t.setPassDate(new Date());
            t.setPassReason(passReason);
            t.setPassResult(passResult);
            appMoneyRecallMapper.updateByPrimaryKey(t);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "退补记录审批成功",
                appMoneyAssetsList);
    }


    @RequestMapping(value = "/findAppMoneyRecall")
    @ResponseBody
    public HttpResult findAppMoneyRecall(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject = JSONObject.parseObject(appMoneyRecallJson);
        List<AppMoneyRecall> appAppMoneyList =
                JSONObject.parseArray(jsonObject.getString("meterData"),
                        AppMoneyRecall.class);
        String appId = jsonObject.getString("appId");
        Integer taskId = jsonObject.getInteger("taskId");
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        AppMoneyRecall appMoneyRecall = new AppMoneyRecall();
        appMoneyRecall.setAppId(appId);
        appMoneyRecall.setProcessInstanceId(processInstanceId);
        appMoneyRecall.setTaskId(taskId);
        List<AppMoneyRecall> appMoneyRecalls =
                appMoneyRecallMapper.select(appMoneyRecall);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appMoneyRecalls);
    }

    @RequestMapping(value = "/findMeterByUser")
    @ResponseBody
    public HttpResult findMeterAssetsByUser(@RequestBody String userNoJson) {
        JSONObject userJsonData = JSONObject.parseObject(userNoJson);
        Long processInstanceId = userJsonData.getLong("processInstanceId");
        JSONObject postData = new JSONObject();
        //获取用户id
        AppUserInfoExample appUserInfoExample = new AppUserInfoExample();
        AppUserInfoExample.Criteria criteria =
                appUserInfoExample.createCriteria();
        criteria.andProcInstIdEqualTo(processInstanceId.toString());
        List<AppUserInfo> appUserInfoList =
                appUserInfoMapper.selectByExample(appUserInfoExample);
        if (appUserInfoList == null || appUserInfoList.size() != 1) {
            return new HttpResult<>(HttpResult.ERROR, "该环节流程实例号传递出错");
        }

        AppUserInfo appUserInfo =
                appUserInfoMapper.selectByExample(appUserInfoExample).get(0);


        //根据用户id获取当月表中的记录
        postData.clear();
        postData.put("id", appUserInfo.getUserId());
        postData.put("mon", userJsonData.getInteger("rpMon"));
        //不分页
        postData.put("pageSize", "-1");
        String resultUsers = restTemplate.postForObject
                (PropertiesUtil.getValue("findUserMongoByWhere"), postData, String.class);

        List<UserMongoEntity> userMongoEntities =
                JSONObject.parseArray(JSONObject.parseObject(resultUsers).getString("list"),
                        UserMongoEntity.class);

        if (userMongoEntities == null || userMongoEntities.size() != 1) {
            return new HttpResult<>(HttpResult.ERROR, "查询失败:所选用户在该月份没有档案");
        }

        UserMongoEntity userMongoEntity = userMongoEntities.get(0);


        //根据抄表区段Id查询抄表区段的信息
        postData.clear();
        postData.put("id", userMongoEntity.getWriteSectId());
        postData.put("mon", userJsonData.getInteger("rpMon"));
        String resultWriteSect = restTemplate.postForObject
                (PropertiesUtil.getValue("getWriteSect"), postData, String.class);
        List<WriteSectMongoEntity> writeSectMongoEntities =
                JSONObject.parseArray(JSONObject.parseObject(resultWriteSect).getString("list"),
                        WriteSectMongoEntity.class);

        if (writeSectMongoEntities == null || writeSectMongoEntities.size() != 1) {
            return new HttpResult<>(HttpResult.ERROR, "查询失败:所选用户在该月份没有抄表区段");
        }

        WriteSectMongoEntity writeSectMongoEntity = writeSectMongoEntities.get(0);
        userMongoEntity.setWriteSectName(writeSectMongoEntity.getWriteSectName());
        userMongoEntity.setWriteSectNo(writeSectMongoEntity.getWriteSectNo());


        //根据用户id 查询计量点当月表记录
        postData.clear();
        postData.put("userId", userMongoEntity.getId());
        postData.put("mon", userJsonData.getInteger("rpMon"));
        //不分页
        postData.put("pageSize", "-1");
        String resultMeters = restTemplate.postForObject
                (PropertiesUtil.getValue("findMeterMongoByWhere"), postData, String.class);

        List<MeterInfo> meterMongoEntities = JSONObject.parseArray(JSONObject.parseObject(resultMeters).getString("list"),
                MeterInfo.class);

        if (meterMongoEntities == null || meterMongoEntities.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "查询失败:所选用户在该月份没有计量点档案");
        }

        //形成退补电费表结构
        //遍历当月电费 补全其中的计量点信息 因为一个计量点可能呢生成多个电费

        List<AppMoneyRecall> appMoneyRecalls = new ArrayList<>();
        List<String> meterInfoIds = new ArrayList<>();
        for (MeterInfo meterInfo : meterMongoEntities) {
            //根据用户计量点id 查询当月电费
            postData.clear();
            postData.put("meterId", meterInfo.getId());
            postData.put("mon", userJsonData.getInteger("rpMon"));
            //不分页
            postData.put("pageSize", "-1");
            String resultMeterMoneys = restTemplate.postForObject
                    (PropertiesUtil.getValue("findMeterMoneyMongo"), postData, String.class);

            List<MeterMoneyMogoEntity> meterMoneyMogoEntities = JSONObject.parseArray(resultMeterMoneys,
                    MeterMoneyMogoEntity.class);

            if (meterMoneyMogoEntities == null || meterMoneyMogoEntities.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "查询失败:所选用户在该月份没产生电费");
            }
            meterInfoIds.add(meterInfo.getId().toString());
            String resultSettlements = restTemplate.postForObject
                    (PropertiesUtil.getValue("getSettlementByMeterIds"), meterInfoIds, String.class);

            List<Long> settlementIds = JSONObject.parseArray(resultSettlements,
                    Long.class);

            if (settlementIds == null || settlementIds.size() != 1) {
                return new HttpResult<>(HttpResult.ERROR,
                        "该计量点没有对应的结算户或者结算户不止一个");
            }

            for (MeterMoneyMogoEntity meterMoneyMogoEntity : meterMoneyMogoEntities) {
                //判断计量点所在结算户有无余额

                Map<String, BigDecimal> surchargeDetail =
                        meterMoneyMogoEntity.getSurchargeDetail();// 附加费
                AppMoneyRecall appMoneyRecall = new AppMoneyRecall();
                appMoneyRecall.setRpMon(userJsonData.getInteger("rpMon"));
                appMoneyRecall.setSettlementId(settlementIds.get(0));
                appMoneyRecall.setMeterId(meterInfo.getId());
                appMoneyRecall.setBaseMoneyFlag(meterInfo.getBaseMoneyFlag());
                appMoneyRecall.setUserId(userMongoEntity.getId());
                appMoneyRecall.setUserName(userMongoEntity.getUserName());
                appMoneyRecall.setUserNo(userMongoEntity.getUserNo());
                appMoneyRecall.setCosType(meterInfo.getCosType());
                appMoneyRecall.setElecTypeCode(meterInfo.getElecTypeCode());
                appMoneyRecall.setTsFlag(meterInfo.getTsType());
                appMoneyRecall.setRpMonSn((short) (meterMoneyMogoEntity.getSn()));
                appMoneyRecall.setTotalPower(meterMoneyMogoEntity.getTotalPower());
                appMoneyRecall.setTotalMoney(meterMoneyMogoEntity.getAmount());
                appMoneyRecall.setPriceType((short) meterInfo.getPriceType());
                appMoneyRecall.setWriteSectId(userMongoEntity.getWriteSectId());
                appMoneyRecall.setWriteSectName(userMongoEntity.getWriteSectName());
                appMoneyRecall.setWriteSectNo(userMongoEntity.getWriteSectNo());
                appMoneyRecall.setUserId(userMongoEntity.getId());
                appMoneyRecall.setUserNo(userMongoEntity.getUserNo());
                appMoneyRecall.setUserName(userMongoEntity.getUserName());
                appMoneyRecall.setMeterNo(meterInfo.getMeterNo());
                appMoneyRecall.setMeterId(meterInfo.getId());
                appMoneyRecall.setMeterName(meterInfo.getMeterName());
                appMoneyRecall.setVolumeCharge(meterMoneyMogoEntity.getVolumeCharge());
                appMoneyRecall.setBasicMoney(meterMoneyMogoEntity.getBasicMoney());
                appMoneyRecall.setPowerRateMoney(meterMoneyMogoEntity.getPowerRateMoney());
                appMoneyRecall.setAddMoney1(surchargeDetail.get(meterInfo.getPriceType() + "#" + "2" + "#" + "0"));
                appMoneyRecall.setAddMoney2(surchargeDetail.get(meterInfo.getPriceType() + "#" + "3" + "#" + "0"));
                appMoneyRecall.setAddMoney3(surchargeDetail.get(meterInfo.getPriceType() + "#" + "4" + "#" + "0"));
                appMoneyRecall.setAddMoney4(surchargeDetail.get(meterInfo.getPriceType() + "#" + "5" + "#" + "0"));
                appMoneyRecall.setAddMoney5(surchargeDetail.get(meterInfo.getPriceType() + "#" + "6" + "#" + "0"));
                appMoneyRecall.setAddMoney6(surchargeDetail.get(meterInfo.getPriceType() + "#" + "7" + "#" + "0"));
                appMoneyRecall.setAddMoney7(surchargeDetail.get(meterInfo.getPriceType() + "#" + "8" + "#" + "0"));
                appMoneyRecall.setAddMoney8(surchargeDetail.get(meterInfo.getPriceType() + "#" + "9" + "#" + "0"));
                appMoneyRecall.setActiveWritePower1(meterMoneyMogoEntity.getActiveWritePower1());
                appMoneyRecall.setActiveWritePower2(meterMoneyMogoEntity.getActiveWritePower2());
                appMoneyRecall.setActiveWritePower3(meterMoneyMogoEntity.getActiveWritePower3());
                appMoneyRecall.setActiveWritePower4(meterMoneyMogoEntity.getActiveWritePower4());

                //欠费标志
                List<Long> meterIds = new ArrayList<>();
                meterIds.add(meterInfo.getId());
                String resultArrearages = restTemplate.postForObject
                        (PropertiesUtil.getValue("findArrearageByMeterIds"), meterIds.stream().map(String::valueOf).collect(Collectors.joining(",")), String.class);
                JSONArray arrearagesJsonArray =
                        JSONObject.parseArray(resultArrearages);
                //判断有无欠费记录
                if (arrearagesJsonArray != null && arrearagesJsonArray.size() > 0) {
                    appMoneyRecall.setPaidFlag(0);
                } else {
                    appMoneyRecall.setPaidFlag(1);
                }
                appMoneyRecalls.add(appMoneyRecall);
            }

        }

        //户下有计量点
        //根据计量带点查欠费
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appMoneyRecalls);
    }


    @RequestMapping(value = "/billingFindAppMoneyRecall")
    @ResponseBody
    public HttpResult cimfindAppMoneyRecall(@RequestBody(required = false) String appMoneyRecallJson) {
        AppMoneyRecall appMoneyRecall =
                JSONObject.parseObject(appMoneyRecallJson, AppMoneyRecall.class);
        List<AppMoneyRecall> appMoneyRecalls =
                appMoneyRecallMapper.billingFindAppMoneyRecall(appMoneyRecall);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appMoneyRecalls);
    }


    @RequestMapping(value = "/billingFindFinishAppMoneyRecall")
    @ResponseBody
    public HttpResult billingFindFinishAppMoneyRecall(@RequestBody(required = false) String appMoneyRecallJson) {
        Map map=JSONObject.parseObject(appMoneyRecallJson,Map.class);
        int num=appMoneyRecallMapper.backAppMoneyRecall(map);
        return new HttpResult<>(HttpResult.SUCCESS, "回退成功");
    }

    @RequestMapping(value = "/updateBillingMoneyRecall")
    @ResponseBody
    public HttpResult updateBillingMoneyRecall(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject=JSONObject.parseObject(appMoneyRecallJson);
        List<AppMoneyRecall> appMoneyRecalls =
                JSONObject.parseArray(jsonObject.get("appMoneyRecallList").toString(),AppMoneyRecall.class);
        appMoneyRecalls.stream().forEach(t->{
            AppMoneyRecall appMoneyRecall=new AppMoneyRecall();
            appMoneyRecall.setId(t.getId());
            appMoneyRecall.setMon(t.getMon());
            appMoneyRecall.setMonSn(t.getMonSn());
            appMoneyRecallMapper.updateByPrimaryKeySelective(appMoneyRecall);
        });
        return new HttpResult<>(HttpResult.SUCCESS, "退费冲抵成功");
    }

}
