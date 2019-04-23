package com.bem.mapper;

import com.bem.domain.AppMidCheckReport;
import com.bem.domain.AppMidCheckReportExample;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Controller;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Controller
public interface AppMidCheckReportMapper extends BaseMapper<AppMidCheckReport> {
    long countByExample(AppMidCheckReportExample example);

    int deleteByExample(AppMidCheckReportExample example);

    List<AppMidCheckReport> selectByExample(AppMidCheckReportExample example);

    int updateByExampleSelective(@Param("record") AppMidCheckReport record, @Param("example") AppMidCheckReportExample example);

    int updateByExample(@Param("record") AppMidCheckReport record, @Param("example") AppMidCheckReportExample example);
}