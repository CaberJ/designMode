package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Tree;

/**
 * @Description：柳树
 * @Author：caber
 * @Date：2020/4/30 10:40
 */
public class Willow implements Tree {

    private int height;

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String shake() {
        System.out.println("我是柳树");
        return "玲~";
    }
}
