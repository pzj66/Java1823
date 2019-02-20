package com.j1823.spring.demo02;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

// 只应用到 add() 方法
public class BAdvice implements MethodBeforeAdvice {

    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("方法前置增强");
    }
}
