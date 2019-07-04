package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.HistoricTaskInstanceEntityExt;
import com.bem.common.RestultContent;
import com.bem.domain.*;
import com.bem.mapper.*;
import com.bem.service.ActivitiService;
import com.bem.service.TaskListService;
import com.bem.util.BemCommonUtil;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.runtime.ProcessInstance;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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




    @RequestMapping(value = "/getTaskList")
    @ResponseBody
    public RestultContent getTaskList(@RequestBody(required = false) String userRightJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        List<Map<String, Object>> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        JSONObject userRight = JSONObject.parseObject(userRightJson);
        //获得用户信息
        userMap.put("userId", BemCommonUtil.getOpeartorId(userRightJson));
        //userMap.put("roleIds","1");
        userMap.put("roleIds", BemCommonUtil.getOpeartorRoleIds(userRightJson));
        userMap.put("userDepts",BemCommonUtil.getOpeartorDeptIds(userRightJson));

        userMap.put("businessPlaceCode",userRight.getString("businessPlaceCode"));
        userMap.put("appNo",userRight.getString("appNo"));
        userMap.put("userName",userRight.getString("userName"));
        taskMap = taskListService.selectUserByApp(userMap);

        restultContent.setStatus(200);
        restultContent.setData(taskMap);
        return restultContent;
    }


    /**
     * @param submitJson
     * @return
     */
    @RequestMapping("/submit")
    @ResponseBody
    public RestultContent submit(@RequestBody(required = false) String submitJson) throws Exception {
        JSONObject jsonObject = JSONObject.parseObject(submitJson);
        RestultContent restultContent = new RestultContent();
        Map<String, Object> candidate = new HashMap<>();
        candidate.put("candidate", BemCommonUtil.getOpeartorId(submitJson));

        //查看有无工程
        if ("bem-f1-p2".equals(jsonObject.get("taskDefKey"))) {
            AppPassAdviceExample appPassAdviceExample = new AppPassAdviceExample();
            com.bem.domain.AppPassAdviceExample.Criteria appPassAdvicecriteria = appPassAdviceExample.createCriteria();
            appPassAdvicecriteria.andAppIdEqualTo(jsonObject.getString("appId")).
                    andTaskIdEqualTo(new Integer(jsonObject.getString("taskId")));
            List<AppPassAdvice> appPassAdvices = appPassAdviceMapper.selectByExample(appPassAdviceExample);
            candidate.put("haveProject", 0 == appPassAdvices.size() ? null : appPassAdvices.get(0).getHavaProject());
        }

        //派工 设置下个环节办理人
        if ("bem-f1-p20".equals(jsonObject.get("taskDefKey"))) {
            AppDispatchExample appDispatchExample = new AppDispatchExample();
            com.bem.domain.AppDispatchExample.Criteria appDispatchcriteria = appDispatchExample.createCriteria();
            appDispatchcriteria.andAppIdEqualTo(jsonObject.getString("appId")).
                    andTaskIdEqualTo(new Integer(jsonObject.getString("taskId")));
            List<AppDispatch> appDispatches = appDispatchMapper.selectByExample(appDispatchExample);
            if (0 < appDispatches.size()) {
                candidate.put("dispatchMan",
                        appDispatches.stream().map(p -> p.getDispatchMan().toString()).collect(Collectors.toList()));
            }
        }
        //现场情况说明
        if ("bem-f1-p19".equals(jsonObject.get("taskDefKey"))) {
            AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
            com.bem.domain.AppCircumstanceExample.Criteria appCircumstancecriteria =
                    appCircumstanceExample.createCriteria();
            appCircumstancecriteria.andAppIdEqualTo(jsonObject.getString("appId")).
                    andTaskIdEqualTo(new Integer(jsonObject.getString("taskId")));
            List<AppCircumstance> appCircumstances = appCircumstanceMapper.selectByExample(appCircumstanceExample);
            candidate.put("haveProject", 0 == appCircumstances.size() ? null :
                    appCircumstances.get(0).getHavaProject());
            candidate.put("isAccess", 0 == appCircumstances.size() ? null : appCircumstances.get(0).getIsAccess());
            candidate.put("isAnswer", 0 == appCircumstances.size() ? null : appCircumstances.get(0).getIsAnswer());

        }

        //录入工程信息
        if ("bem-f1-p6".equals(jsonObject.get("taskDefKey"))) {
            AppDeclareInfoExample appDeclareInfoExample = new AppDeclareInfoExample();
            com.bem.domain.AppDeclareInfoExample.Criteria appDeclareInfoExampleCriteria =
                    appDeclareInfoExample.createCriteria();
            appDeclareInfoExampleCriteria.andAppIdEqualTo(jsonObject.getString("appId")).
                    andTaskIdEqualTo(new Integer(jsonObject.getString("taskId")));
            List<AppDeclareInfo> appDeclareInfos = appDeclareInfoMapper.selectByExample(appDeclareInfoExample);
            candidate.put("designType", 0 == appDeclareInfos.size() ? null : appDeclareInfos.get(0).getDesignType());

        }
        //提交设置当前提交人为办理人
        activitiService.setAssignee(jsonObject.getString("taskId"), BemCommonUtil.getOpeartorId(submitJson));
        activitiService.compleTask(jsonObject.getString("taskId"), candidate);
        restultContent.setStatus(200);
        return restultContent;
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
    public RestultContent queryHistoricTask(@RequestBody String processInstanceIdJson) {
        JSONObject jsonObject = JSONObject.parseObject(processInstanceIdJson);
        RestultContent restultContent = new RestultContent();
        restultContent.setStatus(200);
        restultContent.setData(taskListService.queryHistoricTask(jsonObject.getString("processInstanceId")));
        return restultContent;

    }


    /**
     * 已完结任务时间
     */
    @RequestMapping("/queryFinishApp")
    @ResponseBody
    public RestultContent queryFinishApp(@RequestBody(required = false) String processInstanceIdJson) {
        RestultContent restultContent = new RestultContent();
        JSONObject hignOrlow = JSONObject.parseObject(processInstanceIdJson);
        List<Map<String, Object>> finishApps = new ArrayList<>();
        Map<String,Object> userMap=new HashMap<>();
        JSONObject userRight = JSONObject.parseObject(processInstanceIdJson);
        userMap.put("userDepts",BemCommonUtil.getOpeartorDeptIds(processInstanceIdJson));
        userMap.put("businessPlaceCode",userRight.getString("businessPlaceCode"));
        userMap.put("appNo",userRight.getString("appNo"));
        userMap.put("userName",userRight.getString("userName"));
        if ("high".equals(hignOrlow.getString("val"))){
            finishApps = taskListService.queryHighFinishApp(userMap);
        }else{
            finishApps = taskListService.queryLowFinishApp(userMap);
        }
        if(finishApps==null || finishApps.size()<=0){
            restultContent.setStatus(200);
            restultContent.setData(finishApps);
            restultContent.setErrorMsg("无完成数据");
            return restultContent;
        }
        for (int i = 0; i < finishApps.size(); i++) {
            List<Map<String, Object>> finishTasks = taskListService.queryFinishTask(finishApps.get(i).get("processInstanceId").toString());
            for (int j = 0; j < finishTasks.size(); j++) {
                switch (finishTasks.get(j).get("taskDefKey").toString()) {
                    case "bem-f1-p1":
                        finishApps.get(i).put("submitDate", finishTasks.get(j).get("endTime"));
                        break;
                    case "bem-f1-p19":
                        AppCircumstanceExample appCircumstanceExample = new AppCircumstanceExample();
                        AppCircumstanceExample.Criteria circumCriteria = appCircumstanceExample.createCriteria();
                        circumCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppCircumstance> returnAppCircumstance = new ArrayList<>();
                        returnAppCircumstance = appCircumstanceMapper.selectByExample(appCircumstanceExample);
                        finishApps.get(i).put("powerSupplyDate", returnAppCircumstance.get(0).getPowerSupplyDate());
                        break;
                    case "bem-f1-p9":
                        AppCompeleteExample appCompeleteExample = new AppCompeleteExample();
                        AppCompeleteExample.Criteria compeleteCriteria = appCompeleteExample.createCriteria();
                        compeleteCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppCompelete> returnAppCompelete = new ArrayList<>();
                        returnAppCompelete = appCompeleteMapper.selectByExample(appCompeleteExample);
                        finishApps.get(i).put("constructionDate", returnAppCompelete.get(0).getConstructionDate());
                        break;
                    case "bem-f1-p23":
                        AppAssemExample appAssemExample = new AppAssemExample();
                        AppAssemExample.Criteria assemCriteria = appAssemExample.createCriteria();
                        assemCriteria.andProcessInstanceIdEqualTo(Long.parseLong(finishTasks.get(j).get("processInstanceId").toString()));
                        List<AppAssem> returnAppAssem = new ArrayList<>();
                        returnAppAssem = appAssemMapper.selectByExample(appAssemExample);
                        finishApps.get(i).put("assemDate", returnAppAssem.get(0).getAssemDate());
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
                        finishApps.get(i).put("assemDateDY", returnAppAssem21.get(0).getAssemDate());
                        break;
                }
            }

        }
        restultContent.setStatus(200);
        restultContent.setData(finishApps);
        return restultContent;

    }


    /**
     * 已完结任务时间
     */
    @RequestMapping("/queryFinishAppDage")
    @ResponseBody
    public RestultContent queryFinishAppDage(@RequestBody(required = false) String processInstanceIdJson) {
        RestultContent restultContent = new RestultContent();
        JSONObject hignOrlow = JSONObject.parseObject(processInstanceIdJson);
        List<Map<String, Object>> finishApps = new ArrayList<>();
        Map<String,Object> userMap=new HashMap<>();
        JSONObject userRight = JSONObject.parseObject(processInstanceIdJson);
        userMap.put("userDepts",BemCommonUtil.getOpeartorDeptIds(processInstanceIdJson));
        userMap.put("appNo",userRight.getString("appNo"));
        userMap.put("userName",userRight.getString("userName"));
        finishApps = taskListService.queryFinishAppDate(userMap);
        restultContent.setStatus(200);
        restultContent.setData(finishApps);
        return restultContent;

    }

    @RequestMapping("/stopProcessInstance")
    @ResponseBody
    public void stopProcessInstance(String processInstanceId) {
        activitiService.stopProcessInstance(processInstanceId);
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
    public RestultContent taskRollback(String taskRollbackJson) {
        JSONObject taskRollback = JSONObject.parseObject(taskRollbackJson);
        List<HistoricTaskInstance> list = activitiService.queryHistoricTask(taskRollback.getString("processInstanceId"));
        if (list != null) {
            activitiService.turnTask(taskRollback.getString("taskId"), list.get(0).getId(),
                    BemCommonUtil.getOpeartorId(taskRollbackJson));
        }
        RestultContent restultContent = new RestultContent();
        restultContent.setStatus(200);
        return restultContent;
    }



}
