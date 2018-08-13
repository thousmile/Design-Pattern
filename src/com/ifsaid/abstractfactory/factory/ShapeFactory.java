package com.ifsaid.abstractfactory.factory;

import com.ifsaid.abstractfactory.color.Color;
import com.ifsaid.abstractfactory.shape.Shape;
import com.ifsaid.abstractfactory.shape.impl.*;

import java.security.interfaces.ECKey;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:40
 * @describe：
 * @version: 1.0
 */
public class ShapeFactory extends AbstractFactory {

    @Override
    public Color getColor(String color) {
        return null;
    }

    @Override
    public Shape getShape(String shape) {
        if (shape.equalsIgnoreCase("Circle"))
            return new Circle();
        else if (shape.equalsIgnoreCase("Rectangle"))
            return new Rectangle();
        else if (shape.equalsIgnoreCase("Square"))
            return new Square();
        return null;
    }

}
