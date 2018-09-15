package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:07
 * @Version: 1.0
 **/
public class SwimCar implements Car {
    @Override
    public void show() {
        this.run();
        this.swim();
    }

    @Override
    public void run() {
        System.out.println("可以跑");
    }

    public void swim(){
        System.out.println("可以游泳");
    }
}
