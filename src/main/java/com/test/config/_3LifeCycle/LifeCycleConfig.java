package com.test.config._3LifeCycle;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by majianghua on 2018/10/10.
 */
@ComponentScan("com.test.config._3LifeCycle")
@Configuration
public class LifeCycleConfig {

//    @Bean(initMethod = "init",destroyMethod = "detory")
//    public Cat cat(){
//        return new Cat();
//    }

    @Bean
    public Dog dog() {
        return new Dog();
    }

    @Bean
    public MyBeanPostProcessor myBeanPostProcessor() {
        return new MyBeanPostProcessor();
    }
}
