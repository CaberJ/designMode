package cn.caber.statePattern.stateImpl;

import cn.caber.statePattern.CandyMachine;
import cn.caber.statePattern.State;

import java.util.Objects;

public class StateDistributedCandy implements State {
    public String insertCoin(CandyMachine candyMachine) {
        System.out.println("你的糖果订单正在出货，现在不能购买！");
        return "你的糖果订单正在出货，现在不能购买！";
    }

    public String crank(CandyMachine candyMachine) {
        System.out.println("你的糖果订单正在出货,请不要转动曲轴开关！");
        return "你的糖果订单正在出货,请不要转动曲轴开关！";
    }

    public String dispenseCandy(CandyMachine candyMachine) {
        Integer candyNum = candyMachine.getCandyNum();
        Integer candyCount = candyMachine.getCandyCount();
        Integer income = candyMachine.getIncome();
        candyMachine.setIncome(0);
        candyMachine.setCandyNum(0);
        if (Objects.nonNull(candyNum) && candyNum > 0) {

            candyMachine.setCandyCount(candyCount - candyNum);
            System.out.println("请收好您的糖果，共" + candyNum + "颗；");
            return "请收好您的糖果，共" + candyNum + "颗，欢迎下次光临；";
        } else if (income > 0) {
            System.out.println("硬币退回给您。");
            candyMachine.setChange(income);
            return "硬币退回给您。";
        } else {
            return "";
        }


    }

    public String returnCoin(CandyMachine candyMachine) {
        Integer change = candyMachine.getChange();
        if (change > 0) {
            System.out.println("找零" + change + "块硬币，请收好，欢迎下次光临；");
            candyMachine.setChange(0);
            Integer coinCount = candyMachine.getCoinCount();
            candyMachine.setCoinCount(coinCount - change);
            return "找零" + change + "块硬币，请收好，欢迎下次光临；";
        }
        return "";

    }
}
