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

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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


    @RequestMapping(value = "/getTaskList")
    @ResponseBody
    public RestultContent getTaskList(@RequestBody(required = false) String userRightJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        List<Map<String, Object>> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        //获得用户信息
        userMap.put("userId", BemCommonUtil.getOpeartorId(userRightJson));
        //userMap.put("roleIds","1");
        userMap.put("roleIds", BemCommonUtil.getOpeartorRoleIds(userRightJson));
        taskMap = taskListService.selectUserByApp(userMap);

        // System.out.println(result);
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
