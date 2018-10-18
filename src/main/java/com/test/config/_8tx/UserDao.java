package com.test.config._8tx;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

/**
 * Created by majianghua on 2018/10/10.
 */
@Repository
public class UserDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void insert() {
        String sql = "insert into `tab_user`(name,password) values(?,?)";
        jdbcTemplate.update(sql, UUID.randomUUID().toString().substring(0,5),18);
    }
}
