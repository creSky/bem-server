package com.bem.mapper;

import com.bem.domain.AppMeterAssetsInfo;
import com.bem.domain.AppMeterAssetsInfoExample;
import java.util.List;

import com.bem.domain.SiteSurveyTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppMeterAssetsInfoMapper extends BaseMapper<AppMeterAssetsInfo> {
    long countByExample(AppMeterAssetsInfoExample example);

    int deleteByExample(AppMeterAssetsInfoExample example);

    List<AppMeterAssetsInfo> selectByExample(AppMeterAssetsInfoExample example);

    int updateByExampleSelective(@Param("record") AppMeterAssetsInfo record, @Param("example") AppMeterAssetsInfoExample example);

    int updateByExample(@Param("record") AppMeterAssetsInfo record, @Param("example") AppMeterAssetsInfoExample example);
    List<SiteSurveyTree> getSiteSurveyMeterAssetsTree(String appId);

}