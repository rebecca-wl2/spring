package com.mashibing.springboot.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */
@Mapper
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}