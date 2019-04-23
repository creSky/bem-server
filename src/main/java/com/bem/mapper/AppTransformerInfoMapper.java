package com.bem.mapper;

import com.bem.domain.AppTransformerInfo;
import com.bem.domain.AppTransformerInfoExample;
import java.util.List;

import com.bem.domain.SiteSurveyTree;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppTransformerInfoMapper extends BaseMapper<AppTransformerInfo> {
    long countByExample(AppTransformerInfoExample example);

    int deleteByExample(AppTransformerInfoExample example);

    List<AppTransformerInfo> selectByExample(AppTransformerInfoExample example);

    int updateByExampleSelective(@Param("record") AppTransformerInfo record, @Param("example") AppTransformerInfoExample example);

    int updateByExample(@Param("record") AppTransformerInfo record, @Param("example") AppTransformerInfoExample example);

    List<SiteSurveyTree> getSiteSurveyTransTree(String  appId);

}