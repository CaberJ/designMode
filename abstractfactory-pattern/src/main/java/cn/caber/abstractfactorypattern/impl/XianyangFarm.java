package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Animal;
import cn.caber.abstractfactorypattern.Farm;
import cn.caber.abstractfactorypattern.Tree;

/**
 * @Description：咸阳机场
 * @Author：caber
 * @Date：2020/4/30 10:51
 */
public class XianyangFarm implements Farm {

    @Override
    public Animal getAnimal() {
        Dog dog = new Dog();
        dog.setColour("yellow");
        return dog;
    }

    @Override
    public Tree getTree() {
        Willow willow = new Willow();
        willow.setHeight(6);
        return willow;
    }
}
