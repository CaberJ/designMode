package cn.caber.statePattern.stateImpl;

import cn.caber.statePattern.CandyMachine;
import cn.caber.statePattern.State;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:05
 */
public class StatePayToComplete implements State {

    public String insertCoin(CandyMachine candyMachine) {
        System.out.println("您已经投币，请不要重复投币");
        return "您已经投币，请不要重复投币";
    }

    public String crank(CandyMachine candyMachine) {
        Integer candyCount = candyMachine.getCandyCount();
        Integer income = candyMachine.getIncome();
        int price = candyMachine.getPrice();
        Integer count = income / price;

        String result = "";
        if (candyCount >= count) {
            result = "你的糖果已经开始打包，请稍等...";
            candyMachine.setCandyNum(count);
            Integer change = income % price;
            candyMachine.setChange(change);
            System.out.println(result);
        } else {
            candyMachine.setCandyNum(0);
            result = "抱歉，糖果不足！";
            System.out.println(result);
        }
        return result;
    }

    public String dispenseCandy(CandyMachine candyMachine) {
        System.out.println("您的糖果尚未打包完成，请稍等...");
        return "您的糖果尚未打包完成，请稍等...";
    }

    public String returnCoin(CandyMachine candyMachine) {
        System.out.println("您有尚未完成的订单，不能退币！");
        return "您有尚未完成的订单，不能退币！";
    }
}
