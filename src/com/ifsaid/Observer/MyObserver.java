package com.ifsaid.Observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:38
 * @Version: 1.0
 **/
public class MyObserver implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("对象已经改变");
        System.out.println(o);
    }
}
