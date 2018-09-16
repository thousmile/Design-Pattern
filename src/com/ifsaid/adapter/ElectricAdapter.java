package com.ifsaid.adapter;

/**
 * @Program: Design-Pattern
 * @Description: 电源适配器
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:05
 * @Version: 1.0
 **/
public class ElectricAdapter extends PowerSupply {

    public void powerSupply18V(){
        System.out.println("使用适配器");
        this.powerSupply220V();
        System.out.println("电压降为18V");
    }

}
