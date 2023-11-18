package com.example.designpattern.Behavioralpattern.StrategyMethod;

/**
 * 环境类， 聚合策略类
 */
public class SalesMan {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public SalesMan(Strategy strategy) {
        this.strategy = strategy;
    }

    //提供给客户接口
    public void salesManShow(){
        strategy.show();
    }
}
