package cn.caber.strategypattern.service;

import cn.caber.strategypattern.po.Input;
import cn.caber.strategypattern.po.Output;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/7/9 20:14
 */
public class StrategyOne implements Strategy{

    @Override
    public Output operate(Input input) {
        Output output = new Output();
        output.setId(input.getId());
        output.setInfo(input.getInfo());
        output.setStrategy("strategyOne");
        return output;
    }
}
