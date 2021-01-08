package cn.caber.observerpattern;

public class Test {
    public static void main(String[] args) {
        WeatherSubject weatherSubject = new WeatherSubject();
        weatherSubject.registerObserver(new FatherObserver());
        weatherSubject.registerObserver(new MotherObserver());
        weatherSubject.change();
    }
}
