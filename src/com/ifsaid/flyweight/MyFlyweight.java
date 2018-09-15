package com.ifsaid.flyweight;

/**
 * @Program: Design-Pattern
 * @Description: 具体享元角色
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:50
 * @Version: 1.0
 **/
public class MyFlyweight implements Flyweight {

    private String str;

    public MyFlyweight(String str) {
        this.str = str;
    }

    @Override
    public void display() {
        System.out.println(str);
    }

}
