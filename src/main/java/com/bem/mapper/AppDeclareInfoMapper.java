package com.bem.mapper;

import com.bem.domain.AppDeclareInfo;
import com.bem.domain.AppDeclareInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppDeclareInfoMapper extends BaseMapper<AppDeclareInfo> {
    long countByExample(AppDeclareInfoExample example);

    int deleteByExample(AppDeclareInfoExample example);

    List<AppDeclareInfo> selectByExample(AppDeclareInfoExample example);

    int updateByExampleSelective(@Param("record") AppDeclareInfo record, @Param("example") AppDeclareInfoExample example);

    int updateByExample(@Param("record") AppDeclareInfo record, @Param("example") AppDeclareInfoExample example);
}