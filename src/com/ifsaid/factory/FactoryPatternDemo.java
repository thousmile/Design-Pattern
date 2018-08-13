package com.ifsaid.factory;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 15:25
 * @describe： 工厂设计模式
 *      在工厂模式中，我们没有创建逻辑暴露给客户端创建对象，
 *      并使用一个通用的接口引用新创建的对象
 *
 *      举例：
 *          我饿了，我找了一家“肯德基店”，点了一份汉堡，解决了我的问题
 *          1.肯德基就是“工厂”，可以产生 汉堡，鸡翅，蛋挞，等
 *          2.我就是需要对象的消费者，我不需要知道“汉堡”是怎么做出来的，
 *              只要知道，汉堡能止住我的饥饿就行了，
 *
 * @version: 1.0
 */
public class FactoryPatternDemo {


    public static void main(String[] args) {

        ShapeFactory.getShape("Circle").draw();

        ShapeFactory.getShape("Rectangle").draw();

        ShapeFactory.getShape("Square").draw();



    }

}
