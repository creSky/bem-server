package com.bem.service;

import com.bem.domain.TaskList;
import com.bem.mapper.TaskListMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TaskListService {
    @Autowired
    private TaskListMapper taskListMapper;

    public List<Map<String,Object>> selectCustomerByApp(Map<String,Object> userMap){
       return taskListMapper.selectCustomerByApp(userMap);
    }

    public List<Map<String,Object>> selectUserByApp(Map<String,Object> userMap){
        return taskListMapper.selectUserByApp(userMap);
    }

    public List<Map<String,Object>> queryHistoricTask(String processInstanceId){
        return taskListMapper.queryHistoricTask(processInstanceId);
    }

    public List<Map<String,Object>> queryFinishAppDate(Map<String, Object> userMap){
        return taskListMapper.queryFinishAppDate(userMap);

    }

    public List<Map<String,Object>> queryHighFinishApp(Map<String, Object> userMap){
        return taskListMapper.queryHighFinishApp(userMap);

    }

    public List<Map<String,Object>> queryLowFinishApp(Map<String, Object> userMap){
        return taskListMapper.queryLowFinishApp(userMap);

    }

    public List<Map<String,Object>> queryFinishApp(Map<String, Object> userMap){
        return taskListMapper.queryFinishApp(userMap);

    }

    public List<Map<String,Object>> queryFinishTask(String processInstanceId){
        return taskListMapper.queryFinishTask(processInstanceId);

    }

}
