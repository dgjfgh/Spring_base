package com.test.config._4value;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * Created by majianghua on 2018/10/10.
 */
@PropertySource("classpath:/valueUser.properties")//加上配置文件
@Configuration
public class ValueConfig {

    @Bean
    public ValueUser user(){
        return new ValueUser();
    }

}
