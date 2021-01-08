package cn.caber.statePattern;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:01
 */
public interface State {

    /**
     * 投币
     * @param candyMachine
     */
    String insertCoin(CandyMachine candyMachine);

    /**
     * 转动曲轴
     * @param candyMachine
     */
    String crank (CandyMachine candyMachine);

    /**
     * 分发糖果
     * @param candyMachine
     */
    String dispenseCandy(CandyMachine candyMachine);

    /**
     * 退币
     * @param candyMachine
     */
    String returnCoin(CandyMachine candyMachine);

}
