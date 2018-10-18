package com.test.config._10listener;

import com.test.config._3LifeCycle.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by majianghua on 2018/10/18.
 */
@ComponentScan("com.test.config._10listener")
@Configuration
public class ListenerConfig {

    public Cat cat() {
        return new Cat();
    }
}
