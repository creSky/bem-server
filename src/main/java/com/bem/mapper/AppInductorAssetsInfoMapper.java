package com.bem.mapper;

import com.bem.domain.AppInductorAssetsInfo;
import com.bem.domain.AppInductorAssetsInfoExample;
import java.util.List;

import com.bem.domain.SiteSurveyTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppInductorAssetsInfoMapper extends BaseMapper<AppInductorAssetsInfo> {
    long countByExample(AppInductorAssetsInfoExample example);

    int deleteByExample(AppInductorAssetsInfoExample example);

    List<AppInductorAssetsInfo> selectByExample(AppInductorAssetsInfoExample example);

    int updateByExampleSelective(@Param("record") AppInductorAssetsInfo record, @Param("example") AppInductorAssetsInfoExample example);

    int updateByExample(@Param("record") AppInductorAssetsInfo record, @Param("example") AppInductorAssetsInfoExample example);

    List<SiteSurveyTree> getSiteSurveyIndtTree(String appId);

}