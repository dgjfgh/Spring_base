package com.test.config._5autowired;

import com.test.bean.User;
import org.springframework.context.annotation.*;

/**
 * 依赖注入
 * <p>
 * 1.@Autowried  自动注入
 *      默认先按照类型去容器中找对应的组件
 *      如果找到多个相同类型的组件,再将组件名称作为组件的ID去容器中查找
 *      @Qualifier("userDao") 使用@Qualifier 指定容器中组件的id
 *
 *      如果获取不到这个组件就会报错
 *      可以使用    @Autowired(required = false)  这样就算找不到也不会报错但是无法注入
 *
 *      @Primary 让Spring进行自动装配的时候,默认使用首选的bean  @Qualifier指定的时候会覆盖@Primary
 *
 * 2.Spring 还支持使用@Resource(JSR250)  @Inject(JSR330)  java规范注解
 *
 *      @Resource
 *      和@Autowried一样实现注入,默认按组件名字装配  没有@Primary功能 没有支持@Autowired(required = false)
 *      @Inject
 *      需要导包javax.inject  和@Autowried一样实现注入,默认按组件名字装配   没有支持@Autowired(required = false
 *
 *
 * @Autowried 是Spring定义的  @Resource和@Inject是java规范
 *
 */
@Configuration
@ComponentScan("com.test.config._5autowired")
public class AutowiredConfig {

    @Primary
    @Bean("userDao2")
    public UserDao userDao() {
        UserDao userDao = new UserDao();
        userDao.setLable("2");
        return userDao;
    }

}
