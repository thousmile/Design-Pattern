package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:10
 * @Version: 1.0
 **/
public abstract class CarDecorator implements Car {

    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public abstract void show();
}
