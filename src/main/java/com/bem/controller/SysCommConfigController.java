package com.bem.controller;

import com.alibaba.fastjson.JSONObject;
import com.bem.config.Page;
import com.bem.domain.SysCommConfig;
import com.bem.mapper.SysCommConfigMapper;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping(value = "/sysCommConfig")
public class SysCommConfigController {

    @Autowired
    private SysCommConfigMapper sysCommConfigMapper;
    @Autowired
    private Page page;

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


}
