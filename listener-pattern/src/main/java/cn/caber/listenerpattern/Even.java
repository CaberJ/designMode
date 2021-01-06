package cn.caber.listenerpattern;

public class Even {
    private Robot robot;

    public Even(Robot robot) {
        this.robot = robot;
    }

    public Even() {
    }

    public Robot getRobot() {
        return robot;
    }

    public void setRobot(Robot robot) {
        this.robot = robot;
    }
}
