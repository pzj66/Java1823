package com.j1823.spring.demo03;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class CTest {


    @Autowired
    @Qualifier("test")
    private CDao cDao;

    @Test
    public void testC() {

        cDao.add();

        System.out.println("-----------------------");

        cDao.del();

        System.out.println("-----------------------");

        cDao.delVal();

        System.out.println("-----------------------");

        cDao.update();

        System.out.println("-----------------------");
    }


}
