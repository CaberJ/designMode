package cn.caber.strategypattern;

import cn.caber.strategypattern.po.Input;
import cn.caber.strategypattern.po.Output;
import cn.caber.strategypattern.service.StrategyContext;
import cn.caber.strategypattern.service.StrategyOne;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/7/9 20:20
 */
public class StrategyTest {
    public static void main(String[] args) {
        Input input = new Input();
        Output output = new StrategyContext(new StrategyOne()).executeStrategy(input);
        System.out.println(output.getStrategy());
    }
}
