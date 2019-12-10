package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppTransformerInfo;
import com.bem.domain.MeterInformationEntity;
import com.bem.domain.TransformerInfoEntity;
import com.bem.mapper.AppMeterInfoMapper;
import com.bem.mapper.AppTransformerInfoMapper;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * 增减容
 */
@Controller
@RequestMapping("/appTransformer")
public class AppTransformerController {

    @Autowired
    private AppTransformerInfoMapper appTransformerInfoMapper;

    @Autowired
    private AppMeterInfoMapper appMeterInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * @param appTransformerJson
     * @return
     */
    @RequestMapping("/getAppTransformerByUser")
    @ResponseBody
    @Transactional
    public HttpResult getAppTransformerByUser(@RequestBody String appTransformerJson) throws Exception {
        //根据appid查询是否 业扩库是否有记录
        Long taskId = JSONObject.parseObject(appTransformerJson).getLong("taskId");
        Long appId = JSONObject.parseObject(appTransformerJson).getLong("appId");
        if (appId == null || "".equals(appId)) {
            return new HttpResult(HttpResult.ERROR, "缺少流程参数", null);
        }

        String userNo=JSONObject.parseObject(appTransformerJson).getString("userNo");
        if (userNo == null || "".equals(userNo)) {
            return new HttpResult(HttpResult.ERROR, "缺少用户参数", null);
        }
        // 构造查询实体

        List<MeterInformationEntity> meterInformationEntities =
                appMeterInfoMapper.getMeterInformationByAppid(appId);
        List<TransformerInfoEntity> transformeerByAppid=
                appTransformerInfoMapper.getTransformeerByAppid(appId);

        //查询流程表中有无信息 若无则从档案表取信息
        if (meterInformationEntities == null || meterInformationEntities.size() < 1) {
            //根据用户查计量点信息
            JSONObject postData = new JSONObject();
            postData.put("userNo", userNo);
            //不分页
            postData.put("pageSize", "-1");
            String resultMeters = restTemplate.postForObject
                    (PropertiesUtil.getValue("getMeterByUser"), postData, String.class);

            //档案传的分页结构 解析json
            meterInformationEntities =
                    JSONObject.parseArray(JSONObject.parseObject(resultMeters).getString("list"), MeterInformationEntity.class);

            if(meterInformationEntities==null||meterInformationEntities.size()<1){
                return new HttpResult(HttpResult.ERROR, "该用户下没有计量点，无法增减容",
                        null);
            }

            //将档案计量点信息插入 流程表里
            meterInformationEntities.forEach(t->{
                t.setMeterId(t.getId());
                t.setId(null);
                t.setTaskId(taskId);
                t.setAppId(appId);
                postData.clear();
                postData.clear();
                postData.put("id",t.getWriteSectionId());
                //查询抄表区段名称
                String writeSectJson=
                        restTemplate.postForObject(PropertiesUtil.getValue("getWriteSectByKey"), postData, String.class);
                t.setWriteSectName(JSONObject.parseObject(writeSectJson).getString("writeSectName"));
                postData.clear();
                postData.put("id",t.getUserId());
                //查询用户号
                String userJson=
                        restTemplate.postForObject(PropertiesUtil.getValue("getUserByKey"), postData, String.class);
                t.setUserNo(JSONObject.parseObject(userJson).getString("userNo"));
                appMeterInfoMapper.insert(t);
            });

            //根据计量点查询变压器信息
            List<Long> meterIds = meterInformationEntities.stream().map(t -> {
                return t.getMeterId();
            }).collect(Collectors.toList());

            postData.clear();
            postData.put("ids", meterIds);
            String resultTransformers = restTemplate.postForObject
                    (PropertiesUtil.getValue("getTransformerByRel"), postData, String.class);

            transformeerByAppid=
                    JSONObject.parseArray(resultTransformers, TransformerInfoEntity.class);

             //将档案变压器关系信息插入 流程表里
            if(transformeerByAppid!=null && transformeerByAppid.size()>0){
                transformeerByAppid.forEach(t -> {
                    t.setTransformerRelId(t.getId());
                    t.setId(null);
                    t.setAppId(appId);
                    t.setTaskId(taskId);
                    postData.clear();
                    postData.put("id",t.getSubsId());
                    String subsByKey = restTemplate.postForObject
                            (PropertiesUtil.getValue("getSubsByKey"), postData, String.class);
                    if(subsByKey!=null && !"".equals(subsByKey)){
                        t.setSubsName(JSONObject.parseObject(subsByKey).getString("subsName"));
                    }
                    postData.clear();
                    postData.put("id",t.getLineId());
                    String lineByKey = restTemplate.postForObject
                            (PropertiesUtil.getValue("getLineByKey"), postData,String.class);
                    if(lineByKey!=null && !"".equals(lineByKey)){
                        t.setLineName(JSONObject.parseObject(lineByKey).getString("lineName"));
                    }
                    appTransformerInfoMapper.insert(t);
                });
            }
        }


        //构造前台变压器信息
        transformeerByAppid.forEach(t -> {
            String loadSign="(未处理)";
            if(Objects.equals(t.getLoadChangeSign(), 1)){
                loadSign="(已拆除)";
            }else if(Objects.equals(t.getLoadChangeSign(), 0)){
                loadSign="(已新装)";
            }
            t.setParent("0");
            t.setShowName1("变压器信息"+loadSign);
            t.setShowName2(t.getTransformerNo()+"(资产号)");
            t.setShowName3(t.getDeskName()+"(名称)");
            t.setShowName4(t.getCapacity()+"(容量)");
        });

        Map<Long,List<TransformerInfoEntity>> transformMap=
                transformeerByAppid.stream().collect(Collectors.groupingBy(TransformerInfoEntity::getMeterId));
        //构造前台返回数据
        meterInformationEntities.forEach(t->{
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("id",t.getUserId());
            String userJson=
                    restTemplate.postForObject(PropertiesUtil.getValue("getUserByKey"), jsonObject, String.class);
            t.setUserNo(JSONObject.parseObject(userJson).getString("userNo"));
            t.setShowName1(JSONObject.parseObject(userJson).getString("userNo"));
            t.setShowName2(JSONObject.parseObject(userJson).getString("userName"));
            t.setShowName3(t.getMeterNo());
            t.setShowName4(t.getMeterName());
            t.setParent("1");
            t.setTransformerInfos(transformMap.get(t.getMeterId()));
        });
        return new HttpResult(HttpResult.SUCCESS,"查询成功",meterInformationEntities);
    }

    /**
     * @param appTransformerInfoJson
     * @return
     */
    @RequestMapping("/save")
    @ResponseBody
    public HttpResult save(@RequestBody String appTransformerInfoJson) throws Exception {
        AppTransformerInfo appTransformerInfo = JSONObject.parseObject(appTransformerInfoJson,
                AppTransformerInfo.class);
        boolean isExist = appTransformerInfoMapper.existsWithPrimaryKey(appTransformerInfo);

        //判断变压器组号存不存在  装时判断
        if(Objects.equals(appTransformerInfo.getLoadChangeSign(),0)){
            JSONObject jsonObject=new JSONObject();
            jsonObject.put("meterId",appTransformerInfo.getMeterId());
            jsonObject.put("transformerGroupNo",appTransformerInfo.getTransformerGroupNo());
            String transGroupNo= restTemplate.postForObject
                    (PropertiesUtil.getValue("getDistinctTransGroupNo"), jsonObject, String.class);

            List<AppTransformerInfo> appTransformerInfos=
                    JSONObject.parseArray(transGroupNo,
                            AppTransformerInfo.class);
            if(appTransformerInfos!=null && appTransformerInfos.size()>0){
                return new HttpResult(HttpResult.ERROR, "输入的变压器组号已存在", null);
            }
        }

        //赋值线路和变电站名称
        JSONObject postData=new JSONObject();
        postData.clear();
        postData.put("id",appTransformerInfo.getSubsId());
        String subsByKey = restTemplate.postForObject
                (PropertiesUtil.getValue("getSubsByKey"), postData, String.class);
        if(subsByKey!=null && !"".equals(subsByKey)){
            appTransformerInfo.setSubsName(JSONObject.parseObject(subsByKey).getString("subsName"));
        }
        postData.clear();
        postData.put("id",appTransformerInfo.getLineId());
        String lineByKey = restTemplate.postForObject
                (PropertiesUtil.getValue("getLineByKey"), postData,String.class);
        if(lineByKey!=null && !"".equals(lineByKey)){
            appTransformerInfo.setLineName(JSONObject.parseObject(lineByKey).getString("lineName"));
        }

        //判断存不存在 存在就更新 不存在就插入
        if (isExist) {
            appTransformerInfoMapper.updateByPrimaryKeySelective(appTransformerInfo);
        } else {
            appTransformerInfo.setCreateDate(new Date());
            appTransformerInfoMapper.insertSelective(appTransformerInfo);
        }
        return new HttpResult(HttpResult.SUCCESS, "保存成功", appTransformerInfo);
    }

    //调用cim 查询变压器档案
    @RequestMapping("/getTransformerByWhere")
    @ResponseBody
    @Transactional
    public HttpResult getTransformerByWhere(@RequestBody String appTransformerJson) throws Exception {

        Long meterId=JSONObject.parseObject(appTransformerJson).getLong(
                "meterId");

        String transformer=restTemplate.postForObject
                (PropertiesUtil.getValue("getAvaTransformerByWhere"), appTransformerJson,String.class);

        JSONObject jsonObject=JSONObject.parseObject(transformer);

        List<AppTransformerInfo> appTransformerInfos=
                JSONObject.parseArray(jsonObject.getString("list"),
                        AppTransformerInfo.class);

        if(appTransformerInfos!=null && appTransformerInfos.size()>0){
            appTransformerInfos.forEach(t->{
                t.setTransformerId(t.getId());
                t.setId(null);
                t.setMeterId(meterId);
                t.setLoadChangeSign(null);
            });
        }
        jsonObject.put("list",appTransformerInfos);
        return new HttpResult(HttpResult.SUCCESS,"查询成功", jsonObject);
    }
}
