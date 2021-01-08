package cn.caber.statePattern;

import cn.caber.statePattern.stateImpl.StateCandySellOut;
import cn.caber.statePattern.stateImpl.StateDistributedCandy;
import cn.caber.statePattern.stateImpl.StatePayToComplete;
import cn.caber.statePattern.stateImpl.StateWaitForInsertCoin;
import org.springframework.stereotype.Service;

import java.util.Objects;

/**
 * @Description: 糖果机实现
 * 四种状态： 等待客人投币；硬币投入；糖果发放中；糖果售罄
 * 五个动作： 投币，退币，糖果发放，转动曲轴（投币后转动曲轴才能出糖果），
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:06
 */
@Service
public class CandyMachine {
    private Integer candyCount; // 当前糖果总数
    private State state;  // 当前状态
    private Integer coinCount; // 当前总收入
    private Integer price; //一分钱一个糖果
    private Integer income; //单笔收入
    private Integer change;// 找零，退币
    private Integer candyNum; // 需要分配的糖果数

    public CandyMachine() {
    }

    public Integer getCandyCount() {
        return candyCount;
    }

    public void setCandyCount(Integer candyCount) {
        this.candyCount = candyCount;
    }

    public Integer getCoinCount() {
        return coinCount;
    }

    public void setCoinCount(Integer coinCount) {
        this.coinCount = coinCount;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Integer getIncome() {
        return income;
    }

    public void setIncome(Integer income) {
        this.income = income;
    }

    public Integer getChange() {
        return change;
    }

    public void setChange(Integer change) {
        this.change = change;
    }

    public Integer getCandyNum() {
        return candyNum;
    }

    public void setCandyNum(Integer candyNum) {
        this.candyNum = candyNum;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态为：" + state);
    }

    public String startUp(Integer initCandyCount, Integer price) {
        if (Objects.isNull(price)) {
            this.price = 1;
        } else {
            this.price = price;
        }
        candyCount = initCandyCount;
        coinCount = 0;
        state = new StateWaitForInsertCoin();
        return "caber糖果屋开机";
    }

    public String insertCoin(Integer income) {
        this.income = income;
        if (income > 0) {
            String s = state.insertCoin(this);
            setState(new StatePayToComplete());
            return s;
        } else {
            return "投币无效,请重试";
        }

    }

    public String crank() {
        String crank = state.crank(this);
        setState(new StateDistributedCandy());
        String dispenseCandy = dispenseCandy();
        return crank + '\n' + dispenseCandy;
    }

    public String dispenseCandy() {
        String dispenseCandy = state.dispenseCandy(this);
        String returnCoin = "";
        if (change > 0) {
            returnCoin = returnCoin();
        }
        if (candyCount > 0) {
            setState(new StateWaitForInsertCoin());
        } else {
            setState(new StateCandySellOut());
        }
        return dispenseCandy + '\n' + returnCoin;
    }

    public String returnCoin() {
        return state.returnCoin(this);
    }


}
