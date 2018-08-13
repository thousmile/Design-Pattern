package com.ifsaid.abstractfactory.shape.impl;

import com.ifsaid.abstractfactory.shape.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:33
 * @describe： “长方形”的实现类
 * @version: 1.0
 */
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method");
    }
}
