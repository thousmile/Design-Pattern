package com.ifsaid.builder;

/**
 * @author: Wang Chen Chen
 * @Date: 2018/8/13 16:46
 * @describe： 建造者模式（Builder）
 *              建造者模式适合于一个具有较多的零件（属性）的产品（对象）的创建过程。
 *              根据产品创建过程中零件的构造是否具有一致的先后顺序，
 *              可以将其分为如下两种形式
 *              （转）：
 *              简单地说，我想要一座房子住，可是我不知道怎么盖（简单的砌墙，层次较低），
 *              也不知道怎么样设计（建几个房间，几个门好看，层次较高），于是我需要找一帮民工，
 *              他们会砌墙，还得找个设计师，他知道怎么设计，我还要确保民工听设计师的领导，
 *              而设计师本身也不干活，光是下命令，这里砌一堵墙，这里砌一扇门，这样民工开始建设，
 *              最后，我可以向民工要房子了。在这个过程中，设计师是什么也没有，除了他在脑子里的设计和命令，
 *              所以要房子也是跟民工要，记住了！
 *
 *
 * @version: 1.0
 */
public class BuilderDemo {

    public static void main(String[] args) {
        Computer build = new Computer.Builder().setCpu("Intel").setDisk(500).setMainboard("华硕").setRamSize(4).build();
        System.out.println(build);

    }


}
