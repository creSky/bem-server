package com.bem.mapper;

import com.bem.baseMapper.BemBaseMapper;
import com.bem.domain.TaskList;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Component;

@Mapper
@Component
public interface TaskListMapper extends BemBaseMapper<TaskList> {

    List<Map<String,Object>> selectCustomerByApp(Map<String, Object> userMap);

    List<Map<String,Object>> selectUserByApp(Map<String, Object> userMap);

    List<Map<String,Object>> queryHistoricTask(String processInstanceId);

    List<Map<String,Object>> queryHighFinishApp(Map<String, Object> userMap);

    List<Map<String,Object>> queryLowFinishApp(Map<String, Object> userMap);

    List<Map<String,Object>> queryFinishAppDate(Map<String, Object> userMap);

    List<Map<String,Object>> queryFinishTask(String processInstanceId);


}