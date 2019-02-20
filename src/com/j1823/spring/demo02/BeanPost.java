package com.j1823.spring.demo02;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class BeanPost implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object o, String s) throws BeansException {
//        System.out.println("Before s=" + s);
        //

        return o;
    }

    @Override
    public Object postProcessAfterInitialization(Object o, String s) throws BeansException {
//        System.out.println("After s=" + s);

//        实现代理过程
//                proxy = o.createProxy()

        return o;
    }
}
