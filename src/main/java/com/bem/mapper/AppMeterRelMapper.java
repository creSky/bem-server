package com.bem.mapper;

import com.bem.domain.AppMeterRel;
import com.bem.domain.AppMeterRelExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppMeterRelMapper extends BaseMapper<AppMeterRel> {
    long countByExample(AppMeterRelExample example);

    int deleteByExample(AppMeterRelExample example);

    List<AppMeterRel> selectByExample(AppMeterRelExample example);

    int updateByExampleSelective(@Param("record") AppMeterRel record, @Param("example") AppMeterRelExample example);

    int updateByExample(@Param("record") AppMeterRel record, @Param("example") AppMeterRelExample example);
}