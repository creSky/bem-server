package com.bem.controller;

import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.metadata.BaseRowModel;
import com.alibaba.fastjson.JSONObject;
import com.bem.domain.*;
import com.bem.entity.*;
import com.bem.mapper.AppBulkRefundMapper;
import com.bem.mapper.AppRefundPreMoneyInfoMapper;
import com.bem.mapper.AppSettlementInfoMapper;
import com.bem.util.ExcelUtil;
import com.bem.util.PropertiesUtil;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import javax.servlet.http.HttpServletRequest;
import java.io.*;
import java.math.BigDecimal;
import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：zjd
 * @date ：Created in 2020年6月5日19:30:34
 * @modified By：批量退款
 */
@Controller
@RequestMapping("/appBulkRefund")
public class AppBulkRefundController {
    @Autowired
    private AppBulkRefundMapper appBulkRefundMapper;
    @Autowired
    private AppSettlementInfoMapper appSettlementInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    @ResponseBody
    @RequestMapping("/getAppBulkRefund")
    public HttpResult getAppBulkRefund(@RequestBody String appBulkRefundJson) {

        JSONObject jsonObject = JSONObject.parseObject(appBulkRefundJson);
        Long processInstanceId = jsonObject.getLong("processInstanceId");
        Integer taskId = jsonObject.getInteger("taskId");
        String appId = jsonObject.getString("appId");

        AppBulkRefundExample appBulkRefundExample =
                new AppBulkRefundExample();
        AppBulkRefundExample.Criteria appBulkRefundExampleCriteria =
                appBulkRefundExample.createCriteria();
        appBulkRefundExampleCriteria.andAppIdEqualTo(appId)
                .andProcessInstanceIdEqualTo(processInstanceId);
        List<AppBulkRefund> appBulkRefunds =
                appBulkRefundMapper.selectByExample(appBulkRefundExample);

        if (appBulkRefunds == null || appBulkRefunds.size() < 1) {
            return new HttpResult(HttpResult.ERROR, "无退费数据");
        }

        AppBulkRefund appBulkRefund=appBulkRefunds.get(0);

        JSONObject returnJSONObject=new JSONObject();
        returnJSONObject.put("data",appBulkRefunds);
        returnJSONObject.put("passMan",appBulkRefund.getPassMan()==null?jsonObject.getInteger("managerId")
                : appBulkRefund.getPassMan());
        returnJSONObject.put("passDate",appBulkRefund.getPassDate()==null?new Date()
                : appBulkRefund.getPassDate());
        returnJSONObject.put("passOption",appBulkRefund.getPassOption()==null?1:
                appBulkRefund.getPassOption());

        return new HttpResult(HttpResult.SUCCESS, "查询成功", returnJSONObject);
    }


    @ResponseBody
    @RequestMapping("/delete")
    public HttpResult delete(@RequestBody String deleteJson) {

        AppBulkRefund appBulkRefund = JSONObject.parseObject(deleteJson,
                AppBulkRefund.class);
        appBulkRefundMapper.deleteByPrimaryKey(appBulkRefund);
        return new HttpResult(HttpResult.SUCCESS, "删除成功");
    }


    @ResponseBody
    @RequestMapping("/updateAppBulkRefund")
    public HttpResult updateAppBulkRefund(@RequestBody String appRefundJson) {

        JSONObject jsonObject = JSONObject.parseObject(appRefundJson);

        Long processInstanceId = jsonObject.getLong("processInstanceId");
        String appId = jsonObject.getString("appId");

        AppBulkRefundExample appBulkRefundExample =
                new AppBulkRefundExample();
        AppBulkRefundExample.Criteria appBulkRefundExampleCriteria =
                appBulkRefundExample.createCriteria();
        appBulkRefundExampleCriteria.andAppIdEqualTo(appId)
                .andProcessInstanceIdEqualTo(processInstanceId);
        AppBulkRefund appBulkRefund=new AppBulkRefund();
        appBulkRefund =
                JSONObject.parseObject(jsonObject.getString("data"), AppBulkRefund.class);


        appBulkRefundMapper.updateByExampleSelective(appBulkRefund,appBulkRefundExample);


        return new HttpResult(HttpResult.SUCCESS, "更新成功");
    }


    /**
     * 保存记录和审批意见 上传文件
     *
     * @param servletRequest
     * @return
     */
    @ResponseBody
    @RequestMapping("/saveAppBulkRefundByFile")
    public HttpResult saveAppBulkRefundByFile(HttpServletRequest servletRequest) throws IOException {
        Long processInstanceId = Long.valueOf(servletRequest.getParameter("processInstanceId"));
        Integer taskId = Integer.valueOf(servletRequest.getParameter("taskId"));
        String appId = servletRequest.getParameter("appId");

        //删除上次导入
        AppBulkRefund deleteAppBulkRefund = new AppBulkRefund();
        deleteAppBulkRefund.setAppId(appId);
        appBulkRefundMapper.delete(deleteAppBulkRefund);

        MultipartFile file =
                ((MultipartHttpServletRequest) servletRequest).getFile("file");

        Map<String, List<? extends BaseRowModel>> maps = null;

        InputStream inputStream = null;
        try {
            inputStream =
                    new BufferedInputStream(file.getInputStream());
            maps = ExcelUtil.readExcelByModelFromInputStream(inputStream, "", BulkRefundEntity.class);
        } catch (Exception e) {
            e.printStackTrace();
            return new HttpResult<>(HttpResult.ERROR, "Excel解析失败，第一列列名为结算户号，第二列列名为退费金额");
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }

        //申请人申请时间
        AppSettlementInfo paramAppSettlement = new AppSettlementInfo();

        //取记录
        paramAppSettlement.setId(Long.valueOf(appId));

        AppSettlementInfo returnAppSettlementInfo =
                appSettlementInfoMapper.selectOne(paramAppSettlement);

        List<AppBulkRefund> bulkRefunds = new ArrayList<>();

        for (String key : maps.keySet()) {
            if(key==null || "".equals(key)){
                continue;
            }
            List<BulkRefundEntity> baseRowModels = (List<BulkRefundEntity>) maps.get(key);
            if (baseRowModels == null || baseRowModels.size() < 1) {
                continue;
            }
            for (BulkRefundEntity paramBulkRefund : baseRowModels) {
                AppBulkRefund appBulkRefund = new AppBulkRefund();
                appBulkRefund.setSettlementNo(paramBulkRefund.getSettlementNo());
                appBulkRefund.setRefundMoney(paramBulkRefund.getRefundMoney());
                appBulkRefund.setAppId(appId);
                appBulkRefund.setTaskId(taskId);
                appBulkRefund.setProcessInstanceId(processInstanceId);
                appBulkRefund.setApplyDate(returnAppSettlementInfo.getApplyDate());
                appBulkRefund.setApplyMan(returnAppSettlementInfo.getApplyManId());
                bulkRefunds.add(appBulkRefund);
            }

        }
        bulkRefunds=
                bulkRefunds.stream().filter(t->t.getSettlementNo()!=null&&!"".equals(t.getSettlementNo())).collect(Collectors.toList());
        if (bulkRefunds == null || bulkRefunds.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "Excel没有记录");
        }

        //赋值结算户信息
        List<String> settlementNos =
                bulkRefunds.stream().map(AppBulkRefund::getSettlementNo).distinct().collect(Collectors.toList());

        //赋值页面显示信息
        SettlementEntity settlementEntity = new SettlementEntity();
        settlementEntity.setSettlementNos(settlementNos);
        String settlementJson = restTemplate.postForObject
                (PropertiesUtil.getValue("findBySettlementNos"), settlementEntity, String.class);
        List<SettlementEntity> settlementEntities =
                JSONObject.parseArray(settlementJson, SettlementEntity.class);

        if (settlementEntities == null || settlementEntities.size() < 1) {
            return new HttpResult<>(HttpResult.ERROR, "结算户错误，无结算户信息");
        }

        Map<String, SettlementEntity> settlementEntityMap =
                settlementEntities.stream().collect(Collectors.toMap(SettlementEntity::getSettlementNo, a -> a, (k1, k2) -> k1));

        for(AppBulkRefund t :bulkRefunds){
            SettlementEntity paramSettlement=
                    settlementEntityMap.get(t.getSettlementNo());
            if(paramSettlement==null){
                return new HttpResult<>(HttpResult.ERROR, "无结算户："+t.getSettlementNo());
            }
            t.setBusinessPlaceCode(paramSettlement.getBusinessPlaceCode().intValue());
            t.setSettlementId(paramSettlement.getId());
            t.setSettlementName(paramSettlement.getSettlementName());
        };

        appBulkRefundMapper.batchInsert(bulkRefunds);
        return new HttpResult<>(HttpResult.SUCCESS, "导入成功", bulkRefunds);
    }
    @ResponseBody
    @RequestMapping("/billingFindAppBulkRefund")
    public HttpResult billingFindAppBulkRefund(@RequestBody(required = false)String appBulkRefundJson){
        AppBulkRefund appBulkRefund=JSONObject.parseObject(appBulkRefundJson, AppBulkRefund.class);

        List<AppBulkRefund> appBulkRefunds=
                appBulkRefundMapper.billingFindAppBulkRefund(appBulkRefund);

        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", appBulkRefunds);
    }
    @RequestMapping(value = "/billingFindAppBulkRefundRecall")
    @ResponseBody
    public HttpResult billingFindFinishAppMoneyRecall(@RequestBody(required = false) String appMoneyRecallJson) {
        Map map=JSONObject.parseObject(appMoneyRecallJson,Map.class);
        int num=appBulkRefundMapper.backAppBulkRefund(map);
        return new HttpResult<>(HttpResult.SUCCESS, "回退成功");
    }

    @RequestMapping(value = "/updateBillingBulkRefundRecall")
    @ResponseBody
    public HttpResult updateBillingMoneyRecall(@RequestBody String appMoneyRecallJson) {
        JSONObject jsonObject=JSONObject.parseObject(appMoneyRecallJson);
        List<AppBulkRefund> appMoneyRecalls =
                JSONObject.parseArray(jsonObject.get("appMoneyBulkRecallList").toString(),AppBulkRefund.class);
        appMoneyRecalls.stream().forEach(t->{
            AppBulkRefund appBulkRefund=new AppBulkRefund();
            appBulkRefund.setId(t.getId());
            appBulkRefund.setMon(t.getMon());
            appBulkRefund.setMonSn(t.getMonSn());
            appBulkRefundMapper.updateByPrimaryKeySelective(appBulkRefund);
        });
        return new HttpResult<>(HttpResult.SUCCESS, "退费冲抵成功");
    }
}
