package com.demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by majianghua on 2018/10/10.
 */
@EnableAspectJAutoProxy
@Configuration
public class AopConfig {

    @Bean
    public MathCalculation mathCalculation() {
        return new MathCalculation();
    }

    @Bean
    public LogAspects logAspects() {
        return new LogAspects();
    }

}
