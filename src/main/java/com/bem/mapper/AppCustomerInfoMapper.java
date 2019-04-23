package com.bem.mapper;

import com.bem.domain.AppCustomerInfo;
import com.bem.domain.AppCustomerInfoExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppCustomerInfoMapper extends BaseMapper<AppCustomerInfo> {
    long countByExample(AppCustomerInfoExample example);

    int deleteByExample(AppCustomerInfoExample example);

    List<AppCustomerInfo> selectByExample(AppCustomerInfoExample example);

    int updateByExampleSelective(@Param("record") AppCustomerInfo record, @Param("example") AppCustomerInfoExample example);

    int updateByExample(@Param("record") AppCustomerInfo record, @Param("example") AppCustomerInfoExample example);
}