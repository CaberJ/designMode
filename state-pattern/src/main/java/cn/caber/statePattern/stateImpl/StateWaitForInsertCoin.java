package cn.caber.statePattern.stateImpl;

import cn.caber.statePattern.CandyMachine;
import cn.caber.statePattern.State;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:05
 */
public class StateWaitForInsertCoin implements State {

    public String insertCoin(CandyMachine candyMachine) {
        Integer income = candyMachine.getIncome();
        Integer coinCount = candyMachine.getCoinCount();
        int price = candyMachine.getPrice();
        Integer count = income/price;
        System.out.println("感谢使用caber牌糖果自动售卖机，目前糖果单价是"+price+"；您一共投入"+income+"块硬币，请转动曲轴开关；");
        candyMachine.setCoinCount(coinCount+income);
        return "感谢使用caber牌糖果自动售卖机，目前糖果单价是"+price+"；您一共投入"+income+"块硬币，请转动曲轴开关；";
    }

    public String crank(CandyMachine candyMachine) {
        System.out.println("您还没有投币，请先投币；");
        return "您还没有投币，请先投币；";
    }

    public String dispenseCandy(CandyMachine candyMachine) {
        System.out.println("您还没有投币，请先投币；");
        return "您还没有投币，请先投币；";
    }

    public String returnCoin(CandyMachine candyMachine) {
        System.out.println("您还没有投币，请先投币；");
        return "您还没有投币，请先投币；";
    }
}
