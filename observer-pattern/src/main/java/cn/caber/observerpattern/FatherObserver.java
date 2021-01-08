package cn.caber.observerpattern;

public class FatherObserver implements Observer {
    @Override
    public String doSomeThing() {
        System.out.println("观察者：我是爸爸，我看到下雨了，我得开车送我老婆上班；");
        return "success";
    }
}
