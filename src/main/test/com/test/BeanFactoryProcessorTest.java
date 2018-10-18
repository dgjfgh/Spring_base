package com.test;

import com.test.config._9beanFactoryPostProcessor.BeanFactoryPostProcessorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by majianghua on 2018/10/18.
 */
public class BeanFactoryProcessorTest {
    @Test
    public void testBeanFactoryPostProcessor() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(BeanFactoryPostProcessorConfig.class);

        context.close();
    }


}
