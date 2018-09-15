package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:08
 * @Version: 1.0
 **/
public class FlyCar implements Car {
    @Override
    public void show() {
        this.run();
        this.fly();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

    public void fly() {
        System.out.println("可以飞");
    }
}
