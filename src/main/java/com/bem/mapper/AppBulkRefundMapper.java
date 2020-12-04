package com.bem.mapper;

import com.bem.domain.AppBulkRefund;
import com.bem.domain.AppBulkRefundExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Component
public interface AppBulkRefundMapper extends BaseMapper<AppBulkRefund> {
    long countByExample(AppBulkRefundExample example);

    int deleteByExample(AppBulkRefundExample example);

    List<AppBulkRefund> selectByExample(AppBulkRefundExample example);

    int updateByExampleSelective(@Param("record") AppBulkRefund record, @Param("example") AppBulkRefundExample example);

    int updateByExample(@Param("record") AppBulkRefund record, @Param("example") AppBulkRefundExample example);

    int batchInsert(List<AppBulkRefund> appBulkRefunds);

    List<AppBulkRefund> billingFindAppBulkRefund(AppBulkRefund appBulkRefund);

    int backAppBulkRefund(Map map);
}