package com.springmvc.demo.service;

import java.util.List;

/**
 * Created by yehao on 2016/10/13.
 */
public interface BaseService<T> {

	int delete(Integer id);

	int insert(T t);

	int update(T t);

	int save(T t);

	T selectById(Integer id);

	List<T> selectList(T t);

	int count();
}
