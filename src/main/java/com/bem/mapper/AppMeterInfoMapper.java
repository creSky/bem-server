package com.bem.mapper;

import com.bem.common.SiteSurveyTree;
import com.bem.domain.AppMeterInfo;
import com.bem.domain.AppMeterInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppMeterInfoMapper extends BaseMapper<AppMeterInfo> {
    long countByExample(AppMeterInfoExample example);

    int deleteByExample(AppMeterInfoExample example);

    List<AppMeterInfo> selectByExample(AppMeterInfoExample example);

    int updateByExampleSelective(@Param("record") AppMeterInfo record, @Param("example") AppMeterInfoExample example);

    int updateByExample(@Param("record") AppMeterInfo record, @Param("example") AppMeterInfoExample example);

    List<SiteSurveyTree> getSiteSurveyMeterInfoTree(String appId);

}