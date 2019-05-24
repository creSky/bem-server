package com.bem.mapper;

import com.bem.domain.AppDesignAppraise;
import com.bem.domain.AppDesignAppraiseExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppDesignAppraiseMapper extends BaseMapper<AppDesignAppraise> {
    long countByExample(AppDesignAppraiseExample example);

    int deleteByExample(AppDesignAppraiseExample example);

    List<AppDesignAppraise> selectByExample(AppDesignAppraiseExample example);

    int updateByExampleSelective(@Param("record") AppDesignAppraise record, @Param("example") AppDesignAppraiseExample example);

    int updateByExample(@Param("record") AppDesignAppraise record, @Param("example") AppDesignAppraiseExample example);
}