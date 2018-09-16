package com.ifsaid.template;

/**
 * @Program: Design-Pattern
 * @Description: 模板方法设计模式
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:54
 * @Version: 1.0
 **/
public class TemplateDemo {

    public static void main(String[] args) {
        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }

}
