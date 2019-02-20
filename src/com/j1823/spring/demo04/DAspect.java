package com.j1823.spring.demo04;

public class DAspect {


    public void before() {
        System.out.println("前置增强");
    }

    public void afterRun(Object result) {
        System.out.println("后置增强" + result);
    }



}
