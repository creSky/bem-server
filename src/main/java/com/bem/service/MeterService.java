package com.bem.service;

import com.bem.domain.MeterInfo;
import com.bem.mapper.MeterInfoMapper;
import com.bem.mutilDbConfig.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class MeterService {
    @Autowired
    private MeterInfoMapper meterInfoMapper;

    @DataSource(value = "slave1")
    //多数据源测试
    public void  selectAll(){
        List<MeterInfo> meterInfos=meterInfoMapper.selectAll();
        for (MeterInfo meterInfo : meterInfos) {
            System.out.println("=============="+meterInfo.getId());
        }
    }
}
