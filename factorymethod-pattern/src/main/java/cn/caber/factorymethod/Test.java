package cn.caber.factorymethod;

import cn.caber.factorymethod.impl.HorseFactory;

import java.util.Iterator;
import java.util.ServiceLoader;

/**
 * @Description: 工厂方法模式
 * 工厂和产品都是抽象的，可通过配置来确定工厂的类型，之后获取工厂，生产产品使用。
 * @Author: zhaikaibo
 * @Date: 2019/12/26 16:29
 */
public class Test {
    public static void main(String[] args) {

        ServiceLoader<AnimalFactory> load = ServiceLoader.load(AnimalFactory.class);
        Iterator<AnimalFactory> iterator = load.iterator();
        HorseFactory horseFactory = null;
        while (iterator.hasNext()) {
            AnimalFactory next = iterator.next();
            if (next instanceof HorseFactory) {
                horseFactory = (HorseFactory) next;
                break;
            }
        }
        Animal animal = horseFactory.creatAnimal();
        animal.showName();


    }
}
