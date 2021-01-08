package cn.caber.statePattern.stateImpl;

import cn.caber.statePattern.CandyMachine;
import cn.caber.statePattern.State;

import java.util.Objects;

public class StateCandySellOut implements State {
    public String insertCoin(CandyMachine candyMachine) {
        Integer income = candyMachine.getIncome();
        String result = "抱歉，糖果已经售罄！";

        if (Objects.nonNull(income) && income > 0) {
            result = result + '\n' + "请转动曲轴取回您的硬币";
        }
        System.out.println(result);
        return result;
    }

    public String crank(CandyMachine candyMachine) {
        System.out.println("抱歉，糖果已经售罄！");
        return "抱歉，糖果已经售罄！";
    }

    public String dispenseCandy(CandyMachine candyMachine) {
        System.out.println("抱歉，糖果已经售罄！");
        return "抱歉，糖果已经售罄！";
    }

    public String returnCoin(CandyMachine candyMachine) {
        return "抱歉，糖果已经售罄！";
    }
}
