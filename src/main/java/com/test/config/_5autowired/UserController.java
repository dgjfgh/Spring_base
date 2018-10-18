package com.test.config._5autowired;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by majianghua on 2018/10/10.
 */
@Controller
public class UserController {

    @Autowired
    public UserService userService;

}
