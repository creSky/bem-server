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

}
