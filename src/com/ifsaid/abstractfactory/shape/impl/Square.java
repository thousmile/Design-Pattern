package com.ifsaid.abstractfactory.shape.impl;

import com.ifsaid.abstractfactory.shape.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:33
 * @describe： “正方形” 具体实现类
 * @version: 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() method");
    }
}
