package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.bem.config.Page;
import com.bem.domain.SysCommConfig;
import com.bem.mapper.SysCommConfigMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.riozenc.titanTool.spring.web.http.HttpResult;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
@RequestMapping(value = "/sysCommConfig")
public class SysCommConfigController {

    @Autowired
    private SysCommConfigMapper sysCommConfigMapper;
    @Autowired
    private Page page;
    @Autowired
    private RestTemplate restTemplate;

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @ResponseBody
    @RequestMapping(value = "/getSysCommConfig")
    public void getSysCommConfig(@RequestBody(required = false) String sysCommConfigJson) {
        SysCommConfig sysCommConfig = JSONObject.parseObject(sysCommConfigJson, SysCommConfig.class);
/*
        return sysCommConfigMapper.select(sysCommConfig);
*/
        final PageInfo<SysCommConfig> pageInfo =
                PageHelper.startPage(sysCommConfig.getPageNum(), page.getPageNum()).doSelectPageInfo(() -> this.sysCommConfigMapper.selectAll());
        logger.info("[lambda写法] - [分页信息] - [{}]", pageInfo.toString());
    }


    @ResponseBody
    @RequestMapping(value = "/getUserInfomation")
    public void getUserInfomation() {
        String result = restTemplate.getForObject("http://AUTH-DATA/auth-data/user/name/sysadmin", String.class);
        System.out.println(result);
    }


    @ResponseBody
    @RequestMapping(value = "/freeUpdate")
    public HttpResult freeUpdate(@RequestBody(required = false) String Json) {
        JSONObject sqlObject = JSONObject.parseObject(Json);
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("tableName", sqlObject.getString("tableName"));
        userMap.put("value", sqlObject.getDate("value"));
        userMap.put("key", sqlObject.getString("key"));
        List<Map<String, String>> itemsList = sqlObject.getObject("items", new TypeReference<List<Map<String, String>>>() {
        });


        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < itemsList.size(); i++) {
            sb.append(" and " + itemsList.get(i).get("whereKey") + " = " + itemsList.get(i).get("whereValue"));
        }
        userMap.put("where", sb.toString());
        if ("".equals(sb.toString())) {
            return new HttpResult<>(500, "无修改记录", null);
        }
        int num = this.sysCommConfigMapper.freeUpdate(userMap);
        if (num > 0) {
            return new HttpResult<>(HttpResult.SUCCESS, "更新成功", null);
        } else {
            return new HttpResult<>(HttpResult.ERROR, "流程还未到此环节，无法更新时间", null);

        }
    }

}
