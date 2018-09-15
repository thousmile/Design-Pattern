package com.ifsaid.Observer;

import java.util.Observable;

/**
 * @Program: Design-Pattern
 * @Description: 被观察者，需要继承 java.util.Observable类
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:36
 * @Version: 1.0
 **/
public class Person extends Observable {

    private String name;

    private String sex;

    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        this.setChanged();
        this.notifyObservers();
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
        this.setChanged();
        this.notifyObservers();
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
        this.setChanged();
        this.notifyObservers();
    }

}
