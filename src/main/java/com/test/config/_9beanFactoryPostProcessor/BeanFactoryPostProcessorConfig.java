package com.test.config._9beanFactoryPostProcessor;

import com.test.config._3LifeCycle.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by majianghua on 2018/10/18.
 */
@ComponentScan("com.test.config._9beanFactoryPostProcessor")
@Configuration
public class BeanFactoryPostProcessorConfig {

    @Bean(initMethod = "init", destroyMethod = "detory")
    public Cat cat() {
        return new Cat();
    }
}
