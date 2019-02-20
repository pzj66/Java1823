package com.j1823.spring.demo01;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class ATest {


    @Autowired
    @Qualifier("proxyADao")
    private ADao aDao;

    @Test
    public void testA() {

        aDao.add();

        System.out.println("---------------------------");

        aDao.del();

    }

}
