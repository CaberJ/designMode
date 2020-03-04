package cn.caber.statePattern;

/**
 * @Description:
 * @Author: zhaikaibo
 * @Date: 2019/10/18 9:06
 */
public class Context {
    private State state;

    public Context() {
        this.state = null;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
        System.out.println("当前状态为：" + state);
    }

    public void exe(){
        state.doAction(this);
    }


}
