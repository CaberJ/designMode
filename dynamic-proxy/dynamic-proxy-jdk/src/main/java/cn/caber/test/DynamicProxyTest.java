package cn.caber.test;

import cn.caber.dynamicProxy.ProxyDemo;
import cn.caber.realObject.MrJ;
import cn.caber.realObject.Person;

import java.lang.reflect.Proxy;

public class DynamicProxyTest {
    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");
        ProxyDemo proxyDemo = new ProxyDemo();
        Person instance = (Person) proxyDemo.getInstance(new MrJ());
        String name = instance.getClass().getName();
        System.out.println(name);
        instance.sing();
        instance.eating();
    }
}
