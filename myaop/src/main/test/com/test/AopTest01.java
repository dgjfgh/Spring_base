package com.test;

import com.demo.AopConfig;
import com.demo.MathCalculation;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * Created by majianghua on 2018/10/10.
 */
public class AopTest01 {

    @Test
    public void test() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopConfig.class);

        String[] beanDefinitionNames = context.getBeanDefinitionNames();
        for (String definitionName : beanDefinitionNames) {
            System.out.println(definitionName);
        }
        MathCalculation mathCalculation = (MathCalculation) context.getBean("mathCalculation");
        mathCalculation.div(2,1);
    }
}
