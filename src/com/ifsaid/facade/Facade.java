package com.ifsaid.facade;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 22:12
 * @Version: 1.0
 **/
public class Facade {

    private StartPower startPower = null;
    private BoisSelfTest boisSelfTest = null;
    private SystemGuide systemGuide = null;
    private EnterSystem enterSystem = null;

    public void startComputer() {
        startPower = new StartPower();
        boisSelfTest = new BoisSelfTest();
        systemGuide = new SystemGuide();
        enterSystem = new EnterSystem();
        startPower.startPower();
        boisSelfTest.boisSelfTest();
        systemGuide.systemGuide();
        enterSystem.enterSystem();
    }

}
