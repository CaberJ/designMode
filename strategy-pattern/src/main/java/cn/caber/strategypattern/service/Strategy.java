package cn.caber.strategypattern.service;

import cn.caber.strategypattern.po.Input;
import cn.caber.strategypattern.po.Output;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/7/9 20:11
 */
public interface Strategy {
    Output operate(Input input);
}
