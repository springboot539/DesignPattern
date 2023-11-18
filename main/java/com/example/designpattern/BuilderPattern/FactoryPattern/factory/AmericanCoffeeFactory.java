package com.example.designpattern.BuilderPattern.FactoryPattern.factory;

public class AmericanCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new AmericanCoffee();
    }
}
