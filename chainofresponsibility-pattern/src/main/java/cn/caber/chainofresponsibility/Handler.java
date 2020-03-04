package cn.caber.chainofresponsibility;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2020/3/4 11:15
 */
public abstract class Handler {

    private Handler next;

    public void setNext(Handler next) {
        this.next = next;
    }

    public Handler getNext() {
        return next;
    }

    public abstract void handle();


}

