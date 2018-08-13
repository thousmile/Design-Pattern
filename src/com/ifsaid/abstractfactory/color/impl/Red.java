package com.ifsaid.abstractfactory.color.impl;

import com.ifsaid.abstractfactory.color.Color;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:36
 * @describe： “红色”的具体实现类
 * @version: 1.0
 */
public class Red implements Color {
    @Override
    public void fill() {
        System.out.println("Red::fill() method.");
    }
}
