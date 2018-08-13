package com.ifsaid.prototype;

import com.ifsaid.prototype.impl.Circle;
import com.ifsaid.prototype.impl.Square;

import java.util.HashMap;
import java.util.Hashtable;

/**
 * @Program: Design-Pattern
 * @Description: 矩形缓存
 * @Author: Wang Chen Chen
 * @Create: 2018-08-13 20:43
 * @Version: 1.0
 **/
public class ShapeCache {

    private static Hashtable<String, Shape> hashtable = new Hashtable<>();

    public static Shape getShape(String shapeId) {
        Shape shape = hashtable.get(shapeId);
        return (Shape) shape.clone();
    }

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        hashtable.put(circle.getId(), circle);

        Square square = new Square();
        square.setId("2");
        hashtable.put(square.getId(), square);
    }

}
