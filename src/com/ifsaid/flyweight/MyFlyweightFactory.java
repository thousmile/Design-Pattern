package com.ifsaid.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * @Program: Design-Pattern
 * @Description: 享元工厂
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:51
 * @Version: 1.0
 **/
public class MyFlyweightFactory {

    private Map<String, MyFlyweight> pool;

    public MyFlyweightFactory() {
        pool = new HashMap<String, MyFlyweight>();
    }

    public Flyweight getMyFlyweight(String str) {
        MyFlyweight myFlyweight = pool.get(str);
        //若池中没有则创建一个新的并放入池中，若池中已存在，则返回池中的
        if (myFlyweight == null) {
            myFlyweight = new MyFlyweight(str);
            pool.put(str, myFlyweight);
        }
        return myFlyweight;
    }
}
