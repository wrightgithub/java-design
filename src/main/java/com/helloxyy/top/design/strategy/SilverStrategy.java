package com.helloxyy.top.design.strategy;

/**
 * Created by lihao on 17/12/13.
 *
 * @author lihao
 * @date 2020/1/27
 */
public class SilverStrategy implements Strategy {
    @Override
    public double compute(long money) {
        System.out.println("白银会员 优惠50元");
        return money - 50;
    }

    @Override
    public String getType() {
        return TypeEnum.Silver.name();
    }
}
