package com.example.designpattern.BuilderPattern.FactoryPattern.factory;

public class AmericanCoffee extends Coffee{

    @Override
    public String getName() {
        return AmericanCoffee.class.getSimpleName();
    }
}
