package com.test.config._1beanfactory;

import org.springframework.context.annotation.Bean;

/**
 * Created by majianghua on 2018/10/9.
 */
//@Configuration
public class BeanFactoryConfig {

    @Bean
    public UserFactoryBean userBeanFactory(){
        return new UserFactoryBean();
    }

}
