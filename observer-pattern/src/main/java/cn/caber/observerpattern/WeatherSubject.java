package cn.caber.observerpattern;

import java.util.ArrayList;
import java.util.List;

public class WeatherSubject implements Subject{

    List<Observer> observerList = new ArrayList<Observer>();

    @Override
    public void registerObserver(Observer observer) {
        if(observerList == null){
            observerList = new ArrayList<Observer>();
        }else if(!observerList.contains(observer)) {
            observerList.add(observer);
        }
    }
    @Override
    public void removeObserver(Observer observer) {
        if(observerList == null || observerList.isEmpty()){
            return;
        }else if(!observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }
    @Override
    public void notifyObserver() {
        if(observerList == null || observerList.isEmpty()){
            return;
        }else {
            for (Observer obs : observerList) {
                obs.doSomeThing();
            }
        }
    }

    public void change(){
        System.out.println("被观察者：天气变化了，开始下雨了");
        notifyObserver();
    }
}
