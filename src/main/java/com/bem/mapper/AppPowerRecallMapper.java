package com.bem.mapper;

import com.bem.domain.AppPowerRecall;
import com.bem.domain.AppPowerRecallExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Component
public interface AppPowerRecallMapper extends BaseMapper<AppPowerRecall> {
    long countByExample(AppPowerRecallExample example);

    int deleteByExample(AppPowerRecallExample example);

    List<AppPowerRecall> selectByExample(AppPowerRecallExample example);

    int updateByExampleSelective(@Param("record") AppPowerRecall record, @Param("example") AppPowerRecallExample example);

    int updateByExample(@Param("record") AppPowerRecall record, @Param("example") AppPowerRecallExample example);
}