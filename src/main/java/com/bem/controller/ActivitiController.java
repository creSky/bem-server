package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.common.RestultContent;
import com.bem.service.ActivitiService;
import com.bem.service.TaskListService;
import com.bem.util.BemCommonUtil;
import com.bem.util.PropertiesUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    private RestTemplate restTemplate;

    @RequestMapping(value = "/getTaskList")
    @ResponseBody
    public RestultContent getTaskList(@RequestBody(required = false) String userRightJson) throws Exception {
        RestultContent restultContent = new RestultContent();
        List<Map<String, Object>> taskMap = new ArrayList<>();
        Map<String, Object> userMap = new HashMap<>();
        //获得用户信息
        userMap.put("userId", BemCommonUtil.getOpeartorId(userRightJson));
        userMap.put("roleIds",BemCommonUtil.getOpeartorRoleIds(userRightJson));
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
        activitiService.compleTask(jsonObject.getString("taskId"), candidate);
        restultContent.setStatus(200);
        return restultContent;
    }


}
