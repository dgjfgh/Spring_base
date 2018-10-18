package com.test.config._2condition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.env.Environment;
import org.springframework.core.type.AnnotatedTypeMetadata;

/**
 * Created by majianghua on 2018/10/9.
 */
public class WindowsCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        //获取IOC _1beanfactory
        ConfigurableListableBeanFactory beanFactory = context.getBeanFactory();
        //获取类加载器
        ClassLoader classLoader = context.getClassLoader();
        //获取当前环境信息
        Environment environment = context.getEnvironment();
        //获取bean定义的注册类
        BeanDefinitionRegistry registry = context.getRegistry();

        //判断是不是windows系统
        String property = environment.getProperty("os.name");
        if (property.contains("Windows")) {
            return true;
        }

        //判断有没有注册bean
//        boolean windows = registry.containsBeanDefinition("windows");
//        registry.removeBeanDefinition("");
//        registry.registerBeanDefinition("");
        return false;
    }
}
