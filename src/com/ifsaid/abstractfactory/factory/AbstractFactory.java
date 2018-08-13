package com.ifsaid.abstractfactory.factory;

import com.ifsaid.abstractfactory.color.Color;
import com.ifsaid.abstractfactory.shape.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:39
 * @describe： 抽象工厂
 * @version: 1.0
 */
public abstract class AbstractFactory {

    public abstract Color getColor(String color);

    public abstract Shape getShape(String shape);

}
