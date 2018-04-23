package com.springmvc.demo.beanlife;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * <p>main 测试beanLife的生命周期</p>
 * Created by admin on 2017/9/19.
 */
public class BeanLifeCycleMain {
    public static final Logger logger = LoggerFactory.getLogger(BeanLifeCycleMain.class);

    public static void lifeBeanFactory(){
        String path = "spring/bean-life.xml";
//        Resource res = new ClassPathResource(path);
//        BeanFactory beanFactory = new XmlBeanFactory(res);
//        ((ConfigurableBeanFactory)beanFactory).addBeanPostProcessor(new MyInstantiationAwareBeanPostProcessor());
//
//        //1、实例化
//
//        //2、初始化
//        BeanLife monkey = (BeanLife) beanFactory.getBean("monkey");
//
//        logger.info("monkey:"+monkey.toString());
//
//        // jay.setGirlFriend("温岚");
//        BeanLife monkey2 = beanFactory.getBean("monkey",BeanLife.class);
//        monkey2.setGirlFriend("温岚");
//        logger.info("monkey2:"+monkey2.toString());
//        logger.info("monkey:"+monkey2.toString());
//
//        logger.info("compare:" + (monkey2==monkey));
//        ((XmlBeanFactory)beanFactory).destroySingletons();


        ApplicationContext context = new ClassPathXmlApplicationContext(path);
        BeanLife monkeyBean = (BeanLife) context.getBean("monkey");
        logger.info(monkeyBean.toString());
    }

    public static void main(String[] args) {
        BeanLifeCycleMain.lifeBeanFactory();
    }
}
