package com.test;

import com.test.bean.User;
import com.test.config._2condition.ConditionConfig;
import com.test.config._1beanfactory.UserFactoryBean;
import com.test.config._3LifeCycle.LifeCycleConfig;
import com.test.config._4value.ValueConfig;
import com.test.config._4value.ValueUser;
import com.test.config._5autowired.AutowiredConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Map;

/**
 * Created by majianghua on 2018/10/9.
 */

public class Test1 {

    AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserFactoryBean.class);

    @Test
    public void testFactoryBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(UserFactoryBean.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }

        Object bean1 = context.getBean("userFactoryBean");
        System.out.println(bean1.getClass());
        Object bean2 = context.getBean("&userFactoryBean");
        System.out.println(bean2.getClass());
    }

    @Test
    public void testConditionBean() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionConfig.class);

        String[] beanDefinitionNames = context.getBeanNamesForType(User.class);
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }

        Map<String, User> beansOfType = context.getBeansOfType(User.class);
        System.out.println(beansOfType);


    }

    @Test
    public void testLifeCycle() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(LifeCycleConfig.class);
        System.out.println("容器创建完成");
        context.close();
    }
    @Test
    public void testValueProperty() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ValueConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }

        ValueUser user = (ValueUser) context.getBean("user");
        System.out.println(user.toString());

        String property = context.getEnvironment().getProperty("user.nickName");
        System.out.println(property);
    }


    @Test
    public void testAutowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }
    }
}
