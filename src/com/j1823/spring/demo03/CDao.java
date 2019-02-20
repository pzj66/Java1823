package com.j1823.spring.demo03;


import org.springframework.stereotype.Component;

@Component("test")
public class CDao {

    public void add() {
        System.out.println("添加");
    }

    public void del() {
        System.out.println("删除");
    }

    public int delVal() {
        System.out.println("删除方法2");
        int temp = 5 / 0;
        return 123;
    }


    public void update() {
        System.out.println("修改");
    }

}
