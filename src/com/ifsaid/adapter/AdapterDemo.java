package com.ifsaid.adapter;

/**
 * @Program: Design-Pattern
 * @Description: 笔记本电脑使用220V电源
 * @Author: Wang Chen Chen
 * @Create: 2018-09-16 12:04
 * @Version: 1.0
 **/
public class AdapterDemo {
    public static void main(String[] args) {
        /*PowerSupply powerSupply = new PowerSupply();
        powerSupply.powerSupply220V();*/

        /*ElectricAdapter adapter = new ElectricAdapter();
        adapter.powerSupply18V();*/
        EntrustAdapter entrustAdapter = new EntrustAdapter(new PowerSupply());
        entrustAdapter.powerSupply18V();

    }
}
