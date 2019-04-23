package com.bem.mapper;

import com.bem.domain.AppPassAdvice;
import com.bem.domain.AppPassAdviceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppPassAdviceMapper extends BaseMapper<AppPassAdvice> {
    long countByExample(AppPassAdviceExample example);

    int deleteByExample(AppPassAdviceExample example);

    List<AppPassAdvice> selectByExample(AppPassAdviceExample example);

    int updateByExampleSelective(@Param("record") AppPassAdvice record, @Param("example") AppPassAdviceExample example);

    int updateByExample(@Param("record") AppPassAdvice record, @Param("example") AppPassAdviceExample example);
}