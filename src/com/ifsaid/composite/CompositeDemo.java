package com.ifsaid.composite;

import java.util.List;

/**
 * @Program: Design-Pattern
 * @Description: 组合模式
 *
 * 就是在一个对象中包含其他对象，这些被包含的对象可能是终点对象（不再包含别的对象），
 * 也有可能是非终点对象（其内部还包含其他对象，或叫组对象），我们将对象称为节点，
 * 即一个根节点包含许多子节点，这些子节点有的不再包含子节点，而有的仍然包含子节点，
 * 以此类推。很明显，这是树形结构，终结点叫叶子节点，非终节点（组节点）叫树枝节点，
 * 第一个节点叫根节点。同时也类似于文件目录的结构形式：文件可称之为终节点，目录可称之为非终节点（组节点）。
 *
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 22:18
 * @Version: 1.0
 **/
public class CompositeDemo {

    public static void main(String[] args) {
        //C盘
        Folder rootFolder = new Folder("D:");
        //C盘下的目录一
        Folder folder1 = new Folder("目录一");
        //C盘下的文件一
        File file1 = new File("文件一.txt");

        rootFolder.add(folder1);
        rootFolder.add(file1);

        //目录一下的目录二
        Folder folder2 = new Folder("目录二");
        //目录一下的文件二
        File file2 = new File("文件二.txt");
        folder1.add(folder2);
        folder1.add(file2);

        //目录二下的目录三
        Folder folder3 = new Folder("目录三");
        //目录二下的文件三
        File file3 = new File("文件三.txt");
        folder2.add(folder3);
        folder2.add(file3);

        displayTree(rootFolder, 0);

    }


    public static void displayTree(IFile rootFolder, int deep) {
        for (int i = 0; i < deep; i++) {
            System.out.print("--");
        }
        //显示自身的名称
        rootFolder.display();
        //获得子树
        List<IFile> children = rootFolder.getChild();
        //遍历子树
        for (IFile file : children) {
            if (file instanceof File) {
                for (int i = 0; i <= deep; i++) {
                    System.out.print("--");
                }
                file.display();
            } else {
                displayTree(file, deep + 1);
            }
        }
    }
}
