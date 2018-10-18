package com.test.config._5autowired;

import org.springframework.stereotype.Service;

import javax.inject.Inject;

/**
 * Created by majianghua on 2018/10/10.
 */
@Service
public class UserService {

//    @Qualifier("userDao")
//    @Autowired
//    public UserDao userDao;

//    @Resource
    @Inject
    public UserDao userDao;

}
