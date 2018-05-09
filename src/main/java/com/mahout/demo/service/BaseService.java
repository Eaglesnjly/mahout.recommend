package com.mahout.demo.service;

import java.util.List;

/**
 * Created by yehao on 2016/10/13.
 */
public interface BaseService<T> {

	int deleteById(Integer id);

	int insert(T t);

	int updateEntity(T t);

	int save(T t);

	T selectById(Integer id);

	List<T> selectList(T t);

	int count();
}
