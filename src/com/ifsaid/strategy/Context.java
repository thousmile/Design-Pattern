package com.ifsaid.strategy;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 21:20
 * @Version: 1.0
 **/
public class Context {

    private Strategy strategy;

    public Context(Strategy stratrgy){
        this.strategy = stratrgy;
    }

    public void encrypt(){
        this.strategy.encrypt();
    }

}
