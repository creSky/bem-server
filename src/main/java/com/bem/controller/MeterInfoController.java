package com.bem.controller;

import com.bem.domain.MeterInfo;
import com.bem.mapper.MeterInfoMapper;
import com.bem.service.MeterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping(value = "/meterInfo")
public class MeterInfoController {
    @Autowired
    private MeterService meterService;

    @RequestMapping(value = "/testMutilDataSource")
    public void testMutilDataSource(){
        meterService.selectAll();
    }
}
