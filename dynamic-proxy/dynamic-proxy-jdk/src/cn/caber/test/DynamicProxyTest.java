package cn.caber.test;

import cn.caber.dynamicProxy.ProxyDemo;
import cn.caber.realObject.MrJ;
import cn.caber.realObject.Person;

public class DynamicProxyTest {
    public static void main(String[] args) {
        ProxyDemo proxyDemo = new ProxyDemo();
        Person instance = (Person) proxyDemo.getInstance(new MrJ());
        instance.sing();
        instance.eating();
    }
}
