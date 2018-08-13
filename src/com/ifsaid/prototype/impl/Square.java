package com.ifsaid.prototype.impl;

import com.ifsaid.prototype.Shape;

/**
 * @Program: Design-Pattern
 * @Description: 长方形
 * @Author: Wang Chen Chen
 * @Create: 2018-08-13 20:39
 * @Version: 1.0
 **/
public class Square extends Shape {

    public Square() {
        type = "Square";
    }

    @Override
    protected void draw() {
        System.out.println("Square::draw() method");
    }
}
