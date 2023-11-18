package com.example.designpattern.BuilderPattern.FactoryPattern.config_factory;

public class AmericanCoffee extends Coffee {

    @Override
    public String getName() {
        return AmericanCoffee.class.getSimpleName();
    }
}
