package com.bem.mapper;

import com.bem.domain.AppCompelete;
import com.bem.domain.AppCompeleteExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppCompeleteMapper extends BaseMapper<AppCompelete> {
    long countByExample(AppCompeleteExample example);

    int deleteByExample(AppCompeleteExample example);

    List<AppCompelete> selectByExample(AppCompeleteExample example);

    int updateByExampleSelective(@Param("record") AppCompelete record, @Param("example") AppCompeleteExample example);

    int updateByExample(@Param("record") AppCompelete record, @Param("example") AppCompeleteExample example);
}