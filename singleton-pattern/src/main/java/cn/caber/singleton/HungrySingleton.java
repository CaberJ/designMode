package cn.caber.singleton;

/**
 * @Description:饿汉式  私有化构造，并且在final的成员变量中只创建一次
 * @Author: zhaikaibo
 * @Date: 2019/12/26 14:58
 */
public class HungrySingleton {
    private static final HungrySingleton hungrySingleton = new HungrySingleton();
    private HungrySingleton(){}
    public static HungrySingleton getInstance(){
        return hungrySingleton;
    }
}
