package com.springmvc.demo.beanlife;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.PropertyValues;
import org.springframework.beans.factory.config.InstantiationAwareBeanPostProcessorAdapter;

import java.beans.PropertyDescriptor;

/**
 * <p></p>
 * Created by admin on 2017/9/19.
 */
public class MyInstantiationAwareBeanPostProcessor extends InstantiationAwareBeanPostProcessorAdapter{
    public static final Logger logger = LoggerFactory.getLogger(MyInstantiationAwareBeanPostProcessor.class);

    public Object postProcessBeforeInstantiation(Class beanClass, String beanName) throws BeansException {
        String className = beanClass.getName();
        if(className.equals(BeanLife.class.getName())){
            logger.info("实例化bean之前干的好事===before====MyInstantiationAwareBeanPostProcessor.postProcessBeforeInstantiation");
        }
        return null;
    }
    /**实例化Bean后，对Bean进行梳妆打扮*/
    public boolean postProcessAfterInstantiation(Object bean, String beanName) throws BeansException {
        String className = bean.getClass().getName();
        if(className.equals(BeanLife.class.getName())){
            logger.info("实例化bean之后总的恢复现场===after====MyInstantiationAwareBeanPostProcessor.postProcessAfterInstantiation");
        }
        return true;
    }

    //把Bean的配置值赋值给Bean实例的属性。
    public PropertyValues postProcessPropertyValues(
            PropertyValues pvs, PropertyDescriptor[] pds, Object bean, String beanName)
            throws BeansException {
        String className = bean.getClass().getName();
        if(className.equals(BeanLife.class.getName())){
            logger.info("实例化bean放开双手，开始表演，给bean设置属性====PropertyValues====InstantiationAwareBeanPostProcessor.postProcessPropertyValues");
        }
        return pvs;
    }


    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLife) {
            logger.info("bean初始化after*********postProcessAfterInitialization");
            BeanLife jay = (BeanLife) bean;
            logger.info("JayChou当前的女朋友是：" + jay.getGirlFriend());
            jay.setGirlFriend("昆凌");
            logger.info("调用BeanPostProcessor的postProcessAfterInitialization处理后，" +
                        "JayChou的女朋友变成：" + jay.getGirlFriend());
        }
        return bean;

    }

    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof BeanLife) {
            logger.info("bean初始化before*********postProcessBeforeInitialization");
            BeanLife jay = (BeanLife) bean;
            logger.info("配置文件中Jay的女朋友是：" + jay.getGirlFriend());
            jay.setGirlFriend("侯佩岑");
            logger.info("调用BeanPostProcessor的postProcessBeforeInitialization处理后，" +
                        "Jay的女朋友变为：" + jay.getGirlFriend());

        }
        return bean;
    }

}
