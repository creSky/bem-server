package com.bem.mapper;

import com.bem.domain.AppExtendOverCheck;
import com.bem.domain.AppExtendOverCheckExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppExtendOverCheckMapper extends BaseMapper<AppExtendOverCheck> {
    long countByExample(AppExtendOverCheckExample example);

    int deleteByExample(AppExtendOverCheckExample example);

    List<AppExtendOverCheck> selectByExample(AppExtendOverCheckExample example);

    int updateByExampleSelective(@Param("record") AppExtendOverCheck record, @Param("example") AppExtendOverCheckExample example);

    int updateByExample(@Param("record") AppExtendOverCheck record, @Param("example") AppExtendOverCheckExample example);
}