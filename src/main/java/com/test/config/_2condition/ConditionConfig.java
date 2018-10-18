package com.test.config._2condition;

import com.test.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * Created by majianghua on 2018/10/9.
 */
@Configuration
public class ConditionConfig {

    @Conditional({LinuxCondition.class})
    @Bean("linux")
    public User user01() {
        return new User(11, "linux");
    }

    @Conditional({WindowsCondition.class})
    @Bean("windows")
    public User user02() {
        return new User(12, "windows");
    }

}
