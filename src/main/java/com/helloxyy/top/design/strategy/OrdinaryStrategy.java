package com.helloxyy.top.design.strategy;

/**
 * Created by lihao on 17/12/13.
 *
 * @author lihao
 * @date 2020/1/27
 */
public class OrdinaryStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("普通会员 不打折");
        return money;
    }

    @Override
    public String getType() {
        return TypeEnum.Ordinary.name();
    }
}
