package com.test;

import com.test.config._6profile.ProfileConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by majianghua on 2018/10/10.
 */
public class ProfileTest {

    @Test
    public void testAutowired() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.getEnvironment().setActiveProfiles("test");
        context.register(ProfileConfig.class);
        context.refresh();

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }


    }
}
