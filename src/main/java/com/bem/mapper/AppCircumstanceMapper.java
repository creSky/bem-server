package com.bem.mapper;

import com.bem.domain.AppCircumstance;
import com.bem.domain.AppCircumstanceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppCircumstanceMapper extends BaseMapper<AppCircumstance> {
    long countByExample(AppCircumstanceExample example);

    int deleteByExample(AppCircumstanceExample example);

    List<AppCircumstance> selectByExample(AppCircumstanceExample example);

    int updateByExampleSelective(@Param("record") AppCircumstance record, @Param("example") AppCircumstanceExample example);

    int updateByExample(@Param("record") AppCircumstance record, @Param("example") AppCircumstanceExample example);
}