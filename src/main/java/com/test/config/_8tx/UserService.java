package com.test.config._8tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;

/**
 * Created by majianghua on 2018/10/10.
 */
@Service
public class UserService {

    @Autowired
    public UserDao userDao;

    @Transactional
    public void insert() {
        userDao.insert();
        System.out.println("UserService----插入完成");
//        int a=2/0;
    }

}
