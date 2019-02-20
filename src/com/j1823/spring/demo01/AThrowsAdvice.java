package com.j1823.spring.demo01;

import org.springframework.aop.ThrowsAdvice;


// Spirng内部是用反射来实现方法匹配的，需要实现下列接口中的其中1个
// public void afterThrowing(Exception ex)
// public void afterThrowing(RemoteException)
// public void afterThrowing(Method method, Object[] args, Object target, Exception ex)
// public void afterThrowing(Method method, Object[] args, Object target, ServletException ex)
public class AThrowsAdvice implements ThrowsAdvice {

    public void afterThrowing(Exception ex) {

        System.out.println("异常" + ex.getMessage());

    }

}
