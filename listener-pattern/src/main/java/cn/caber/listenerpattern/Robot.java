package cn.caber.listenerpattern;

import java.util.Objects;

/**
 * 事件源
 */
public class Robot {

    private String name;

    private MyListener myListener;

    public void registerListener(MyListener myListener){
        this.myListener = myListener;
    }

    public Robot(String name) {
        this.name = name;
    }

    public Robot() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String dance(){
        System.out.println("我是"+name+",我在跳舞。");
        if(Objects.nonNull(myListener)){
            Even even = new Even(this);
            myListener.dance(even);
        }
        return "我是"+name+",我在跳舞。";
    }

    public String work(){
        System.out.println("我是"+name+",我在工作。");
        return "我是"+name+",我在工作。";
    }
}
