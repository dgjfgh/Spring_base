package com.test.config._3LifeCycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * Created by majianghua on 2018/10/9.
 */
@Component
public class Cat implements InitializingBean,DisposableBean{

    public Cat() {
        System.out.println("new Cat();");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("destory new Cat();");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet new Cat();");
    }

    private void init() {
        System.out.println("====init");
    }

    private void detory() {
        System.out.println("=====detory");
    }
}
