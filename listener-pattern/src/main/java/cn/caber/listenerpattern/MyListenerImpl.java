package cn.caber.listenerpattern;

public class MyListenerImpl implements MyListener {
    public String dance(Even even) {

        Robot robot = even.getRobot();
        System.out.println("请观看"+robot.getName()+"跳舞。");
        return "请观看"+robot.getName()+"跳舞。";
    }
}
