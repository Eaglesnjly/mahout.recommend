package com.springmvc.demo.beanlife.beanterface;

import com.springmvc.demo.model.BaseEntity;
import com.springmvc.demo.model.User;

/**
 * <p></p>
 * Created by admin on 2017/9/20.
 */
public class MyContext extends NewContext {
    @Override
    public void getContext(final Object object) {
        System.out.println("MyContext:" + object.toString());
    }

    @Override
    public Object setContext(final Object object) {
        System.out.println("set myContext");
        return "myContext";
    }

    public static void main(String[] args) {
        Context context = new MyContext();
        context.getContext(new Object());
        context.getContext(new User());
        context.getContext(new BaseEntity());

    }
}
