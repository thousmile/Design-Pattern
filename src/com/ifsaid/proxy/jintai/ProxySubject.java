package com.ifsaid.proxy.jintai;

import com.ifsaid.proxy.Subject;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:58
 * @Version: 1.0
 **/
public class ProxySubject implements Subject {

    private Subject subject;

    public ProxySubject(Subject subject) {
        this.subject = subject;
    }

    @Override
    public void sailBook() {
        dazhe();
        this.subject.sailBook();
        give();
    }

    //代理角色通常在将客户端调用传递给真是主题对象之前或者之后执行某些操作，而不是单纯返回真实的对象。
    public void dazhe() {
        System.out.println("打折");
    }

    public void give() {
        System.out.println("赠送代金券");
    }
}
