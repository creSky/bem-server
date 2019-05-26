package com.bem.service;

import com.alibaba.fastjson.JSONObject;
import com.bem.bemEnum.BemEnum;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.history.HistoricActivityInstance;
import org.activiti.engine.history.HistoricProcessInstance;
import org.activiti.engine.history.HistoricTaskInstance;
import org.activiti.engine.repository.Deployment;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.runtime.ProcessInstanceQuery;
import org.activiti.engine.task.Task;
import org.activiti.engine.task.TaskQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;

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
    public void queryHistoricTask(String processInstanceId) {
        List<HistoricTaskInstance> list = processEngine.getHistoryService()
                .createHistoricTaskInstanceQuery()
                .processInstanceId(processInstanceId).orderByHistoricTaskInstanceStartTime().asc()
                .list();
        if (list != null && list.size() > 0) {
            for (HistoricTaskInstance hti : list) {
                System.out.println("taskId:" + hti.getId() + "，");
                System.out.println("name:" + hti.getName() + "，");
                System.out.println("pdId:" + hti.getProcessDefinitionId() + "，");
                System.out.println("assignee:" + hti.getTaskLocalVariables() + "，");
            }
        }
    }

    /**
     * 终止流程
     * @param processInstanceId
     */
    public void stopProcessInstance(String processInstanceId){
        runtimeService.deleteProcessInstance(processInstanceId,"结束流程");
    }

}
