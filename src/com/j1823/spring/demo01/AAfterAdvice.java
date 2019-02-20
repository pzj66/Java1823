package com.j1823.spring.demo01;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class AAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("后置增强");
    }
}
