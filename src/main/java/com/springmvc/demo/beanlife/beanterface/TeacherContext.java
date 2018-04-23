package com.springmvc.demo.beanlife.beanterface;

import com.springmvc.demo.model.BaseEntity;

import java.util.Date;

/**
 * <p></p>
 * Created by admin on 2017/9/20.
 */
public class TeacherContext extends NewContext {
    @Override
    public void getContext(final Object object) {
        BaseEntity baseEntity = (BaseEntity) object;
        System.out.println("TeacherContext:" + baseEntity.toString());
    }

    @Override
    public Object setContext(final Object object) {
        System.out.println("set Teacher Context");
        BaseEntity entity = (BaseEntity) object;
        entity.setId(1);
        entity.setCreateTime(new Date());
        return entity;
    }
}
