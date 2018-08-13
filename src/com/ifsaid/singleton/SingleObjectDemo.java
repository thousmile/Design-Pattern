package com.ifsaid.singleton;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 16:30
 * @describe： 单例设计模式
 *              这种模式涉及一个类，它负责创建一个对象，
 *              同时确保只创建一个对象。这个类提供了一种方法来访问它的唯一对象，
 *              可以直接访问，而不需要实例化类的对象。
 *
 *              举例：
 *                  我饿了，用“电饭煲”煮了一锅饭，我吃了饭就不饿了。
 *                  我室友回来了，他也饿了，也用“电饭煲”煮了一锅饭。
 *                  1.电饭煲就是个单例，
 *
 *                  我们不可能每次用完电饭煲就扔了吧，
 *                  当然你要是有钱的话，每做一次饭就换个“电饭煲”也没人拦你
 *
 * @version: 1.0
 */
public class SingleObjectDemo {

    public static void main(String[] args) {

        SingleObject.getSingleObject().showMsg();

    }
}
