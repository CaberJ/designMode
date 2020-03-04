package cn.caber.chainofresponsibility.test;

import cn.caber.chainofresponsibility.HandlerOne;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2020/3/4 12:06
 */
public class HandlerTest {
    public static void main(String[] args) {
        HandlerOne handlerOne = new HandlerOne();
        handlerOne.handle();
    }
}
