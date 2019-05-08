package cn.caber.dynamic.proxy;

import net.sf.cglib.proxy.Enhancer;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/5/8 17:54
 */
public class Test {
    public static void main(String[] args) {
        // 通过CGLIB动态代理获取代理对象的过程
        Enhancer enhancer = new Enhancer();
        // 设置enhancer对象的父类
        enhancer.setSuperclass(HelloService.class);
        // 设置enhancer的回调对象
        enhancer.setCallback(new MyMethodInterceptor());
        // 创建代理对象
        HelloService proxy= (HelloService)enhancer.create();
        // 通过代理对象调用目标方法
        proxy.sayHello();


    }
}
