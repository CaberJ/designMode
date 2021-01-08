package cn.caber.statePattern;

import cn.caber.statePattern.stateImpl.StateDistributedCandy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/state")
public class TestController {

    @Autowired
    private CandyMachine candyMachine;

    @RequestMapping("/startUp")
    public String startUp(@RequestParam Integer initCandyCount,@RequestParam Integer price) {
        return candyMachine.startUp(initCandyCount, price);
    }

    @RequestMapping("/insertCoin")
    public String insertCoin(@RequestParam Integer income) {
        return candyMachine.insertCoin(income);
    }

    @RequestMapping("/crank")
    public String crank() {
        return candyMachine.crank();
    }

    @RequestMapping("/count")
    public String coinCount() {
        Integer coinCount = candyMachine.getCoinCount();
        Integer candyCount = candyMachine.getCandyCount();
        return "当前硬币总量："+coinCount+";"+'\n'+"当前糖果总量："+candyCount+";";
    }


}
