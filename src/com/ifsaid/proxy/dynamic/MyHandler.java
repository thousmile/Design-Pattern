package com.ifsaid.proxy.dynamic;

import com.ifsaid.proxy.Subject;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 22:04
 * @Version: 1.0
 **/
public class MyHandler implements InvocationHandler {

    //这里也需要传入被代理对象
    private Subject subject;

    public MyHandler(Subject subject) {
        this.subject = subject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        dazhe();
        //执行被代理对象中的方法
        Object result = method.invoke(subject, args);
        give();
        return result;
    }

    public void dazhe() {
        System.out.println("打折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }
}
