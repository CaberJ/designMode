package cn.caber.factorymethod.impl;

import cn.caber.factorymethod.Animal;
import cn.caber.factorymethod.AnimalFactory;

/**
 * @Description：具体产品
 * @Author：caber
 * @Date：2020/4/29 11:03
 */
public class Pig implements Animal {

    private  String name;

    public Pig() {
    }

    public Pig(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void showName() {
        System.out.println("我叫："+name);
    }
}
