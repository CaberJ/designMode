package cn.caber.strategypattern.service;

import cn.caber.strategypattern.po.Input;
import cn.caber.strategypattern.po.Output;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/7/9 20:21
 */
public class StrategyContext {

    private Strategy strategy;

    public StrategyContext(Strategy strategy){
        this.strategy=strategy;
    }

    public Output executeStrategy(Input input){
        return strategy.operate(input);

    }
}
