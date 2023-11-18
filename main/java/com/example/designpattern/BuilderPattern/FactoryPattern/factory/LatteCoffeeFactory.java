package com.example.designpattern.BuilderPattern.FactoryPattern.factory;

public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
