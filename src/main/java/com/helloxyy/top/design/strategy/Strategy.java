package com.helloxyy.top.design.strategy;

/**
 * Created by lihao on 17/12/13.
 *
 * @author lihao
 * @date 2020/1/27
 */
public interface Strategy {
    double compute(long money);

    String getType();
}
