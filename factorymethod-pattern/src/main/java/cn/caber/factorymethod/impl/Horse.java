package cn.caber.factorymethod.impl;

import cn.caber.factorymethod.Animal;

/**
 * @Description: 具体产品
 * @Author: zhaikaibo
 * @Date: 2019/12/26 16:26
 */
public class Horse implements Animal {

    private String color;
    private int  age;
    private String name;


    public void showName() {
        System.out.println("我是"+name);
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
