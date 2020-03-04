package cn.caber.singleton;

/**
 * @Description:单例懒汉式
 * @Author: zhaikaibo
 * @Date: 2019/12/26 14:54
 */
public class LazySingleton {
    private static volatile LazySingleton lazySingleton = null;

    private LazySingleton() {
    }

    public static LazySingleton getInstance() {
        if (lazySingleton == null) {
            synchronized (LazySingleton.class) {
                if (lazySingleton == null) {
                    lazySingleton = new LazySingleton();
                }
            }
        }
        return lazySingleton;
    }
}
