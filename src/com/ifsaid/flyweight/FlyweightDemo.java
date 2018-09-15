package com.ifsaid.flyweight;

/**
 * @Program: Design-Pattern
 * @Description: 享元模式
 * 简单理解为：
 * 如果一个应用程序使用了大量的对象，
 * 而这些对象造成了很大的存储开销的时候就可以考虑是否可以使用享元模式。
例如,如果发现某个对象的生成了大量细粒度的实例，
并且这些实例除了几个参数外基本是相同的，
如果把那些共享参数移到类外面，在方法调用时将他们传递进来，
就可以通过共享大幅度单个实例的数目。
 *
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:53
 * @Version: 1.0
 **/
public class FlyweightDemo {

    public static void main(String[] args) {
        MyFlyweightFactory myFlyweightFactory = new MyFlyweightFactory();
        Flyweight myFlyweight1 = myFlyweightFactory.getMyFlyweight("a");
        Flyweight myFlyweight2 = myFlyweightFactory.getMyFlyweight("b");
        Flyweight myFlyweight3 = myFlyweightFactory.getMyFlyweight("a");
        Flyweight myFlyweight4 = myFlyweightFactory.getMyFlyweight("d");

        myFlyweight1.display();
        myFlyweight2.display();
        myFlyweight3.display();
        myFlyweight4.display();

        System.out.println(myFlyweight1 == myFlyweight3);
    }
}
