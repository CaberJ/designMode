package cn.caber.factorymethod.impl;

import cn.caber.factorymethod.Animal;
import cn.caber.factorymethod.AnimalFactory;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/12/26 16:27
 */
public class HorseFactory implements AnimalFactory {

    public Animal creatAnimal() {
        Horse horse = new Horse();
        horse.setAge(5);
        horse.setColor("red");
        horse.setName("horse");
        return horse;
    }
}
