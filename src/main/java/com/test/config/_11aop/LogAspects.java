package com.test.config._11aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * Created by majianghua on 2018/10/10.
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.test.config._11aop.MathCalculation.*(..))")
    public void pointCut(){}

    @Before("com.test.config._11aop.LogAspects.pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();//方法参数
        System.out.println(joinPoint.getSignature().getName()+"除法运行");
    }

    @After("pointCut()")
    public void logEnd() {
        System.out.println("除法结束");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法返回"+result);
    }

    @AfterThrowing(value = "pointCut()",throwing = "e")
    public void logException(Exception e) {
        System.out.println("除法异常"+e.getMessage());
    }
}
