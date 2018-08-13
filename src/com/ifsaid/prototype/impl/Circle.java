package com.ifsaid.prototype.impl;

import com.ifsaid.prototype.Shape;

/**
 * @Program: Design-Pattern
 * @Description: 圆形
 * @Author: Wang Chen Chen
 * @Create: 2018-08-13 20:34
 * @Version: 1.0
 **/
public class Circle extends Shape {

    public Circle() {
        type = "Circle";
    }


    @Override
    protected void draw() {
        System.out.println("Circle::draw() method");
    }
}
