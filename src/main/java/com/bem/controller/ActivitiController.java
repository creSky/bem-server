package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.bemEnum.BemEnum;
import com.bem.domain.*;
import com.bem.entity.SettlementEntity;
import com.bem.entity.SystemCommonConfigEntity;
import com.bem.entity.TransformerMeterRelationEntity;
import com.bem.mapper.*;
import com.bem.service.ActivitiService;
import com.bem.service.AppFileService;
import com.bem.service.TaskListService;
import com.bem.util.BemCommonUtil;
import com.bem.util.PropertiesUtil;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.riozenc.titanTool.properties.Global;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.activiti.engine.history.HistoricTaskInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.*;
import java.util.stream.Collectors;

/**
 * @author ：zjd
 * @date ：Created in 2019/2/26 15:06
 * @modified By：
 */
@Controller
@RequestMapping(value = "/activiti")
public class ActivitiController {


    @Autowired
    private TaskListService taskListService;

    @Autowired
    private ActivitiService activitiService;

    @Autowired
    private AppPassAdviceMapper appPassAdviceMapper;

    @Autowired
    private AppDispatchMapper appDispatchMapper;


    @Autowired
    private AppCircumstanceMapper appCircumstanceMapper;

    @Autowired
    private AppDeclareInfoMapper appDeclareInfoMapper;

    @Autowired
    private AppCompeleteMapper appCompeleteMapper;

    @Autowired
    private AppAssemMapper appAssemMapper;

    @Autowired
    private AppMoneyRecallMapper appMoneyRecallMapper;

    @Autowired
    private AppUserInfoMapper appUserInfoMapper;

    @Autowired
    private AppSettlementInfoMapper appSettlementInfoMapper;

    @Autowired
    private AppCustomerInfoMapper appCustomerInfoMapper;

    @Autowired
    private AppMeterInfoMapper appMeterInfoMapper;

    @Autowired
    private AppFileService appFileService;

    @Autowired
    private AppTransformerInfoMapper appTransformerInfoMapper;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getTaskList")
    @ResponseBody
    public HttpResult getTaskList(@RequestBody(required = false) String userRightJson) throws Exception {
        //List<Map<String, Object>> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        JSONObject userRight = JSONObject.parseObject(userRightJson);
        //获得用户信息
        userMap.put("userId", BemCommonUtil.getOpeartorId(userRightJson));
        //userMap.put("roleIds","1");
        userMap.put("roleIds", BemCommonUtil.getOpeartorRoleIds(userRightJson));
        userMap.put("userDepts", BemCommonUtil.getOpeartorDeptIds(userRightJson));

        userMap.put("businessPlaceCode", userRight.getString("businessPlaceCode"));
        userMap.put("appNo", userRight.getString("appNo"));
        userMap.put("userName", userRight.getString("userName"));
        //分页 gql
        boolean isNumeric = BemCommonUtil.isNumeric(userRight.getString("pageCurrent"), userRight.getString("pageSize"));
        PageInfo<Map<String, Object>> pageInfo = null;
        if (isNumeric) {
            pageInfo =
                    PageHelper.startPage(userRight.getInteger("pageCurrent"), userRight.getInteger("pageSize")).
                            doSelectPageInfo(() -> this.taskListService.selectUserByApp(userMap));
        } else {
            pageInfo =
                    PageHelper.startPage(1, 10).
                            doSelectPageInfo(() -> this.taskListService.selectUserByApp(userMap));
        }

        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", pageInfo);
    }


    /**
     * @param submitJson
     * @return
     */
    @RequestMapping("/submit")
    @ResponseBody
    @Transactional
    public HttpResult submit(@RequestBody(required = false) String submitJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(submitJson);
        Map<String, Object> candidate = new HashMap<>();
        candidate.put("candidate", BemCommonUtil.getOpeartorId(submitJson));

        Long templateId = jsonObject.getLong("templateId");
        String appId = jsonObject.getString("appId");
        Integer taskId = jsonObject.getInteger("taskId");
        String taskDefKey = jsonObject.getString("taskDefKey");

        //查看有无工程
        if ("bem-f1-p2".equals(taskDefKey)) {
            AppPassAdviceExample appPassAdviceExample = new AppPassAdviceExample();
            com.bem.domain.AppPassAdviceExample.Criteria appPassAdvicecriteria = appPassAdviceExample.createCriteria();
            appPassAdvicecriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppPassAdvice> appPassAdvices = appPassAdviceMapper.selectByExample(appPassAdviceExample);
            if (appPassAdvices.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);
            }
            candidate.put("haveProject", 0 == appPassAdvices.size() ? null : appPassAdvices.get(0).getHavaProject());
        }

        //派工 设置下个环节办理人
        if ("bem-f1-p20".equals(taskDefKey)) {
            AppDispatchExample appDispatchExample = new AppDispatchExample();
            com.bem.domain.AppDispatchExample.Criteria appDispatchcriteria = appDispatchExample.createCriteria();
            appDispatchcriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppDispatch> appDispatches = appDispatchMapper.selectByExample(appDispatchExample);
            if (appDispatches.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
            if (0 < appDispatches.size()) {
                candidate.put("dispatchMan",
                        appDispatches.stream().map(p -> p.getDispatchMan().toString()).collect(Collectors.toList()));
            }
        }
        //现场情况说明
        if ("bem-f1-p19".equals(taskDefKey)) {
            AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
            com.bem.domain.AppCircumstanceExample.Criteria appCircumstancecriteria =
                    appCircumstanceExample.createCriteria();
            appCircumstancecriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppCircumstance> appCircumstances = appCircumstanceMapper.selectByExample(appCircumstanceExample);
            if (appCircumstances.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
            candidate.put("haveProject", 0 == appCircumstances.size() ? null :
                    appCircumstances.get(0).getHavaProject());
            candidate.put("isAccess", 0 == appCircumstances.size() ? null : appCircumstances.get(0).getIsAccess());
            candidate.put("isAnswer", 0 == appCircumstances.size() ? null : appCircumstances.get(0).getIsAnswer());

        }

        if ("bem-f1-p24".equals(taskDefKey)) {
            AppMeterInfoExample appMeterInfoExample = new AppMeterInfoExample();
            com.bem.domain.AppMeterInfoExample.Criteria appMeterInfoExampleCriteria =
                    appMeterInfoExample.createCriteria();
            appMeterInfoExampleCriteria.andAppIdEqualTo(Long.valueOf(appId)).
                    andTaskIdEqualTo(Long.valueOf(taskId));
            List<AppMeterInfo> appMeterInfos = appMeterInfoMapper.selectByExample(appMeterInfoExample);
            if (appMeterInfos.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
        }

        //录入工程信息
        if ("bem-f1-p6".equals(taskDefKey)) {
            AppDeclareInfoExample appDeclareInfoExample = new AppDeclareInfoExample();
            com.bem.domain.AppDeclareInfoExample.Criteria appDeclareInfoExampleCriteria =
                    appDeclareInfoExample.createCriteria();
            appDeclareInfoExampleCriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppDeclareInfo> appDeclareInfos = appDeclareInfoMapper.selectByExample(appDeclareInfoExample);
            if (appDeclareInfos.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
            candidate.put("designType", 0 == appDeclareInfos.size() ? null : appDeclareInfos.get(0).getDesignType());

        }

        //低压装表接电
        if ("bem-f1-p21".equals(taskDefKey)) {
            AppAssemExample appAssemExample = new AppAssemExample();
            com.bem.domain.AppAssemExample.Criteria appAssemExampleCriteria =
                    appAssemExample.createCriteria();
            appAssemExampleCriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppAssem> appAssems = appAssemMapper.selectByExample(appAssemExample);


            AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
            com.bem.domain.AppCircumstanceExample.Criteria appCircumstanceExampleCriteria =
                    appCircumstanceExample.createCriteria();
            appCircumstanceExampleCriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppCircumstance> appCircumstances = appCircumstanceMapper.selectByExample(appCircumstanceExample);

            if (appAssems.size() < 1 || appCircumstances.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
            //判断文件
            boolean existsFile =
                    appFileService.existsFile(appId, taskId.toString());
            if (!existsFile) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有上传文件", null);
            }

        }

        //低压装表接电
        if ("bem-f1-p28".equals(taskDefKey)) {
            AppMoneyRecallExample appMoneyRecallExample = new AppMoneyRecallExample();
            com.bem.domain.AppMoneyRecallExample.Criteria appMoneyRecallExampleCriteria =
                    appMoneyRecallExample.createCriteria();
            appMoneyRecallExampleCriteria.andAppIdEqualTo(appId).
                    andTaskIdEqualTo(taskId);
            List<AppMoneyRecall> appMoneyRecalls =
                    appMoneyRecallMapper.selectByExample(appMoneyRecallExample);

            if (appMoneyRecalls.size() < 1 || appMoneyRecalls.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有生成退费记录无法提交",
                        null);

            }
        }


        //增减容
        if ("bem-f1-p25".equals(taskDefKey)) {
            AppTransformerInfoExample appTransformerInfoExample =
                    new AppTransformerInfoExample();
            com.bem.domain.AppTransformerInfoExample.Criteria appTransformerInfoExampleCriteria =
                    appTransformerInfoExample.createCriteria();
            appTransformerInfoExampleCriteria.andAppIdEqualTo(Long.valueOf(appId)).
                    andTaskIdEqualTo(Long.valueOf(taskId));
            List<AppTransformerInfo> appTransformerInfos =
                    appTransformerInfoMapper.selectByExample(appTransformerInfoExample);
            if (appTransformerInfos.size() < 1) {
                return new HttpResult<>(HttpResult.ERROR, "该环节没有办理无法提交", null);

            }
            /*按照变压器号去重
            List<AppTransformerInfo> returnAppTransformer =
                    appTransformerInfos.stream().collect(
                            Collectors.collectingAndThen(Collectors.toCollection(
                                    () -> new TreeSet<>(Comparator.comparing(t->t.getTransformerNo()))),
                                    ArrayList::new));*/

            //按照计量点号 分组
            Map<Long, List<AppTransformerInfo>> returnAppTransformerMap =
                    appTransformerInfos.stream().collect(Collectors.groupingBy(AppTransformerInfo::getMeterId));

            for (Map.Entry<Long, List<AppTransformerInfo>> entry :
                    returnAppTransformerMap.entrySet()) {
                //一个计量点只有一块变压器资产号 组号置空
                if (entry.getValue().size() == 1) {
                    entry.getValue().forEach(t -> {
                        t.setTransformerGroupNo(null);
                        appTransformerInfoMapper.updateByPrimaryKey(t);
                    });
                }
                //有一个以上的变压器资产号 判断有无组号 并且是否一致
                if (entry.getValue().size() > 1) {
                    //按变压器组号分组包含null 筛选非拆的
                    List<AppTransformerInfo> returnAppTransformer =
                            entry.getValue().stream().filter(t -> !Objects.equals(t.getLoadChangeSign(), 1)).
                                    collect(Collectors.collectingAndThen(
                                            Collectors.toCollection(() ->
                                                    new TreeSet<>(Comparator.comparing(AppTransformerInfo::getTransformerGroupNo, Comparator.nullsLast(String::compareTo)))),
                                            ArrayList::new));

                    if (returnAppTransformer.size() > 1) {
                        return new HttpResult<>(HttpResult.ERROR,
                                "同一计量点下的变压器组号必须相同，请更改完再传递", null);
                    }
                    if (returnAppTransformer.get(0).getTransformerGroupNo() == null
                            || "".equals(returnAppTransformer.get(0).getTransformerGroupNo())) {
                        return new HttpResult<>(HttpResult.ERROR,
                                "同一计量点下的变压器组号必须相同且不能为空，请更改完再传递", null);
                    }

                    returnAppTransformer =
                            entry.getValue().stream().filter(t -> !Objects.equals(t.getLoadChangeSign(), 1)).
                                    collect(Collectors.collectingAndThen(
                                            Collectors.toCollection(() ->
                                                    new TreeSet<>(Comparator.comparing(AppTransformerInfo::getMsType))),
                                            ArrayList::new));

                    if (returnAppTransformer.size() > 1) {
                        return new HttpResult<>(HttpResult.ERROR,
                                "同一计量点下的变压器计量方式必须相同，请更改完再传递", null);
                    }

                }
            }
        }
        //如果是最后一个环节 同步档案
        //获取电费还是业扩流程
        SystemCommonConfigEntity paramCommonConfigEntity = new SystemCommonConfigEntity();

        paramCommonConfigEntity.setType("TEMPLATE_TYPE");
        // 根据结算户获取计量点id
        String returnSystemCommonConfig =
                restTemplate.postForObject(PropertiesUtil.getValue("findSystemCommonConfigByType"), paramCommonConfigEntity,
                        String.class);

        List<SystemCommonConfigEntity> systemCommonConfigEntities =
                JSONObject.parseArray(returnSystemCommonConfig, SystemCommonConfigEntity.class);

        Map<Long, SystemCommonConfigEntity> templateTypeMap =
                systemCommonConfigEntities.stream().collect(Collectors.toMap(SystemCommonConfigEntity::getParamKey, a -> a, (k1, k2) -> k1));

        SystemCommonConfigEntity systemCommonConfigEntity = templateTypeMap.get(templateId);


        //电费流程
        if (systemCommonConfigEntity.getRemark1() != null && "DF".equals(systemCommonConfigEntity.getRemark1())) {
            AppSettlementInfo appSettlementInfo = new AppSettlementInfo();
            appSettlementInfo.setId(Long.valueOf(appId));
            if (null != jsonObject.getString("processInstanceId") && activitiService.judgeLastTask(taskId.toString())) {
                appSettlementInfo.setAppStatus("C");
            } else {
                appSettlementInfo.setAppStatus("Y");
            }
            appSettlementInfoMapper.updateByPrimaryKeySelective(appSettlementInfo);
        } else {
            //业扩流程
            AppUserInfo appUserInfo = new AppUserInfo();
            appUserInfo.setId(Long.valueOf(appId));
            if (null != jsonObject.getString("processInstanceId") &&activitiService.judgeLastTask(taskId.toString())) {
                appUserInfo.setAppStatus("C");
                appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);

                //流程结束自动更新档案
                if (BemEnum.getEnumByKey(templateId.toString()).getIsBuild() == 1) {
                    HttpResult httpResult =
                            updateFiles(jsonObject.toJSONString());
                    if (httpResult.getStatusCode() != HttpResult.SUCCESS) {
                        return httpResult;
                    }
                }
            } else {
                appUserInfo.setAppStatus("Y");
                appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);
            }
        }

        activitiService.setAssignee(taskId.toString(), BemCommonUtil.getOpeartorId(submitJson));
        activitiService.compleTask(taskId.toString(), candidate);

        return new HttpResult<>(HttpResult.SUCCESS,"提交成功",null);
}

    /**
     * 某一次流程执行了多少步
     */
    @RequestMapping("/queryHistoricActivitiInstance")
    @ResponseBody
    public void queryHistoricActivitiInstance() {
        activitiService.queryHistoricActivitiInstance("27503");
    }

    /**
     * 某一次流程的执行经历的多少任务
     */
    @RequestMapping("/queryHistoricTask")
    @ResponseBody
    public HttpResult queryHistoricTask(@RequestBody String processInstanceIdJson) {
        JSONObject processInstanceIdObject = JSONObject.parseObject(processInstanceIdJson);
        List<Map<String, Object>> taskList =
                taskListService.queryHistoricTask(processInstanceIdObject.getString("processInstanceId"));
        List<Long> assignees = new ArrayList<>();
        taskList.forEach(t -> {
            assignees.add(t.get("assignee") == null ? null : Long.valueOf(t.get("assignee").toString()));
        });

        //得到营业区域no
        String assigneesJson =
                restTemplate.postForObject("http://TITAN-REPORT/report/auth/findUSerByIds", assignees, String.class);
        List<UserDomain> userDomains =
                JSONObject.parseArray(assigneesJson, UserDomain.class);
        Map<String, String> userDomainMap =
                userDomains.stream().collect(Collectors.toMap(o -> o.getId().toString(), a -> a.getUserName(), (k1, k2) -> k1));

        //倒序赋值
        for (int i = 0; i < taskList.size(); i++) {
            Map<String, Object> t = taskList.get(i);
            Map<String, Object> prTaskt = taskList.get(i == 0 ? 0 : i - 1);
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("id", t.get("writeSectId"));
            String writeSectJson =
                    restTemplate.postForObject(PropertiesUtil.getValue("getWriteSectByKey"), jsonObject, String.class);
            t.put("writeSectName",
                    JSONObject.parseObject(writeSectJson).getString("writeSectName"));
            t.put("assigneeName", userDomainMap.get(t.get("assignee")));
            t.put("preAssigneeName", userDomainMap.get(prTaskt.get("assignee")));
            t.put("taskStartTime",t.get("startTime"));
            t.put("taskEndTime",t.get("endTime"));

            switch (t.get("taskDefKey").toString()) {
                case "bem-f1-p1":
                    AppUserInfoExample appUserInfoExample = new AppUserInfoExample();
                    AppUserInfoExample.Criteria appUserInfoExampleCriteria =
                            appUserInfoExample.createCriteria();
                    appUserInfoExampleCriteria.andProcInstIdEqualTo(t.get("processInstanceId").toString());
                    List<AppUserInfo> returnAppUserInfo = new ArrayList<>();
                    returnAppUserInfo =
                            appUserInfoMapper.selectByExample(appUserInfoExample);
                    if (returnAppUserInfo.size() >= 1) {
                        t.put("taskStartTime",
                                returnAppUserInfo.get(0).getApplyDate());
                        t.put("taskEndTime",
                                returnAppUserInfo.get(0).getSubmitDate());
                    }
                    break;
                case "bem-f1-p19":
                    AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
                    AppCircumstanceExample.Criteria circumCriteria = appCircumstanceExample.createCriteria();
                    circumCriteria.andProcessInstanceIdEqualTo(Long.parseLong(t.get("processInstanceId").toString()));
                    List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
                    returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
                    if (returnAppCircumstance.size() >= 1) {
                        t.put("taskEndTime",
                                returnAppCircumstance.get(0).getPowerSupplyDate());
                    }
                    break;
                case "bem-f1-p9":
                    AppCompeleteExample appCompeleteExample = new AppCompeleteExample();
                    AppCompeleteExample.Criteria compeleteCriteria = appCompeleteExample.createCriteria();
                    compeleteCriteria.andProcessInstanceIdEqualTo(Long.parseLong(t.get("processInstanceId").toString()));
                    List<AppCompelete> returnAppCompelete = new ArrayList<>();
                    returnAppCompelete = appCompeleteMapper.selectByExample(appCompeleteExample);
                    if (returnAppCompelete.size() >= 1) {
                        t.put("taskEndTime",
                                returnAppCompelete.get(0).getConstructionDate());
                    }
                    break;
                case "bem-f1-p23":
                    AppAssemExample appAssemExample = new AppAssemExample();
                    AppAssemExample.Criteria assemCriteria = appAssemExample.createCriteria();
                    assemCriteria.andProcessInstanceIdEqualTo(Long.parseLong(t.get("processInstanceId").toString()));
                    List<AppAssem> returnAppAssem = new ArrayList<>();
                    returnAppAssem = appAssemMapper.selectByExample(appAssemExample);
                    if (returnAppAssem.size() >= 1) {
                        t.put("taskEndTime",
                                returnAppAssem.get(0).getAssemDate());
                    }
                    break;
                case "bem-f1-p21":
                    AppAssemExample appAssemExample21 = new AppAssemExample();
                    AppAssemExample.Criteria assemCriteria21 = appAssemExample21.createCriteria();
                    assemCriteria21.andProcessInstanceIdEqualTo(Long.parseLong(t.get("processInstanceId").toString()));
                    List<AppAssem> returnAppAssem21 = new ArrayList<>();
                    returnAppAssem21 = appAssemMapper.selectByExample(appAssemExample21);
                    if (returnAppAssem21.size() >= 1) {
                        t.put("taskEndTime",
                                returnAppAssem21.get(0).getAssemDate());
                    }
                    break;
            }
            if (!"bem-f1-p1".equals(t.get("taskDefKey").toString())) {
                t.put("taskStartTime", prTaskt.get("taskEndTime"));
            }

        }

        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", taskList);

    }


    /**
     * 已完结任务时间
     */
    @RequestMapping("/queryFinishApp")
    @ResponseBody
    public HttpResult queryFinishApp(@RequestBody(required = false) String processInstanceIdJson) {
        JSONObject hignOrlow = JSONObject.parseObject(processInstanceIdJson);
        List<Map<String, Object>> finishApps = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        PageInfo<Map<String, Object>> pageInfo = null;
        JSONObject userRight = JSONObject.parseObject(processInstanceIdJson);
        System.out.println("");
        userMap.put("userDepts", BemCommonUtil.getOpeartorDeptIds(processInstanceIdJson));
        userMap.put("businessPlaceCode", userRight.getString("businessPlaceCode"));
        userMap.put("appNo", userRight.getString("appNo"));
        userMap.put("userName", userRight.getString("userName"));
        userMap.put("templateId", userRight.getString("templateId"));
        userMap.put("userNo", userRight.getString("userNo"));
        //判断分页传入值是不是数字类型
        //出现传参问题 默认查前十条
        boolean isNumeric = BemCommonUtil.isNumeric(userRight.getString("pageCurrent"), userRight.getString("pageSize"));
        if ("high".equals(hignOrlow.getString("val"))) {
            if (isNumeric) {
                pageInfo =
                        PageHelper.startPage(userRight.getInteger("pageCurrent"), userRight.getInteger("pageSize")).
                                doSelectPageInfo(() -> this.taskListService.queryHighFinishApp(userMap));
            } else {
                pageInfo =
                        PageHelper.startPage(1, 10).doSelectPageInfo(() -> this.taskListService.queryHighFinishApp(userMap));
            }
            finishApps = pageInfo.getList();
            //finishApps=taskListService.queryHighFinishApp(userMap);
        } else if (("low".equals(hignOrlow.getString("val")))) {
            if (isNumeric) {
                pageInfo =
                        PageHelper.startPage(userRight.getInteger("pageCurrent"), userRight.getInteger("pageSize")).
                                doSelectPageInfo(() -> this.taskListService.queryLowFinishApp(userMap));
            } else {
                pageInfo =
                        PageHelper.startPage(1, 10).
                                doSelectPageInfo(() -> this.taskListService.queryLowFinishApp(userMap));
            }
            finishApps = pageInfo.getList();
            //finishApps=taskListService.queryLowFinishApp(userMap);
        } else {
            if (isNumeric) {
                pageInfo =
                        PageHelper.startPage(userRight.getInteger("pageCurrent"), userRight.getInteger("pageSize")).
                                doSelectPageInfo(() -> this.taskListService.queryFinishApp(userMap));
            } else {
                pageInfo =
                        PageHelper.startPage(1, 10).
                                doSelectPageInfo(() -> this.taskListService.queryFinishApp(userMap));
            }
            finishApps = pageInfo.getList();
        }
        if (finishApps == null || finishApps.size() <= 0) {
            return new HttpResult<>(HttpResult.ERROR, "无完成数据", null);
        }
        for (int i = 0; i < finishApps.size(); i++) {
            List<Map<String, Object>> finishTasks = taskListService.queryFinishTask(finishApps.get(i).get("processInstanceId").toString());
            for (int j = 0; j < finishTasks.size(); j++) {
                switch (finishTasks.get(j).get("taskDefKey").toString()) {
                    /*case "bem-f1-p1":
                        finishApps.get(i).put("submitDate", finishTasks.get(j).get("endTime"));
                        break;*/
                    case "bem-f1-p19":
                        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
                        AppCircumstanceExample.Criteria circumCriteria = appCircumstanceExample.createCriteria();
                        circumCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
                        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
                        if (returnAppCircumstance.size() >= 1) {
                            finishApps.get(i).put("powerSupplyDate", returnAppCircumstance.get(0).getPowerSupplyDate());
                        }
                        break;
                    case "bem-f1-p9":
                        AppCompeleteExample appCompeleteExample = new AppCompeleteExample();
                        AppCompeleteExample.Criteria compeleteCriteria = appCompeleteExample.createCriteria();
                        compeleteCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppCompelete> returnAppCompelete = new ArrayList<>();
                        returnAppCompelete = appCompeleteMapper.selectByExample(appCompeleteExample);
                        if (returnAppCompelete.size() >= 1) {
                            finishApps.get(i).put("constructionDate", returnAppCompelete.get(0).getConstructionDate());
                        }
                        break;
                    case "bem-f1-p23":
                        AppAssemExample appAssemExample = new AppAssemExample();
                        AppAssemExample.Criteria assemCriteria = appAssemExample.createCriteria();
                        assemCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppAssem> returnAppAssem = new ArrayList<>();
                        returnAppAssem = appAssemMapper.selectByExample(appAssemExample);
                        if (returnAppAssem.size() >= 1) {
                            finishApps.get(i).put("assemDate", returnAppAssem.get(0).getAssemDate());
                        }
                        break;
                    case "bem-f1-p22":
                        finishApps.get(i).put("assemDateDY", finishTasks.get(j).get("endTime"));
                        break;
                    case "bem-f1-p21":
                        AppAssemExample appAssemExample21 = new AppAssemExample();
                        AppAssemExample.Criteria assemCriteria21 = appAssemExample21.createCriteria();
                        assemCriteria21.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppAssem> returnAppAssem21 = new ArrayList<>();
                        returnAppAssem21 = appAssemMapper.selectByExample(appAssemExample21);
                        if (returnAppAssem21.size() >= 1) {
                            finishApps.get(i).put("assemDateDY", returnAppAssem21.get(0).getAssemDate());
                        }
                        break;
                }
            }

        }
        pageInfo.setList(finishApps);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", pageInfo);

    }


    /**
     * 已完结任务时间
     */
    @RequestMapping("/queryFinishAppDage")
    @ResponseBody
    public HttpResult queryFinishAppDage(@RequestBody(required = false) String processInstanceIdJson) {
        JSONObject hignOrlow = JSONObject.parseObject(processInstanceIdJson);
        List<Map<String, Object>> finishApps = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        JSONObject userRight = JSONObject.parseObject(processInstanceIdJson);
        userMap.put("userDepts", BemCommonUtil.getOpeartorDeptIds(processInstanceIdJson));
        userMap.put("appNo", userRight.getString("appNo"));
        userMap.put("userName", userRight.getString("userName"));
        finishApps = taskListService.queryFinishAppDate(userMap);
        return new HttpResult<>(HttpResult.SUCCESS, "查询成功", finishApps);
    }

    //流程作废
    @RequestMapping("/stopProcessInstance")
    @ResponseBody
    public HttpResult stopProcessInstance(@RequestBody(required = false) String stopJson) {
        JSONObject stopObject = JSONObject.parseObject(stopJson);
        Long templateId = stopObject.getLong("templateId");
        Long appId = new Long(stopObject.getString("appId"));

        //获取电费还是业扩流程
        SystemCommonConfigEntity paramCommonConfigEntity = new SystemCommonConfigEntity();

        paramCommonConfigEntity.setType("TEMPLATE_TYPE");
        // 根据结算户获取计量点id
        String returnSystemCommonConfig =
                restTemplate.postForObject(PropertiesUtil.getValue("findSystemCommonConfigByType"), paramCommonConfigEntity,
                        String.class);

        List<SystemCommonConfigEntity> systemCommonConfigEntities =
                JSONObject.parseArray(returnSystemCommonConfig, SystemCommonConfigEntity.class);

        Map<Long, SystemCommonConfigEntity> templateTypeMap =
                systemCommonConfigEntities.stream().collect(Collectors.toMap(SystemCommonConfigEntity::getParamKey, a -> a, (k1, k2) -> k1));

        SystemCommonConfigEntity systemCommonConfigEntity = templateTypeMap.get(templateId);

        try {
            //判断流程是否结束 加结束标识
            //电费流程
            if (systemCommonConfigEntity.getRemark1() != null && "DF".equals(systemCommonConfigEntity.getRemark1())) {
                AppSettlementInfo appSettlementInfo = new AppSettlementInfo();
                appSettlementInfo.setId(appId);
                appSettlementInfo.setAppStatus("N");
                appSettlementInfoMapper.updateByPrimaryKeySelective(appSettlementInfo);
            } else {
                AppUserInfo appUserInfo = new AppUserInfo();
                appUserInfo.setId(appId);
                appUserInfo.setAppStatus("N");
                appUserInfoMapper.updateByPrimaryKeySelective(appUserInfo);
            }

            //若已完成无法作废
            if (!activitiService.isEnd(stopObject.getString("processInstanceId"))) {
                activitiService.stopProcessInstance(stopObject.getString("processInstanceId"), BemCommonUtil.getOpeartorId(stopJson));
            }
            return new HttpResult<>(HttpResult.SUCCESS, "作废成功");
        } catch (Exception e) {
            return new HttpResult<>(HttpResult.SUCCESS, "作废失败");
        }
    }

    @RequestMapping("/isEnd")
    @ResponseBody
    public void isEnd() {
        activitiService.isEnd("7511");

    }

    @RequestMapping("/compleTask")
    @ResponseBody
    public void compleTask() throws Exception {
        Map<String, Object> aa = new HashMap<>();
        aa.put("aa", "aa");
        activitiService.compleTask("27503", aa);

    }

    @RequestMapping("/getHistoryProcessVariables")
    @ResponseBody
    public void getHistoryProcessVariables() throws Exception {
        activitiService.getHistoryProcessVariables("27503");

    }

    /**
     * 回退
     *
     * @param taskRollbackJson
     * @return
     */
    @RequestMapping("/taskRollback")
    @ResponseBody
    public HttpResult taskRollback(String taskRollbackJson) {
        JSONObject taskRollback = JSONObject.parseObject(taskRollbackJson);
        List<HistoricTaskInstance> list = activitiService.queryHistoricTask(taskRollback.getString("processInstanceId"));
        if (list != null) {
            activitiService.turnTask(taskRollback.getString("taskId"), list.get(0).getId(),
                    BemCommonUtil.getOpeartorId(taskRollbackJson));
        }
        return new HttpResult<>(HttpResult.SUCCESS, "回退成功", null);
    }

    @RequestMapping("/getWebStatus")
    @ResponseBody
    public String getStatus(@RequestBody(required = false) String userNoJson) {
        JSONObject userNoJSONObject = JSONObject.parseObject(userNoJson);

        return null;
    }

    @RequestMapping("/updateFiles")
    @ResponseBody
    public HttpResult updateFiles(@RequestBody(required = false) String updateFilesJson) {
        //组装用户信息
        JSONObject updateJSONObject = JSONObject.parseObject(updateFilesJson);
        Long appId = updateJSONObject.getLong("appId");
        //用户信息
        AppUserInfo updateAppUserInfo =
                appUserInfoMapper.selectByPrimaryKey(appId);
        // 客户信息
        AppCustomerInfo updateAppCustomer =
                appCustomerInfoMapper.selectByPrimaryKey(updateAppUserInfo.getCustomerId());

        //结算户信息
        AppSettlementInfo appSettlementInfo = new AppSettlementInfo();
        appSettlementInfo.setSettlementNo(updateAppUserInfo.getUserNo());
        appSettlementInfo.setSettlementName(updateAppUserInfo.getUserName());
        appSettlementInfo.setAddress(updateAppUserInfo.getAddress());
        appSettlementInfo.setSettlementPhone(updateAppUserInfo.getPhoneNumber());
        if (updateAppCustomer != null) {
            appSettlementInfo.setCuscc(updateAppCustomer.getCardNo());
        }
        appSettlementInfo.setBusinessPlaceCode((long) updateAppUserInfo.getBusinessPlaceCode());
        appSettlementInfo.setStatus((long) 1);

        //计量点信息
        AppMeterInfo appMeterInfo = new AppMeterInfo();
        appMeterInfo.setAppId(appId);
        List<AppMeterInfo> updateAppMeterInfos = appMeterInfoMapper.select(appMeterInfo);
        //变压器信息
        AppTransformerInfo appTransformerInfo = new AppTransformerInfo();
        appTransformerInfo.setAppId(appId);
        List<AppTransformerInfo> updateAppTransformers = appTransformerInfoMapper.select(appTransformerInfo);

        List<TransformerMeterRelationEntity> updateTransMeterRelEntities
                = new ArrayList<>();
        //构造变压器关系实体
        updateAppTransformers.forEach(t -> {
            TransformerMeterRelationEntity transformerMeterRelationEntity =
                    new TransformerMeterRelationEntity();
            transformerMeterRelationEntity.setId(t.getTransformerRelId());
            transformerMeterRelationEntity.setTransformerId(t.getTransformerId());
            transformerMeterRelationEntity.setMeterId(t.getMeterId());
            transformerMeterRelationEntity.setMsType(t.getMsType());
            transformerMeterRelationEntity.setCreateDate(new Date());
            transformerMeterRelationEntity.setTransformerGroupNo(t.getTransformerGroupNo());
            transformerMeterRelationEntity.setLoadChangeSign(t.getLoadChangeSign());
            transformerMeterRelationEntity.setStatus((byte) 1);
            updateTransMeterRelEntities.add(transformerMeterRelationEntity);
        });

        JSONObject postData = new JSONObject();
        postData.put("userInfo", updateAppUserInfo==null?null:updateAppUserInfo);
        postData.put("customerInfo", updateAppCustomer==null?null:updateAppCustomer);
        postData.put("meterInfo",
                updateAppMeterInfos==null||updateAppMeterInfos.size()<1?null:updateAppMeterInfos);
        postData.put("settlement", appSettlementInfo==null?null:appSettlementInfo);
        postData.put("templateId", updateAppUserInfo.getTemplateId());
        postData.put("transformerRel",
                updateTransMeterRelEntities==null||updateTransMeterRelEntities.size()<1?null:updateTransMeterRelEntities);

        //发送到cim 更新档案
        String resturnJson =
                restTemplate.postForObject(PropertiesUtil.getValue("bemAddReceive"), postData, String.class);

        JSONObject resturnJSONObject = JSONObject.parseObject(resturnJson);
        if ("200".equals(resturnJSONObject.getString("statusCode"))) {
            return new HttpResult<>(HttpResult.SUCCESS, "更新档案成功");
        } else {
            return new HttpResult<>(HttpResult.ERROR,
                    "更新档案失败" + resturnJSONObject.getString("message"));
        }

    }


}
