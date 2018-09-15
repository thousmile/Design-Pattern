package com.ifsaid.proxy.jintai;

import com.ifsaid.proxy.Subject;

/**
 * @Program: Design-Pattern
 * @Description: 被代理对象，也就是出版社
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:58
 * @Version: 1.0
 **/
public class RealSubject implements Subject {
    @Override
    public void sailBook() {
        System.out.println("卖书");
    }
}
