package com.example.designpattern.Behavioralpattern.StrategyMethod;


public class Client {
    public static void main(String[] args) {
        Strategy strategy = new StrategyB();
        SalesMan man = new SalesMan(strategy);
        man.salesManShow();

        man.setStrategy(new StrategyC());
        man.salesManShow();
    }
}
