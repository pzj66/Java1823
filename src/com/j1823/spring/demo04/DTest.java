package com.j1823.spring.demo04;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class DTest {


    @Autowired
    @Qualifier("ddao")
    private DDao ddao;

    @Test
    public void testC() {

        ddao.add();
        System.out.println("--------------------");
        ddao.del();
        System.out.println("--------------------");
        ddao.del2();

    }


}
