package com.bem.mapper;

import com.bem.domain.AppSettlementInfo;
import com.bem.domain.AppSettlementInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Component
public interface AppSettlementInfoMapper extends BaseMapper<AppSettlementInfo> {
    long countByExample(AppSettlementInfoExample example);

    int deleteByExample(AppSettlementInfoExample example);

    List<AppSettlementInfo> selectByExample(AppSettlementInfoExample example);

    int updateByExampleSelective(@Param("record") AppSettlementInfo record, @Param("example") AppSettlementInfoExample example);

    int updateByExample(@Param("record") AppSettlementInfo record, @Param("example") AppSettlementInfoExample example);
}