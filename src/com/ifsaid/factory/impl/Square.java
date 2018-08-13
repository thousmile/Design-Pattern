package com.ifsaid.factory.impl;

import com.ifsaid.factory.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:17
 * @describe： 创建一个“正方形”具体实现类，实现画图方法
 * @version: 1.0
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}
