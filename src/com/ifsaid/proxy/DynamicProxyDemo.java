package com.ifsaid.proxy;

import com.ifsaid.proxy.dynamic.MyHandler;
import com.ifsaid.proxy.jintai.RealSubject;

import java.lang.reflect.Proxy;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 22:06
 * @Version: 1.0
 **/
public class DynamicProxyDemo {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        MyHandler myHandler = new MyHandler(realSubject);
        //创建代理对象实例
        Subject proxySubject = (Subject) Proxy.newProxyInstance(Subject.class.getClassLoader(), realSubject.getClass().getInterfaces(), myHandler);
        proxySubject.sailBook();

    }

}
