package com.bem.mapper;

import com.bem.domain.AppMoneyRecall;
import com.bem.domain.AppMoneyRecallExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;
@Mapper
@Component
public interface AppMoneyRecallMapper extends BaseMapper<AppMoneyRecall> {
    long countByExample(AppMoneyRecallExample example);

    int deleteByExample(AppMoneyRecallExample example);

    List<AppMoneyRecall> selectByExample(AppMoneyRecallExample example);

    int updateByExampleSelective(@Param("record") AppMoneyRecall record, @Param("example") AppMoneyRecallExample example);

    int updateByExample(@Param("record") AppMoneyRecall record, @Param("example") AppMoneyRecallExample example);

    List<AppMoneyRecall> billingFindAppMoneyRecall(AppMoneyRecall appMoneyRecall);

    int backAppMoneyRecall(Map map);
}