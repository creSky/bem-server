package com.bem.mapper;

import com.bem.domain.SysCommConfig;
import com.bem.domain.SysCommConfigExample;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.BaseMapper;

@Mapper
@Component
public interface SysCommConfigMapper extends BaseMapper<SysCommConfig> {
    long countByExample(SysCommConfigExample example);

    int deleteByExample(SysCommConfigExample example);

    List<SysCommConfig> selectByExample(SysCommConfigExample example);

    int updateByExampleSelective(@Param("record") SysCommConfig record, @Param("example") SysCommConfigExample example);

    int updateByExample(@Param("record") SysCommConfig record, @Param("example") SysCommConfigExample example);

    List<SysCommConfig> getSysCommConfig(SysCommConfig sysCommConfig);

    int freeUpdate(Map<String, Object> userMap);
}