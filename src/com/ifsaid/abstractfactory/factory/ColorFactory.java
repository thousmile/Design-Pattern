package com.ifsaid.abstractfactory.factory;

import com.ifsaid.abstractfactory.color.Color;
import com.ifsaid.abstractfactory.color.impl.*;
import com.ifsaid.abstractfactory.shape.Shape;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:48
 * @describe：
 * @version: 1.0
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Color getColor(String color) {
        if (color.equalsIgnoreCase("Red"))
            return new Red();
        else if (color.equalsIgnoreCase("Green"))
            return new Green();
        else if (color.equalsIgnoreCase("Blue"))
            return new Blue();
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        return null;
    }
}
