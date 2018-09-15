package com.ifsaid.strategy;

/**
 * @Program: Design-Pattern
 * @Description: 策略设计模式
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:22
 * @Version: 1.0
 **/
public class StrategyDemo {

    public static void main(String[] args) {
        Context md5 = new Context(new MD5Strategy());
        md5.encrypt();

        Context rsa = new Context(new RSAStrategy());
        rsa.encrypt();

    }

}
