package com.ifsaid.Observer;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:41
 * @Version: 1.0
 **/
public class ObserverDemo {

    public static void main(String[] args) {
        Person person = new Person();
        person.addObserver(new MyObserver());
        person.setName("小明");
    }

}
