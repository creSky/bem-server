package com.bem.mapper;

import com.bem.domain.MeterInfo;
import com.bem.domain.MeterInfoExample;
import java.util.List;

import com.bem.mutilDbConfig.DataSource;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface MeterInfoMapper  {
    List<MeterInfo> selectAll();

}