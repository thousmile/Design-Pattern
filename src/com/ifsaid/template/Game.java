package com.ifsaid.template;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:58
 * @Version: 1.0
 **/
public abstract class Game {

    abstract void initialize();

    abstract void startPlay();

    abstract void endPlay();

    //模板
    public final void play() {

        //初始化游戏
        initialize();

        //开始游戏
        startPlay();

        //结束游戏
        endPlay();
    }

}
