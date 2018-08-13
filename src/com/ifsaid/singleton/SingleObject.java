package com.ifsaid.singleton;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 16:27
 * @version: 1.0
 */
public class SingleObject {

    private static SingleObject singleObject = new SingleObject();

    private SingleObject() {
    }

    public static SingleObject getSingleObject() {
        return singleObject;
    }

    public void showMsg() {
        System.out.println("Holle Word!");
    }

}
