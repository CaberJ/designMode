package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Animal;

/**
 * @Description：狗
 * @Author：caber
 * @Date：2020/4/30 10:35
 */
public class Dog implements Animal {

    private String colour;

    public Dog(String colour) {
        this.colour = colour;
    }

    public Dog() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public String cry() {
        System.out.println("狗叫");
        return "旺~";
    }

}
