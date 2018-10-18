package com.test.config._3LifeCycle;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * Created by majianghua on 2018/10/10.
 */
@Component
public class Dog {
    public Dog() {
        System.out.println("dog new Dog()");
    }

    @PostConstruct
    public void init(){
        System.out.println("dog PostConstruct");
    }

    @PreDestroy
    public void destory(){
        System.out.println("dog PreDestroy");
    }
}
