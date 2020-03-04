package cn.caber.statePattern.stateImpl;

import cn.caber.statePattern.Context;
import cn.caber.statePattern.State;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:05
 */
public class StateOne implements State {
    public void doAction(Context context) {
        context.setState(this);
        System.out.println("执行了状态一");
    }
}
