package com.ifsaid.adapter;

/**
 * @Program: Design-Pattern
 * @Description: 以委托的形式实现适配器
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:09
 * @Version: 1.0
 **/
public class EntrustAdapter {

    private PowerSupply powerSupply;

    public EntrustAdapter(PowerSupply powerSupply) {
        this.powerSupply = powerSupply;
    }

    public void powerSupply18V() {
        System.out.println("使用适配器");
        this.powerSupply.powerSupply220V();
        System.out.println("电压降为18V");
    }

}
