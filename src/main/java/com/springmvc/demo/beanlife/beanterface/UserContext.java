package com.springmvc.demo.beanlife.beanterface;

import com.springmvc.demo.model.User;

/**
 * <p></p>
 * Created by admin on 2017/9/20.
 */
public class UserContext extends NewContext {

    @Override
    public void getContext(final Object object) {
        User user = (User) object;
        System.out.println("userContext:" +user.toString());
    }

    @Override
    public Object setContext(final Object object) {
        System.out.println("set User Context");
        User user = (User) object;
        user.setId(1001);
        return user;
    }
}
