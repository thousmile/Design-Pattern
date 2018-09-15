package com.ifsaid.strategy;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:27
 * @Version: 1.0
 **/
public class MD5Strategy implements Strategy {
    @Override
    public void encrypt() {
        System.out.println("MD5 加密算法");
    }
}
