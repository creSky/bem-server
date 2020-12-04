package com.bem.mapper;

import com.bem.domain.AppRefundPreMoneyInfo;
import com.bem.domain.AppRefundPreMoneyInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Component
public interface AppRefundPreMoneyInfoMapper extends BaseMapper<AppRefundPreMoneyInfo> {
    long countByExample(AppRefundPreMoneyInfoExample example);

    int deleteByExample(AppRefundPreMoneyInfoExample example);

    List<AppRefundPreMoneyInfo> selectByExample(AppRefundPreMoneyInfoExample example);

    int updateByExampleSelective(@Param("record") AppRefundPreMoneyInfo record, @Param("example") AppRefundPreMoneyInfoExample example);

    int updateByExample(@Param("record") AppRefundPreMoneyInfo record, @Param("example") AppRefundPreMoneyInfoExample example);
}