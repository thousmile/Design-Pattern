package com.ifsaid.factory.impl;

import com.ifsaid.factory.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:19
 * @describe： 创建一个“圆形”具体实现类，实现画图方法
 * @version: 1.0
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}
