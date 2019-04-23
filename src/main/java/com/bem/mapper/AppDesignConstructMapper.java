package com.bem.mapper;

import com.bem.domain.AppDesignConstruct;
import com.bem.domain.AppDesignConstructExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface AppDesignConstructMapper extends BaseMapper<AppDesignConstruct> {
    long countByExample(AppDesignConstructExample example);

    int deleteByExample(AppDesignConstructExample example);

    List<AppDesignConstruct> selectByExample(AppDesignConstructExample example);

    int updateByExampleSelective(@Param("record") AppDesignConstruct record, @Param("example") AppDesignConstructExample example);

    int updateByExample(@Param("record") AppDesignConstruct record, @Param("example") AppDesignConstructExample example);

    List<AppDesignConstruct> getDesignComstruct(String type);

}