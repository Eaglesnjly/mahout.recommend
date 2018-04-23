package com.springmvc.demo.mapper;

import java.util.List;

public interface BaseMapper<T> {
    int delete(Integer id);

    int insert(T t);

    int insertSelective(T t);

    T selectById(Integer id);

    List<T> selectByEntity(T t);

    int update(T t);

    int count();


}