package cn.caber.observerpattern;

public class MotherObserver implements Observer{
    @Override
    public String doSomeThing() {
        System.out.println("观察者：我是妈妈，我看到下雨了，我得让我儿子上学带把伞；");
        return "success";
    }
}
