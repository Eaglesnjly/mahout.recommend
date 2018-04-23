package com.springmvc.demo.beanlife.beanterface;

/**
 * <p>自定义接口</p>
 * Created by admin on 2017/9/20.
 */
public abstract class NewContext implements Context {

    Object setContext(Object object){
        System.out.println("set new Context abstract class");
        return "newContext";
    }
}
