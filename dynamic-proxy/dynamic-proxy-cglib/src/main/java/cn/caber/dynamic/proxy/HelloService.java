package cn.caber.dynamic.proxy;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/5/8 17:50
 */
public class HelloService {

    public HelloService() {
        System.out.println("HelloService 构造方法");
    }

    public void sayHello(){
        System.out.println("Hello");
    }

    public void sayOther(String s){
        System.out.println("hello " + s);
    }
}
