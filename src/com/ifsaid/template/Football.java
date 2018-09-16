package com.ifsaid.template;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:59
 * @Version: 1.0
 **/
public class Football extends Game {
    @Override
    void endPlay() {
        System.out.println("Football Game Finished!");
    }

    @Override
    void initialize() {
        System.out.println("Football Game Initialized! Start playing.");
    }

    @Override
    void startPlay() {
        System.out.println("Football Game Started. Enjoy the game!");
    }
}
