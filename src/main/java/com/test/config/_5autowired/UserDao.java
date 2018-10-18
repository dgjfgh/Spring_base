package com.test.config._5autowired;

import org.springframework.stereotype.Repository;

/**
 * Created by majianghua on 2018/10/10.
 */
@Repository
public class UserDao {

    private String lable="1";

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }
}
