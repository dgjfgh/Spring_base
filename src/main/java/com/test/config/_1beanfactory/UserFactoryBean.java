package com.test.config._1beanfactory;

import com.test.bean.User;
import org.springframework.beans.factory.FactoryBean;

/**
 * Created by majianghua on 2018/10/9.
 */
public class UserFactoryBean implements FactoryBean<User> {
    @Override
    public User getObject() throws Exception {
        return new User();
    }

    @Override
    public Class<?> getObjectType() {
        return User.class;
    }

    @Override
    public boolean isSingleton() {
        return true;
    }
}
