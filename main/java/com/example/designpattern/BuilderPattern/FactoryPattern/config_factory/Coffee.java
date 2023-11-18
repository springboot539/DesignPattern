package com.example.designpattern.BuilderPattern.FactoryPattern.config_factory;

public abstract class Coffee {

    public void addMilk(){
        System.out.println("添加牛奶");
    }

    public void addSugar(){
        System.out.println("添加糖块");
    }

    public abstract String getName();
}
