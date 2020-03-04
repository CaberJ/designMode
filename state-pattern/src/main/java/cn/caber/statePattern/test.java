package cn.caber.statePattern;

import cn.caber.statePattern.stateImpl.StateOne;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 10:40
 */
public class test {
    public static void main(String[] args) {
        Context context = new Context();
        context.setState(new StateOne());
        context.exe();
    }
}
