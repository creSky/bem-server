package com.bem.mapper;

import com.bem.domain.AppDispatch;
import com.bem.domain.AppDispatchExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppDispatchMapper extends BaseMapper<AppDispatch> {
    long countByExample(AppDispatchExample example);

    int deleteByExample(AppDispatchExample example);

    List<AppDispatch> selectByExample(AppDispatchExample example);

    int updateByExampleSelective(@Param("record") AppDispatch record, @Param("example") AppDispatchExample example);

    int updateByExample(@Param("record") AppDispatch record, @Param("example") AppDispatchExample example);
}