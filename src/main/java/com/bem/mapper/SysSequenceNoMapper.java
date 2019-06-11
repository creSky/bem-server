package com.bem.mapper;

import com.bem.domain.SysSequenceNo;
import com.bem.domain.SysSequenceNoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface SysSequenceNoMapper extends BaseMapper<SysSequenceNo> {
    long countByExample(SysSequenceNoExample example);

    int deleteByExample(SysSequenceNoExample example);

    List<SysSequenceNo> selectByExample(SysSequenceNoExample example);

    int updateByExampleSelective(@Param("record") SysSequenceNo record, @Param("example") SysSequenceNoExample example);

    int updateByExample(@Param("record") SysSequenceNo record, @Param("example") SysSequenceNoExample example);
}