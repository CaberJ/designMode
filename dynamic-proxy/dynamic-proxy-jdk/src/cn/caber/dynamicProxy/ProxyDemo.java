package cn.caber.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxyDemo implements InvocationHandler {
    //代理类
    private Object obj;

    public Object getInstance(Object mrJ) {
        this.obj = mrJ;
        return Proxy.newProxyInstance(mrJ.getClass().getClassLoader(), mrJ.getClass().getInterfaces(), this);
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        Object invoke=null;

        String name = method.getName();
        //对真实对象的方法做判断筛选，只对部分方法做增强；
        if(name.equalsIgnoreCase("sing")){
            System.out.println("I am ready for singing");
            invoke = method.invoke(obj, args);
            System.out.println("Thank you for listening");
        }else {
            invoke = method.invoke(obj, args);
        }


        return invoke;
    }
}
