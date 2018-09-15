package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:13
 * @Version: 1.0
 **/
public class FlyCarDecorator extends CarDecorator {

    public FlyCarDecorator(Car car) {
        super(car);
    }

    @Override
    public void show() {
        this.getCar().show();
        this.fly();
    }

    public void fly(){
        System.out.println("可以飞");
    }

    @Override
    public void run() {

    }
}
