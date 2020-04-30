package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Tree;

/**
 * @Description：白杨
 * @Author：caber
 * @Date：2020/4/30 10:20
 */
public class Alamo implements Tree {

    private int height;

    public Alamo(int height) {
        this.height = height;
    }

    public Alamo() {
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String shake() {
        System.out.println("我是白杨，我在摇");
        return "沙~";
    }
}
