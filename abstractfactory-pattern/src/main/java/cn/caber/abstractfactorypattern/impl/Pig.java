package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Animal;

/**
 * @Description：猪
 * @Author：caber
 * @Date：2020/4/30 10:19
 */
public class Pig implements Animal {

    private String colour;
    private int age;

    public Pig(String colour, int age) {
        this.colour = colour;
        this.age = age;
    }

    public Pig() {
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String cry() {
        System.out.println("猪叫");
        return "嗷~";
    }
}
