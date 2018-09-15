package com.ifsaid.composite;

import java.util.List;

/**
 * @Program: Design-Pattern
 * @Description:
 * @Author: Wang Chen Chen
 * @Create: 2018-09-15 22:15
 * @Version: 1.0
 **/
public interface IFile {

    //显示文件或者文件夹的名称
    public void display();

    //添加
    public boolean add(IFile file);

    //移除
    public boolean remove(IFile file);

    //获得子节点
    public List<IFile> getChild();

}
