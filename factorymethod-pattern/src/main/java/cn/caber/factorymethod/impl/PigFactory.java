package cn.caber.factorymethod.impl;

import cn.caber.factorymethod.Animal;
import cn.caber.factorymethod.AnimalFactory;

/**
 * @Description：具体工厂
 * @Author：caber
 * @Date：2020/4/29 11:02
 */
public class PigFactory implements AnimalFactory {

    @Override
    public Animal creatAnimal() {

        Pig pig = new Pig();
        pig.setName("野猪");
        return pig;
    }
}
