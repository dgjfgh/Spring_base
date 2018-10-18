package com.test;

import com.test.config._10listener.ListenerConfig;
import org.junit.Test;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by majianghua on 2018/10/18.
 */
public class ListenerTest {

    @Test
    public void test01(){
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ListenerConfig.class);

        //自己
        context.publishEvent(new ApplicationEvent(new String("我发布的事件")) {
            @Override
            public Object getSource() {
                return super.getSource();
            }

            @Override
            public String toString() {
                return super.toString();
            }
        });

        context.close();
    }

}
