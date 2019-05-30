package com.bem.mapper;

import com.bem.domain.AppAssem;
import com.bem.domain.AppAssemExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppAssemMapper extends BaseMapper<AppAssem> {
    long countByExample(AppAssemExample example);

    int deleteByExample(AppAssemExample example);

    List<AppAssem> selectByExample(AppAssemExample example);

    int updateByExampleSelective(@Param("record") AppAssem record, @Param("example") AppAssemExample example);

    int updateByExample(@Param("record") AppAssem record, @Param("example") AppAssemExample example);
}