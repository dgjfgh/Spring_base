package com.test.config._3LifeCycle;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * Created by majianghua on 2018/10/10.
 */
@Component
public class MyBeanPostProcessor implements BeanPostProcessor{

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("myBeanPostProcessor postProcessBeforeInitialization"+beanName+"-->"+bean);
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("myBeanPostProcessor postProcessAfterInitialization"+beanName+"-->"+bean);
        return bean;
    }
}
