package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.SiteSurveyTree;
import com.bem.domain.AppInductorAssetsInfo;
import com.bem.domain.AppMeterAssetsInfo;
import com.bem.domain.AppMeterInfo;
import com.bem.domain.AppTransformerInfo;
import com.bem.mapper.AppInductorAssetsInfoMapper;
import com.bem.mapper.AppMeterAssetsInfoMapper;
import com.bem.mapper.AppMeterInfoMapper;
import com.bem.mapper.AppTransformerInfoMapper;
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
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ：zjd
 * @date ：Created in 2019/3/1 9:45
 * @modified By：
 * 现场勘查
 */
@Controller
@RequestMapping("/siteSurvey")
public class SiteSurveyController {
    //电能表信息
    @Autowired
    private AppMeterAssetsInfoMapper appMeterAssetsInfoMapper;
    //互感器信息
    @Autowired
    private AppInductorAssetsInfoMapper appInductorAssetsInfoMapper;
    //计量点信息
    @Autowired
    private AppMeterInfoMapper appMeterInfoMapper;
    //变压器
    @Autowired
    private AppTransformerInfoMapper appTransformerInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 查询树
     *
     * @param siteSurveyTreeJson
     * @return
     */
    @ResponseBody
    @RequestMapping("/getSiteSurveyTree")
    public HttpResult getSiteSurveyTree(@RequestBody(required = false) String siteSurveyTreeJson) throws Exception {
        //返回实体

        List<SiteSurveyTree> treeList = new ArrayList<>();

        //获取appId
        JSONObject jsonObject = JSONObject.parseObject(siteSurveyTreeJson);

        String appId = jsonObject.getString("id");

        String userNo = jsonObject.getString("userNo");


        //取变压器信息
        treeList.addAll(getTreeTrans(userNo, appId));

        //取计量点信息
        List<SiteSurveyTree> jlPointList = getTreeJlPoint(userNo, appId);

        //取电表细信息
        Map<String, List<SiteSurveyTree>> meterMap =
                getTreeMeterAssets(userNo, appId).stream().collect(Collectors.groupingBy(SiteSurveyTree::getpId));

        //取互感器信息
        Map<String, List<SiteSurveyTree>> indtMap =
                getTreeIndt(userNo, appId).stream().collect(Collectors.groupingBy(SiteSurveyTree::getpId));

        for (SiteSurveyTree surveyTree : jlPointList) {
            if (meterMap.containsKey(surveyTree.getId()) && null != meterMap.get(surveyTree.getId())) {
                surveyTree.setChildren((meterMap.get(surveyTree.getId())));
            }
            if (indtMap.containsKey(surveyTree.getId()) && null != indtMap.get(surveyTree.getId())) {
                surveyTree.setChildren((indtMap.get(surveyTree.getId())));
            }
        }
        treeList.addAll(jlPointList);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", treeList);

    }


    /**
     * 获取用户绑定的变压器
     *
     * @param userNo
     * @return
     */
    public List<SiteSurveyTree> getTreeTrans(String userNo, String appId) throws Exception {
        //获取业扩变压器信息
        if (appTransformerInfoMapper.getSiteSurveyTransTree(appId).size() == 0) {
            //若业扩档案没有 则将档案插入到业扩档案中
            JSONObject postData = new JSONObject();
            postData.put("userNo", userNo);
            String result = restTemplate.postForObject
                    (PropertiesUtil.getValue("getTransformerByUser"), postData, String.class);
            List<AppTransformerInfo> cimTransformerInfos = JSONObject.parseArray(result, AppTransformerInfo.class);
            //循环插入
            if (cimTransformerInfos != null && cimTransformerInfos.size() > 0) {
                for (AppTransformerInfo cimTransformerInfo : cimTransformerInfos) {
                    cimTransformerInfo.setId(null);
                    cimTransformerInfo.setAppId(Long.valueOf(appId));
                    appTransformerInfoMapper.insertSelective(cimTransformerInfo);
                }
            }
        }
        return appTransformerInfoMapper.getSiteSurveyTransTree(appId);

    }


    /**
     * @param transformerAssetsNo
     * @return
     */
    @RequestMapping("/getUserTrans")
    @ResponseBody
    public HttpResult getUserTrans(@RequestBody String transformerAssetsNo) throws Exception {
        //查询变压器资产是否存在
        String assetsNo = JSONObject.parseObject(transformerAssetsNo).getString("transformerAssetsNo");
        JSONObject postData = new JSONObject();
        postData.put("transformerAssetsNo", assetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getTransformerAssetsByWhere"), postData, String.class);
        List<AppTransformerInfo> appTransformerInfos = JSONObject.parseArray(result, AppTransformerInfo.class);
        if (appTransformerInfos.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "资产库没有该资产", null);
        }
        if (appTransformerInfos.size() > 1) {
            return new HttpResult<>(HttpResult.ERROR, "该资产编号" + assetsNo +
                    "在变压器资产库存在多条记录", null);
        }
        result = restTemplate.postForObject
                (PropertiesUtil.getValue("getTransformerByAsset"), postData, String.class);

        return new HttpResult<>(HttpResult.SUCCESS, "查询成功",
                appTransformerInfos.get(0));
    }

    /**
     * 获取变压器
     *
     * @param transJson
     * @return
     */
    @RequestMapping("/getTrans")
    @ResponseBody
    public HttpResult getTrans(@RequestBody String transJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(transJson);
        AppTransformerInfo appTransformerInfo = new AppTransformerInfo();
        appTransformerInfo = appTransformerInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appTransformerInfo);

    }

    /**
     * 保存变压器信息
     *
     * @param transJson
     * @return
     */
    @RequestMapping("/saveTrans")
    @ResponseBody
    public HttpResult saveTrans(@RequestBody String transJson) throws Exception {

        AppTransformerInfo appTransformerInfo = JSONObject.parseObject(transJson, AppTransformerInfo.class);
        boolean isExist = appTransformerInfoMapper.existsWithPrimaryKey(appTransformerInfo);
        if (isExist) {
            appTransformerInfoMapper.updateByPrimaryKeySelective(appTransformerInfo);
        } else {
            appTransformerInfo.setCreateDate(new Date());
            appTransformerInfoMapper.insertSelective(appTransformerInfo);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appTransformerInfo);

    }

    /**
     * 获取用户绑定的计量点
     *
     * @param userNo
     * @return
     */
    public List<SiteSurveyTree> getTreeJlPoint(String userNo, String appId) throws Exception {
        //获取业扩变压器信息
        if (appMeterInfoMapper.getSiteSurveyMeterInfoTree(appId).size() == 0) {
            //若业扩档案没有 则将档案插入到业扩档案中
            JSONObject postData = new JSONObject();
            postData.put("userNo", userNo);
            String result = restTemplate.postForObject
                    (PropertiesUtil.getValue("getMeterByUser"), postData, String.class);
            List<AppMeterInfo> cimAppMeterInfos = JSONObject.parseArray(result, AppMeterInfo.class);
            if (cimAppMeterInfos != null && cimAppMeterInfos.size() > 0) {
                //循环插入
                for (AppMeterInfo appMeterInfo : cimAppMeterInfos) {
                    appMeterInfo.setId(null);
                    appMeterInfo.setAppId(Long.valueOf(appId));
                    appMeterInfoMapper.insertSelective(appMeterInfo);
                }
            }

        }
        return appMeterInfoMapper.getSiteSurveyMeterInfoTree(appId);

    }

    /**
     * 获取计量点
     *
     * @param jlPointJson
     * @return
     */
    @RequestMapping("/getJlPoint")
    @ResponseBody
    public HttpResult getJlPoint(@RequestBody String jlPointJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(jlPointJson);
        AppMeterInfo appMeterInfo = new AppMeterInfo();
        appMeterInfo = appMeterInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appMeterInfo);
    }

    /**
     * 保存计量点信息
     *
     * @param jlPointJson
     * @return
     */
    @RequestMapping("/saveJlPoint")
    @ResponseBody
    public HttpResult saveJlPoint(@RequestBody String jlPointJson) throws Exception {

        AppMeterInfo appMeterInfo = JSONObject.parseObject(jlPointJson, AppMeterInfo.class);
        boolean isExist = appMeterInfoMapper.existsWithPrimaryKey(appMeterInfo);
        if (isExist) {
            appMeterInfoMapper.updateByPrimaryKeySelective(appMeterInfo);
        } else {
            appMeterInfo.setCreateDate(new Date());
            appMeterInfoMapper.insertSelective(appMeterInfo);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appMeterInfo);
    }

    /**
     * 获取用户绑定的电能表
     *
     * @param userNo
     * @return
     */
    public List<SiteSurveyTree> getTreeMeterAssets(String userNo, String appId) throws Exception {
        //获取业扩变压器信息
        if (appMeterAssetsInfoMapper.getSiteSurveyMeterAssetsTree(appId).size() == 0) {
            //若业扩档案没有 则将档案插入到业扩档案中
            JSONObject postData = new JSONObject();
            postData.put("userNo", userNo);
            String result = restTemplate.postForObject
                    (PropertiesUtil.getValue("getAssetsByUser"), postData, String.class);
            List<AppMeterAssetsInfo> cimAppMeterAssets = JSONObject.parseArray(result, AppMeterAssetsInfo.class);
            //循环插入
            if (cimAppMeterAssets != null && cimAppMeterAssets.size() > 0) {
                for (AppMeterAssetsInfo appMeterAssetsInfo : cimAppMeterAssets) {
                    appMeterAssetsInfo.setId(null);
                    appMeterAssetsInfo.setAppId(Long.valueOf(appId));
                    appMeterAssetsInfoMapper.insertSelective(appMeterAssetsInfo);
                }
            }
        }
        return appMeterAssetsInfoMapper.getSiteSurveyMeterAssetsTree(appId);

    }


    /**
     * @param meterAssets
     * @return
     */
    @RequestMapping("/getUserMeterAssets")
    @ResponseBody
    public HttpResult getUserMeterAssets(@RequestBody String meterAssets) throws Exception {
        //查询电能表资产是否存在
        String meterAssetsNo = JSONObject.parseObject(meterAssets).getString("meterAssetsNo");
        JSONObject postData = new JSONObject();
        postData.put("meterAssetsNo", meterAssetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getMeterAssetsByAssetsNo"), postData, String.class);
        List<AppMeterAssetsInfo> appMeterAssetsInfos = JSONObject.parseArray(result, AppMeterAssetsInfo.class);
        if (appMeterAssetsInfos.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "电能表资产库没有该资产", null);
        }
        if (appMeterAssetsInfos.size() > 1) {
            return new HttpResult<>(HttpResult.ERROR,
                    "该资产编号" + meterAssetsNo + "在电能表资产库存在多条记录", null);
        }

        //查询电能表是否在用
        result = restTemplate.postForObject(PropertiesUtil.getValue("getMeterByMeterAssestsNo"), postData, String.class);

        List<AppMeterInfo> appMeterInfos = JSONObject.parseArray(result, AppMeterInfo.class);
        if (0 != appMeterInfos.size()) {
            return new HttpResult<>(HttpResult.ERROR,
                    "该资产编号" + meterAssetsNo + "已在用", null);

        }
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功",
                appMeterAssetsInfos.get(0));

    }

    /**
     * 获取表计
     *
     * @param meterJson
     * @return
     */
    @RequestMapping("/getMeter")
    @ResponseBody
    public HttpResult getMeter(@RequestBody String meterJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(meterJson);
        AppMeterAssetsInfo appMeterAssetsInfo = new AppMeterAssetsInfo();
        appMeterAssetsInfo = appMeterAssetsInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appMeterAssetsInfo);

    }

    /**
     * 保存表计信息
     *
     * @param meterJson
     * @return RestultContent
     */
    @RequestMapping("/saveMeter")
    @ResponseBody
    public HttpResult saveMeter(@RequestBody String meterJson) throws Exception {

        AppMeterAssetsInfo appMeterAssetsInfo = JSONObject.parseObject(meterJson, AppMeterAssetsInfo.class);
        boolean isExist = appMeterAssetsInfoMapper.existsWithPrimaryKey(appMeterAssetsInfo);
        if (isExist) {
            appMeterAssetsInfoMapper.updateByPrimaryKeySelective(appMeterAssetsInfo);
        } else {
            appMeterAssetsInfoMapper.insertSelective(appMeterAssetsInfo);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功", appMeterAssetsInfo);

    }


    /**
     * 获取用户绑定的互感器
     *
     * @param userNo
     * @return
     */
    public List<SiteSurveyTree> getTreeIndt(String userNo, String appId) throws Exception {
        //获取互感器信息
        if (appInductorAssetsInfoMapper.getSiteSurveyIndtTree(appId).size() == 0) {
            //若业扩档案互感器没有 则将档案插入到业扩档案中
            JSONObject postData = new JSONObject();
            postData.put("userNo", userNo);
            String result = restTemplate.postForObject
                    (PropertiesUtil.getValue("getInductorAssetsByUser"), postData, String.class);
            List<AppInductorAssetsInfo> cimInductorAssetsInfos = JSONObject.parseArray(result, AppInductorAssetsInfo.class);
            if (cimInductorAssetsInfos != null && cimInductorAssetsInfos.size() > 0) {
                //循环插入
                for (AppInductorAssetsInfo appInductorAssetsInfo : cimInductorAssetsInfos) {
                    appInductorAssetsInfo.setId(null);
                    appInductorAssetsInfo.setAppId(Long.valueOf(appId));
                    appInductorAssetsInfoMapper.insertSelective(appInductorAssetsInfo);
                }
            }
        }
        return appInductorAssetsInfoMapper.getSiteSurveyIndtTree(appId);

    }


    /**
     * @param indtAssets
     * @return
     */
    @RequestMapping("/getUserIndtAssets")
    @ResponseBody
    public HttpResult getUserIndtAssets(@RequestBody String indtAssets) throws Exception {
        //查询电能表资产是否存在
        JSONObject postData = new JSONObject();
        String inductorAssetsNo = JSONObject.parseObject(indtAssets).getString("inductorAssetsNo");
        postData.put("inductorAssetsNo", inductorAssetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getInductorAssetsByAssetsNo"), postData, String.class);
        List<AppInductorAssetsInfo> appInductorAssetsInfos = JSONObject.parseArray(result, AppInductorAssetsInfo.class);
        if (appInductorAssetsInfos.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "资产库没有该资产", null);
        }
        if (appInductorAssetsInfos.size() > 1) {
            return new HttpResult<>(HttpResult.ERROR,
                    "该资产编号" + inductorAssetsNo + "在互感器资产库存在多条记录", null);
        }
        //查询互感器是否在用
        result = restTemplate.postForObject(PropertiesUtil.getValue("getMeterByInductorAssestsNo"), postData, String.class);
        List<AppMeterInfo> appMeterInfos = JSONObject.parseArray(result, AppMeterInfo.class);
        if (0 != appMeterInfos.size()) {
            return new HttpResult<>(HttpResult.ERROR,
                    "该资产编号" + inductorAssetsNo + "已在用", null);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功",
                appInductorAssetsInfos.get(0));

    }

    /**
     * 获取互感器
     *
     * @param indtJson
     * @return
     */
    @RequestMapping("/getIndt")
    @ResponseBody
    public HttpResult getIndt(@RequestBody String indtJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(indtJson);
        AppInductorAssetsInfo appInductorAssetsInfo = new AppInductorAssetsInfo();
        appInductorAssetsInfo = appInductorAssetsInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功",
                appInductorAssetsInfo);

    }

    /**
     * 保存互感器信息
     *
     * @param indtJson
     * @return
     */
    @RequestMapping("/saveIndt")
    @ResponseBody
    public HttpResult saveIndt(@RequestBody String indtJson) throws Exception {

        AppInductorAssetsInfo appInductorAssetsInfo = JSONObject.parseObject(indtJson, AppInductorAssetsInfo.class);
        boolean isExist = appInductorAssetsInfoMapper.existsWithPrimaryKey(appInductorAssetsInfo);
        if (isExist) {
            appInductorAssetsInfoMapper.updateByPrimaryKeySelective(appInductorAssetsInfo);
        } else {
            appInductorAssetsInfoMapper.insertSelective(appInductorAssetsInfo);
        }
        return new HttpResult<>(HttpResult.SUCCESS, "保存成功",
                appInductorAssetsInfo);
    }


}
