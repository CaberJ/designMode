package cn.caber.chainofresponsibility;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2020/3/4 12:05
 */
public class HandlerThree extends Handler{
    @Override
    public void handle() {
        System.out.println("我是第三个执行器");
        System.out.println("正在执行...");
        System.out.println("设置下一个执行器");
        setNext(null);
        if(getNext()!=null){
            getNext().handle();
        }
    }
}
