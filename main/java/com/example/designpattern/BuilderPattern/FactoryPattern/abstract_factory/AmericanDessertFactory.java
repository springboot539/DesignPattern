package com.example.designpattern.BuilderPattern.FactoryPattern.abstract_factory;

/**
 * 实现DessertFactory并重写方法
 */
public class AmericanDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new MatchaMousse();
    }
}
