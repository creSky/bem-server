package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.AppInductorAssetsInfoMapper;
import com.bem.mapper.AppMeterAssetsInfoMapper;
import com.bem.mapper.AppMeterInfoMapper;
import com.bem.mapper.AppTransformerInfoMapper;
import com.bem.util.PropertiesUtil;
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
    public RestultContent getSiteSurveyTree(@RequestBody String siteSurveyTreeJson) throws Exception {
        //返回实体
        RestultContent restultContent = new RestultContent();

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
        restultContent.setStatus(200);
        restultContent.setData(treeList);
        return restultContent;

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
     *
     * @param transformerAssetsNo
     * @return
     */
    @RequestMapping("/getUserTrans")
    @ResponseBody
    public RestultContent getUserTrans(@RequestBody String transformerAssetsNo) throws Exception {
        //查询变压器资产是否存在
        RestultContent restultContent = new RestultContent();
        String assetsNo=JSONObject.parseObject(transformerAssetsNo).getString("transformerAssetsNo");
        JSONObject postData = new JSONObject();
        postData.put("transformerAssetsNo",assetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getTransformerAssetsByWhere"), postData, String.class);
        List<AppTransformerInfo> appTransformerInfos = JSONObject.parseArray(result, AppTransformerInfo.class);
        if (appTransformerInfos.size() < 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("资产库没有该资产");
            return restultContent;
        }
        if (appTransformerInfos.size() > 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("该资产编号"+assetsNo+"在变压器资产库存在多条记录");
            return restultContent;
        }
        result = restTemplate.postForObject
                (PropertiesUtil.getValue("getTransformerByAsset"), postData, String.class);

        restultContent.setStatus(200);
        //cim-server 返回list数据
        restultContent.setData(appTransformerInfos.get(0));
        return restultContent;

    }

    /**
     * 获取变压器
     *
     * @param transJson
     * @return
     */
    @RequestMapping("/getTrans")
    @ResponseBody
    public RestultContent getTrans(@RequestBody String transJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        JSONObject jsonObject = JSONObject.parseObject(transJson);
        AppTransformerInfo appTransformerInfo = new AppTransformerInfo();
        appTransformerInfo = appTransformerInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        restultContent.setStatus(200);
        restultContent.setData(appTransformerInfo);
        return restultContent;

    }

    /**
     * 保存变压器信息
     *
     * @param transJson
     * @return
     */
    @RequestMapping("/saveTrans")
    @ResponseBody
    public RestultContent saveTrans(@RequestBody String transJson) throws Exception {

        AppTransformerInfo appTransformerInfo = JSONObject.parseObject(transJson, AppTransformerInfo.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appTransformerInfoMapper.existsWithPrimaryKey(appTransformerInfo);
        if (isExist) {
            appTransformerInfoMapper.updateByPrimaryKeySelective(appTransformerInfo);
        } else {
            appTransformerInfo.setCreateDate(new Date());
            appTransformerInfoMapper.insertSelective(appTransformerInfo);
        }
        restultContent.setStatus(200);
        restultContent.setData(appTransformerInfo);
        return restultContent;

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
    public RestultContent getJlPoint(@RequestBody String jlPointJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(jlPointJson);
        RestultContent restultContent = new RestultContent();
        AppMeterInfo appMeterInfo = new AppMeterInfo();
        appMeterInfo = appMeterInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        restultContent.setStatus(200);
        restultContent.setData(appMeterInfo);
        return restultContent;

    }

    /**
     * 保存计量点信息
     *
     * @param jlPointJson
     * @return
     */
    @RequestMapping("/saveJlPoint")
    @ResponseBody
    public RestultContent saveJlPoint(@RequestBody String jlPointJson) throws Exception {

        AppMeterInfo appMeterInfo = JSONObject.parseObject(jlPointJson, AppMeterInfo.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appMeterInfoMapper.existsWithPrimaryKey(appMeterInfo);
        if (isExist) {
            appMeterInfoMapper.updateByPrimaryKeySelective(appMeterInfo);
        } else {
            appMeterInfo.setCreateDate(new Date());
            appMeterInfoMapper.insertSelective(appMeterInfo);
        }
        restultContent.setStatus(200);
        restultContent.setData(appMeterInfo);
        return restultContent;

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
     *
     * @param meterAssets
     * @return
     */
    @RequestMapping("/getUserMeterAssets")
    @ResponseBody
    public RestultContent getUserMeterAssets(@RequestBody String meterAssets) throws Exception {
        //查询电能表资产是否存在
        RestultContent restultContent = new RestultContent();
        String meterAssetsNo=JSONObject.parseObject(meterAssets).getString("meterAssetsNo");
        JSONObject postData = new JSONObject();
        postData.put("meterAssetsNo",meterAssetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getMeterAssetsByAssetsNo") , postData,String.class);
        List<AppMeterAssetsInfo> appMeterAssetsInfos= JSONObject.parseArray(result, AppMeterAssetsInfo.class);
        if (appMeterAssetsInfos.size() < 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("电能表资产库没有该资产");
            return restultContent;
        }
        if (appMeterAssetsInfos.size() > 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("该资产编号"+meterAssetsNo+"在电能表资产库存在多条记录");
            return restultContent;
        }

        //查询电能表是否在用
        result = restTemplate.postForObject(PropertiesUtil.getValue("getMeterByMeterAssestsNo"), postData,String.class);

        List<AppMeterInfo> appMeterInfos= JSONObject.parseArray(result, AppMeterInfo.class);
        if (0!=appMeterInfos.size()) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("该资产编号"+meterAssetsNo+"已在用");
            return restultContent;
        }
        restultContent.setStatus(200);
        restultContent.setData(appMeterAssetsInfos.get(0));
        return restultContent;

    }

    /**
     * 获取表计
     *
     * @param meterJson
     * @return
     */
    @RequestMapping("/getMeter")
    @ResponseBody
    public RestultContent getMeter(@RequestBody String meterJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(meterJson);
        RestultContent restultContent = new RestultContent();
        AppMeterAssetsInfo appMeterAssetsInfo = new AppMeterAssetsInfo();
        appMeterAssetsInfo = appMeterAssetsInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        restultContent.setStatus(200);
        restultContent.setData(appMeterAssetsInfo);
        return restultContent;

    }

    /**
     * 保存表计信息
     *
     * @param meterJson
     * @return RestultContent
     */
    @RequestMapping("/saveMeter")
    @ResponseBody
    public RestultContent saveMeter(@RequestBody String meterJson) throws Exception {

        AppMeterAssetsInfo appMeterAssetsInfo = JSONObject.parseObject(meterJson, AppMeterAssetsInfo.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appMeterAssetsInfoMapper.existsWithPrimaryKey(appMeterAssetsInfo);
        if (isExist) {
            appMeterAssetsInfoMapper.updateByPrimaryKeySelective(appMeterAssetsInfo);
        } else {
            appMeterAssetsInfoMapper.insertSelective(appMeterAssetsInfo);
        }
        restultContent.setStatus(200);
        restultContent.setData(appMeterAssetsInfo);
        return restultContent;

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
     *
     * @param indtAssets
     * @return
     */
    @RequestMapping("/getUserIndtAssets")
    @ResponseBody
    public RestultContent getUserIndtAssets(@RequestBody String indtAssets) throws Exception {
        //查询电能表资产是否存在
        RestultContent restultContent = new RestultContent();
        JSONObject postData = new JSONObject();
        String inductorAssetsNo=JSONObject.parseObject(indtAssets).getString("inductorAssetsNo");
        postData.put("inductorAssetsNo",inductorAssetsNo);
        String result = restTemplate.postForObject
                (PropertiesUtil.getValue("getInductorAssetsByAssetsNo"), postData, String.class);
        List<AppInductorAssetsInfo> appInductorAssetsInfos = JSONObject.parseArray(result, AppInductorAssetsInfo.class);
        if (appInductorAssetsInfos.size() < 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("资产库没有该资产");
            return restultContent;
        }
        if (appInductorAssetsInfos.size() > 1) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("该资产编号"+inductorAssetsNo+"在互感器资产库存在多条记录");
            return restultContent;
        }
        //查询互感器是否在用
        result = restTemplate.postForObject(PropertiesUtil.getValue("getMeterByInductorAssestsNo"), postData,String.class);
        List<AppMeterInfo>appMeterInfos= JSONObject.parseArray(result, AppMeterInfo.class);
        if (0!=appMeterInfos.size()) {
            restultContent.setStatus(300);
            restultContent.setErrorMsg("该资产编号"+inductorAssetsNo+"已在用");
            return restultContent;
        }
        restultContent.setStatus(200);
        restultContent.setData(appInductorAssetsInfos.get(0));
        return restultContent;

    }

    /**
     * 获取互感器
     *
     * @param indtJson
     * @return
     */
    @RequestMapping("/getIndt")
    @ResponseBody
    public RestultContent getIndt(@RequestBody String indtJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(indtJson);
        RestultContent restultContent = new RestultContent();
        AppInductorAssetsInfo appInductorAssetsInfo = new AppInductorAssetsInfo();
        appInductorAssetsInfo = appInductorAssetsInfoMapper.selectByPrimaryKey(jsonObject.get("id"));
        restultContent.setStatus(200);
        restultContent.setData(appInductorAssetsInfo);
        return restultContent;

    }

    /**
     * 保存互感器信息
     *
     * @param indtJson
     * @return
     */
    @RequestMapping("/saveIndt")
    @ResponseBody
    public RestultContent saveIndt(@RequestBody String indtJson) throws Exception {

        AppInductorAssetsInfo appInductorAssetsInfo = JSONObject.parseObject(indtJson, AppInductorAssetsInfo.class);
        RestultContent restultContent = new RestultContent();
        boolean isExist = appInductorAssetsInfoMapper.existsWithPrimaryKey(appInductorAssetsInfo);
        if (isExist) {
            appInductorAssetsInfoMapper.updateByPrimaryKeySelective(appInductorAssetsInfo);
        } else {
            appInductorAssetsInfoMapper.insertSelective(appInductorAssetsInfo);
        }
        restultContent.setStatus(200);
        restultContent.setData(appInductorAssetsInfo);
        return restultContent;

    }


}
