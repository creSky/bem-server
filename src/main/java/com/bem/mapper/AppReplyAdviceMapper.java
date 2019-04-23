package com.bem.mapper;

import com.bem.domain.AppReplyAdvice;
import com.bem.domain.AppReplyAdviceExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppReplyAdviceMapper extends BaseMapper<AppReplyAdvice> {
    long countByExample(AppReplyAdviceExample example);

    int deleteByExample(AppReplyAdviceExample example);

    List<AppReplyAdvice> selectByExample(AppReplyAdviceExample example);

    int updateByExampleSelective(@Param("record") AppReplyAdvice record, @Param("example") AppReplyAdviceExample example);

    int updateByExample(@Param("record") AppReplyAdvice record, @Param("example") AppReplyAdviceExample example);
}