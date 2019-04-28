package com.bem.mapper;

import com.bem.domain.AppFile;
import com.bem.domain.AppFileExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppFileMapper extends BaseMapper<AppFile> {
    long countByExample(AppFileExample example);

    int deleteByExample(AppFileExample example);

    List<AppFile> selectByExample(AppFileExample example);

    int updateByExampleSelective(@Param("record") AppFile record, @Param("example") AppFileExample example);

    int updateByExample(@Param("record") AppFile record, @Param("example") AppFileExample example);
}