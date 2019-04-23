package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.domain.AppDesignConstruct;
import com.bem.domain.SysCommConfig;
import com.bem.mapper.AppDesignConstructMapper;
import com.bem.mapper.SysCommConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * 获取录入信息设计单位等下拉
 */
@Controller
@RequestMapping(value = "/appDesignConstruct")
public class AppDesignConstructController {

    @Autowired
    private AppDesignConstructMapper appDesignConstructMapper;

    @ResponseBody
    @RequestMapping(value = "/getappDesignConstruct")
    public List<AppDesignConstruct> getSysCommConfig(@RequestBody(required = false) String typeJson) {
        String type = JSONObject.parseObject(typeJson).getString("type");
        return appDesignConstructMapper.getDesignComstruct(type);
    }


}
