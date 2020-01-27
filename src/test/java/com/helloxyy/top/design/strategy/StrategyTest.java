package com.helloxyy.top.design.strategy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by lihao on 17/12/13.
 *
 * @author lihao
 * @date 2020/1/27
 */
public class StrategyTest {

    @Test
    public void test() {
        long money = 1000;
        double ret = StrategyFactory.getInstance().get(TypeEnum.Silver.name()).compute(money);
        assertEquals(950, ret);
    }
}
