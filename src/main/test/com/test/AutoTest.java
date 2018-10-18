package com.test;

import com.test.config._5autowired.AutowiredConfig;
import com.test.config._5autowired.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by majianghua on 2018/10/10.
 */
public class AutoTest {
    @Test
    public void testAutowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AutowiredConfig.class);
        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }

        UserService bean = context.getBean(UserService.class);
        System.out.println(bean.userDao.getLable());

    }
}
