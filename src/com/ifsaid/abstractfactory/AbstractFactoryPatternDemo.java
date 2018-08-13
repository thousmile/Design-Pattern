package com.ifsaid.abstractfactory;

import com.ifsaid.abstractfactory.factory.AbstractFactory;
import com.ifsaid.abstractfactory.factory.FactoryProducer;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:31
 * @describe：
 *      抽象工厂模式是一个超级工厂，用来创建其他工厂。
 *      这个工厂也被称为工厂的工厂。 这种类型的设计模式属于创建模式，
 *      因为此模式提供了创建对象的最佳方法之一。
 *      在抽象工厂模式中，接口负责创建相关对象的工厂，
 *      而不明确指定它们的类。 每个生成的工厂可以按照工厂模式提供对象。
 *
 *      举例：
 *          我饿了，我想吃饭，在工程工厂模式中，我需要找到店铺，才能吃上饭，
 *          而在抽象工厂模式中，我只需要打开“美团外卖”选一个肯德基店铺，进去点一个汉堡，就可以解决我的温饱
 *          1.美团外卖 就是“超级工厂”
 *          2.美团上的店铺 就是“普通工厂”
 *          3.我就是需要对象的消费者
 *          流程：我通过“美团外卖”，获取到 “肯德基店铺”，肯德基店铺给我产生了一个汉堡，解决了我的温饱
 *
 * @version: 1.0
 */
public class AbstractFactoryPatternDemo {

    public static void main(String[] args) {
        // 用超级工厂，产生一个，普通工厂
        AbstractFactory shapeFactory = FactoryProducer.getFactory("Shape");
        // 用普通工厂，获取 一个圆形对象。并且调用画图方法
        shapeFactory.getShape("Circle").draw();
        // 以此类推，获取其他对象
        shapeFactory.getShape("Square").draw();
        // 以此类推，获取其他对象
        shapeFactory.getShape("Rectangle").draw();

        System.out.println("--------------- color ------------------------");
        AbstractFactory colorFactory = FactoryProducer.getFactory("Color");
        colorFactory.getColor("Red").fill();
        colorFactory.getColor("Blue").fill();
        colorFactory.getColor("Green").fill();


    }


}
