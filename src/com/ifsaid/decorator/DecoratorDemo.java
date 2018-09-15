package com.ifsaid.decorator;

/**
 * @Program: Design-Pattern
 * @Description: 装饰者模式
 * 装饰（ Decorator ）模式又叫做包装模式。通过一种对客户端透明的方式来扩展对象的功能，
 * 是继承关系的一个替换方案。他是23种设计模式之一，英文叫Decorator Pattern，又叫装饰者模式。
 * 装饰模式是在不必改变原类文件和使用继承的情况下，动态地扩展一个对象的功能。
 * 它是通过创建一个包装对象，也就是装饰来包裹真实的对象。
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:05
 * @Version: 1.0
 **/
public class DecoratorDemo {


    public static void main(String[] args) {
       /*Car car = new RunCar();
        Car car = new FlyCar();
        Car car = new SwimCar();
        car.show();*/

        /*Car car = new RunCar();
        Car swimCar = new SwimCarDecorator(car);
        swimCar.show();*/

        Car car = new RunCar();
        Car swimCar = new SwimCarDecorator(car);
        Car flySwimCar = new FlyCarDecorator(swimCar);
        flySwimCar.show();

    }


}
