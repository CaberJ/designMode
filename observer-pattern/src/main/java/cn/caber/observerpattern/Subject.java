package cn.caber.observerpattern;

import java.util.List;

/**
 * 主题接口，被观察者
 */
public interface Subject {

    void registerObserver(Observer observer);
    void removeObserver(Observer observer);
    void notifyObserver();

}
