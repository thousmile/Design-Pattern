package com.ifsaid.factory;

import com.ifsaid.factory.impl.*;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:20
 * @describe： 创建形状工厂，用来生产形状
 * @version: 1.0
 */
public class ShapeFactory {

    public static Shape getShape(String shapeType) {
        Shape shape = null;
        switch (shapeType) {
            case "Circle":
                shape = new Circle();
                break;
            case "Rectangle":
                shape = new Rectangle();
                break;
            case "Square":
                shape = new Square();
                break;
        }
        return shape;
    }
}
