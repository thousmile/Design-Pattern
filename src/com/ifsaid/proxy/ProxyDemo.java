package com.ifsaid.proxy;

import com.ifsaid.proxy.jintai.ProxySubject;
import com.ifsaid.proxy.jintai.RealSubject;

/**
 * @Program: Design-Pattern
 * @Description: 代理模式
 * 网上有很多专门卖书的网站，我们从这些商城买书，但是书不是这些商城印的，他们只负责卖，
 * 书是出版社印的，所以说到底，我们其实还是从出版社买书，网上书城只是出版社的代理，
 * 所以出版社是被代理对象，书城是代理对象。
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:56
 * @Version: 1.0
 **/
public class ProxyDemo {

    public static void main(String[] args) {
        Subject realSubject = new RealSubject();
        Subject proxySubject = new ProxySubject(realSubject);
        proxySubject.sailBook();
    }

}
