package com.ifsaid.abstractfactory.factory;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:50
 * @describe：
 * @version: 1.0
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String choice) {
        if (choice.equalsIgnoreCase("Shape")) {
            return new ShapeFactory();
        } else if (choice.equalsIgnoreCase("Color")) {
            return new ColorFactory();
        }
        return null;
    }

}
