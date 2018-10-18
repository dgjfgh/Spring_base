package com.test;

import com.test.config._8tx.TxConfig;
import com.test.config._8tx.UserService;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * jdbc
 */
public class TxTest {
    @Test
    public void testTx() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TxConfig.class);
        UserService userService = context.getBean(UserService.class);
        userService.insert();
    }
}
