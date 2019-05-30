package com.bem.service;

import com.bem.bemEnum.BemEnum;
import com.bem.common.HistoricTaskInstanceEntityExt;
import org.activiti.bpmn.model.BpmnModel;
import org.activiti.bpmn.model.FlowNode;
import org.activiti.bpmn.model.SequenceFlow;
import org.activiti.engine.*;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.history.HistoricVariableInstance;
import org.activiti.engine.impl.identity.Authentication;
import org.activiti.engine.impl.persistence.entity.HistoricTaskInstanceEntityImpl;
import org.activiti.engine.impl.persistence.entity.ProcessDefinitionEntity;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.repository.ProcessDefinition;
import org.activiti.engine.runtime.Execution;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author ：zjd
 * @date ：Created in 2019/2/26 8:24
 */
@Service
public class ActivitiService {
    @Autowired
    private ProcessEngine processEngine;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;
    @Autowired
    private HistoryService historyService;
    @Autowired
    private RepositoryService repositoryService;

    /**
     * 部署文件
     *
     * @param procesName
     * @param fileName
     */
    public void deploy(String procesName, String fileName) {
        Deployment deployment = processEngine.getRepositoryService()
                .createDeployment()// 创建一个部署对象
                .name(procesName)// 添加部署的名称
                .addClasspathResource("processes/" + fileName + ".bpmn")// 从classpath的资源中加载，一次只能加载一个文件
                .addClasspathResource("processes/" + fileName + ".png")// 从classpath的资源中加载，一次只能加载一个文件
                .deploy();// 完成部署
        System.out.println("部署ID：" + deployment.getId());
        System.out.println("部署名称：" + deployment.getName());
    }


    /**
     * 启动实例带流程变量
     */
    public ProcessInstance start(String templateId, Map<String, Object> variables) {
        // 启动
        // 设置一下变量
        BemEnum key = BemEnum.getEnumByKey(templateId);
        ProcessInstance startProcessInstanceByKey = runtimeService.startProcessInstanceByKey(key.getValue(), variables);
        return startProcessInstanceByKey;
    }

    /**
     * 启动实例不带流程变量
     */
    public ProcessInstance start(String templateId, String appNo) {
        // 启动不设置变量
        BemEnum key = BemEnum.getEnumByKey(templateId);
        ProcessInstance startProcessInstanceByKey = runtimeService.startProcessInstanceByKey(key.getValue(), appNo);
        return startProcessInstanceByKey;
    }

    /**
     * 完成任务 带流程变量 方便流转到下以个节点
     */
    public void compleTask(String taskId, Map<String, Object> variables) throws Exception {
        taskService.setVariablesLocal(taskId, variables);
        taskService.complete(taskId, variables);
    }

    /**
     * 完成任务
     */
    public void compleTask(String taskId) throws Exception {
        taskService.complete(taskId);
    }

    /**
     * 完成任务 实例id 和 人的名称
     */
    public void compleTaskByPID(String pid, String name) throws Exception {
        // 获取查询对象
        TaskQuery createTaskQuery = taskService.createTaskQuery();
        // 获取任务id
        Task task = createTaskQuery.processInstanceId(pid).singleResult();
        // 完成
        taskService.complete(task.getId());
    }

    /**
     * 设置办理人
     */
    public void setAssignee(String taskId, String assigner) {

        processEngine.getTaskService().setAssignee(taskId, assigner);

    }

    /**
     * 完成任务 实例id 和 人的名称
     */
    public void compleTaskByPIdAndName(String pid, Map<String, Object> variables) throws Exception {
        // 获取查询对象
        TaskQuery createTaskQuery = taskService.createTaskQuery();
        // 获取任务id
        Task task = createTaskQuery.processInstanceId(pid).singleResult();
        // 完成
        taskService.complete(task.getId(), variables);
    }


    // 查询流程是否结束
    public void isEnd(String pid) {
        // 查询对象
        ProcessInstanceQuery createProcessInstanceQuery = runtimeService.createProcessInstanceQuery();
        // 根据id
        ProcessInstance singleResult = createProcessInstanceQuery.processInstanceId(pid).singleResult();
        // 如果singleResult找到说明流程还没有结束
        if (singleResult != null) {
            System.out.println("流程未结束或不存在");
        } else {
            System.out.println("流程结束");
        }

    }

    /**
     * 根据业务id查流程
     *
     * @param businessKey
     * @return
     */
    public ProcessInstance getProcessByBusinessKey(String businessKey) {

        return runtimeService.createProcessInstanceQuery().processInstanceBusinessKey(businessKey).singleResult();

    }


    /**
     * 设置办理人
     *
     * @param taskId
     * @param taskAssignee
     * @return
     */
    public void addCandidateUser(String taskId, String taskAssignee) throws Exception {
        taskService.addCandidateUser(taskId, taskAssignee);
    }

    /**
     * 某一次流程执行了多少步
     */
    public void queryHistoricActivitiInstance(String processInstanceId) {
        List<HistoricActivityInstance> list = processEngine.getHistoryService()
                .createHistoricActivityInstanceQuery()
                .processInstanceId(processInstanceId)
                .list();
        if (list != null && list.size() > 0) {
            for (HistoricActivityInstance hai : list) {
                System.out.println(hai.getId());
                System.out.println("步骤ID：" + hai.getActivityId());
                System.out.println("步骤名称：" + hai.getActivityName());
                System.out.println("执行人：" + hai.getAssignee());
                System.out.println("====================================");
            }
        }
    }


    /**
     * 某一次流程的执行经历的多少任务
     */
    public List<HistoricTaskInstance> queryHistoricTask(String processInstanceId) {
        List<HistoricTaskInstance> list = processEngine.getHistoryService()
                .createHistoricTaskInstanceQuery()
                .processInstanceId(processInstanceId).finished().orderByHistoricTaskInstanceStartTime().asc()
                .list();

        return list;
    }

    /**
     * 终止流程
     *
     * @param processInstanceId
     */
    public void stopProcessInstance(String processInstanceId) {
        runtimeService.deleteProcessInstance(processInstanceId, "结束流程");
    }

    /**
     * 根据环节id 查历史流程变量
     *
     * @param taskId
     */
    public void getHistoryProcessVariables(String taskId) {
        List<HistoricVariableInstance> list = processEngine.getHistoryService()
                .createHistoricVariableInstanceQuery()//创建一个历史的流程变量查询
                .taskId(taskId)
                .list();

        if (list != null && list.size() > 0) {
            for (HistoricVariableInstance hiv : list) {
                System.out.println(hiv.getTaskId() + "  " + hiv.getVariableName() + "		" + hiv.getValue() + "		" + hiv.getVariableTypeName());
            }
        }
    }

    /**
     * 根据环节id 查历史环节
     *
     * @param taskId
     * @return
     */
    public HistoricTaskInstance getHistoricTaskInstanceByTAskId(String taskId) {
        return historyService.createHistoricTaskInstanceQuery().taskId(taskId).singleResult();
    }

    /**
     * 根据流程实例id 查在执行的流程
     *
     * @param processInstanceId
     * @return
     */
    public ProcessInstance getProcessInstanceByPID(String processInstanceId) {
        return runtimeService.createProcessInstanceQuery()
                .processInstanceId(processInstanceId)
                .singleResult();
    }

    /**
     * 根据流程定义id  获取流程定义
     *
     * @param processDefinitionId
     * @return
     */
    public ProcessDefinition getProcessDefinition(String processDefinitionId) {
        return repositoryService.getProcessDefinition(processDefinitionId);
    }

    /**
     * 根据processDefinitionId 获取BpmnModel
     *
     * @param processDefinitionId
     * @return
     */
    public BpmnModel getBpmnModel(String processDefinitionId) {
        return repositoryService.getBpmnModel(processDefinitionId);

    }

    /**
     * 跳转环节
     *
     * @param fromTaskID
     * @param toTaskId
     */
    public void turnTask(String fromTaskID, String toTaskId, String manangerId) {
        // 当前环节 act_ru_task
        Task task = processEngine.getTaskService().createTaskQuery().taskId(fromTaskID).singleResult();
        if (task == null) {
            System.out.println("流程未启动或已执行完成，无法撤回");
        }

        HistoricTaskInstance toTask = processEngine.getHistoryService().createHistoricTaskInstanceQuery()
                .taskId(fromTaskID).singleResult();
        if (null == toTask) {
            System.out.println("目标环节不存在");
        }
        // 找到流程定义
        String processDefinitionId = toTask.getProcessDefinitionId();

        // ProcessDefinitionEntity processDefinitionEntity = (ProcessDefinitionEntity)
        // processEngine.getRepositoryService()
        // .createProcessDefinitionQuery().processDefinitionId(processDefinitionId).singleResult();

        // 获取BpmnModel
        // In version 6, all the process definition information can be found through the
        // BpmnModel 记录流程定义信息

        BpmnModel bpmnModel = processEngine.getRepositoryService().getBpmnModel(processDefinitionId);

        // 获得已经提交环节的ActivityId
        // HistoricActivityInstance
        // Represents one execution of an activity and it's stored permanent for
        // statistics, audit and other business intelligence purposes.

        String toActivityId = null;
        List<HistoricActivityInstance> haiList = processEngine.getHistoryService().createHistoricActivityInstanceQuery()
                .executionId(toTask.getExecutionId()).finished().list();

        for (HistoricActivityInstance hai : haiList) {
            if (toTaskId.equals(hai.getTaskId())) {
                toActivityId = hai.getActivityId();
                break;
            }
        }
        // FlowNode 节点
        FlowNode myFlowNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(toActivityId);

        Execution execution = processEngine.getRuntimeService().createExecutionQuery()
                .executionId(task.getExecutionId()).singleResult();

        String activityId = execution.getActivityId();
        System.out.println(activityId + "------->> activityId:" + toActivityId);

        // 节点信息
        FlowNode flowNode = (FlowNode) bpmnModel.getMainProcess().getFlowElement(activityId);

        // 记录原活动方向
        List<SequenceFlow> oriSequenceFlows = new ArrayList<SequenceFlow>();
        oriSequenceFlows.addAll(flowNode.getOutgoingFlows());

        // 清理出线活动方向
        flowNode.getOutgoingFlows().clear();

        // 建立新方向
        List<SequenceFlow> newSequenceFlowList = new ArrayList<SequenceFlow>();
        SequenceFlow newSequenceFlow = new SequenceFlow();
        newSequenceFlow.setId("newSequenceFlowId");
        newSequenceFlow.setSourceFlowElement(flowNode);
        newSequenceFlow.setTargetFlowElement(myFlowNode);
        newSequenceFlowList.add(newSequenceFlow);
        flowNode.setOutgoingFlows(newSequenceFlowList);

        // act_hi_comment 添加审核人
        Authentication.setAuthenticatedUserId(manangerId);
        processEngine.getTaskService().addComment(task.getId(), task.getProcessInstanceId(), "撤回");

        Map<String, Object> currentVariables = new HashMap<String, Object>();
        currentVariables.put("applier", manangerId);
        // 完成任务
        processEngine.getTaskService().complete(task.getId(), currentVariables);
        // 恢复原方向
        flowNode.setOutgoingFlows(oriSequenceFlows);
    }

}
