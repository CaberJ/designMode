package cn.caber.abstractfactorypattern.impl;

import cn.caber.abstractfactorypattern.Animal;
import cn.caber.abstractfactorypattern.Farm;
import cn.caber.abstractfactorypattern.Tree;

/**
 * @Description：具体工厂（西安农场,养猪，种杨树）
 * @Author：caber
 * @Date：2020/4/30 10:17
 */
public class XianFarm implements Farm {


    @Override
    public Animal getAnimal() {
        Pig pig = new Pig();
        pig.setAge(3);
        pig.setColour("black");
        return pig;
    }

    @Override
    public Tree getTree() {
        Alamo alamo = new Alamo(25);
        return alamo;
    }
}
