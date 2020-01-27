package com.helloxyy.top.design.strategy;

import java.util.ArrayList;
import java.util.Map;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by lihao on 17/12/13.
 *
 * @author lihao
 * @date 2020/1/27
 */
public class StrategyFactory {
    private static StrategyFactory instance = new StrategyFactory();
    private Map<String, Strategy> map;

    private StrategyFactory() {
        List<Strategy> strategies = new ArrayList();
        strategies.add(new OrdinaryStrategy());
        strategies.add(new SilverStrategy());
        map = strategies.stream().collect(Collectors.toMap(Strategy::getType, strategy -> strategy));
    }

    public static StrategyFactory getInstance() {
        return instance;
    }

    public Strategy get(String type) {
        return map.get(type);
    }

}
