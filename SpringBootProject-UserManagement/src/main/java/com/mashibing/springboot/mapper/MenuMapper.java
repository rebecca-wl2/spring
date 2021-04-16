package com.mashibing.springboot.mapper;

import com.mashibing.springboot.entity.Menu;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * MenuMapper继承基类
 */
@Mapper
public interface MenuMapper extends MyBatisBaseDao<Menu, Integer, MenuExample> {
}