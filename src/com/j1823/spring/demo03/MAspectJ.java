package com.j1823.spring.demo03;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.junit.internal.Throwables;
import org.springframework.stereotype.Component;

// 切面类

@Component("aspectJ")
@Aspect
public class MAspectJ {

    @Before("execution(* com.j1823.spring.demo03.CDao.add(..))")
    public void before() {
        System.out.println("前置增强");
    }

    @AfterReturning("execution(* com.j1823.spring.demo03.CDao.del(..))")
    public void after() {
        System.out.println("后置增强");
    }

    @AfterReturning(value = "MAspectJ.myDelVal()", returning = "result")
    public void after2(Object result) {
        System.out.println("后置增强，获取返回结果=" + result);
    }

    @Around(value = "execution(* com.j1823.spring.demo03.CDao.update(..))")
    public void round(ProceedingJoinPoint fun) throws Throwable {
        System.out.println("前置增强");
        fun.proceed();
        System.out.println("后置增强");
    }

    @AfterThrowing(value = "MAspectJ.myDelVal()", throwing = "e")
    public void exception(Throwable e) {
        System.out.println("异常增强" + e.getMessage());
    }

    @After(value = "MAspectJ.myDelVal()")
    public void finalAter() {
        System.out.println("不管怎么样，我都会执行");
    }

    @Pointcut("execution(* com.j1823.spring.demo03.CDao.delVal(..))")
    public void myDelVal() {}

}
