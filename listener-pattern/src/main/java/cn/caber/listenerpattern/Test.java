package cn.caber.listenerpattern;

public class Test {
    public static void main(String[] args) {
        Robot robot = new Robot();
        robot.setName("caber");
        robot.registerListener(new MyListenerImpl());
        robot.dance();
        robot.work();
    }
}
