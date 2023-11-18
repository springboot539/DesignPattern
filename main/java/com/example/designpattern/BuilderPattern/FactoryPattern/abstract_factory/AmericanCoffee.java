package com.example.designpattern.BuilderPattern.FactoryPattern.abstract_factory;


public class AmericanCoffee extends Coffee {

    @Override
    public String getName() {
        return AmericanCoffee.class.getSimpleName();
    }
}
