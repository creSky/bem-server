package com.bem.baseMapper;

import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @author ：zjd
 * @date ：Created in 2019/2/26 10:46
 * @modified By：
 */
public interface BemBaseMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
