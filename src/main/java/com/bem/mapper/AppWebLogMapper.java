package com.bem.mapper;

import com.bem.domain.AppWebLog;
import com.bem.domain.AppWebLogExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppWebLogMapper extends BaseMapper<AppWebLog> {
    long countByExample(AppWebLogExample example);

    int deleteByExample(AppWebLogExample example);

    List<AppWebLog> selectByExampleWithBLOBs(AppWebLogExample example);

    List<AppWebLog> selectByExample(AppWebLogExample example);

    int updateByExampleSelective(@Param("record") AppWebLog record, @Param("example") AppWebLogExample example);

    int updateByExampleWithBLOBs(@Param("record") AppWebLog record, @Param("example") AppWebLogExample example);

    int updateByExample(@Param("record") AppWebLog record, @Param("example") AppWebLogExample example);
}