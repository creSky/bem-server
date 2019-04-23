package com.bem.mapper;

import com.bem.domain.AppUserInfo;
import com.bem.domain.AppUserInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppUserInfoMapper extends BaseMapper<AppUserInfo> {
    long countByExample(AppUserInfoExample example);

    int deleteByExample(AppUserInfoExample example);

    List<AppUserInfo> selectByExample(AppUserInfoExample example);

    int updateByExampleSelective(@Param("record") AppUserInfo record, @Param("example") AppUserInfoExample example);

    int updateByExample(@Param("record") AppUserInfo record, @Param("example") AppUserInfoExample example);
}