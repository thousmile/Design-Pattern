package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:12
 * @Version: 1.0
 **/
public class SwimCarDecorator extends CarDecorator {

    public SwimCarDecorator(Car car) {
        super(car);
    }


    @Override
    public void show() {
        this.getCar().show();
        this.swim();
    }

    @Override
    public void run() {

    }

    public void swim(){
        System.out.println("可以游泳");
    }

}
