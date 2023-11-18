package com.example.designpattern.BuilderPattern.FactoryPattern.simpleFactory;

public class AmericanCoffee extends Coffee{

    @Override
    public String getName() {
        return AmericanCoffee.class.getSimpleName();
    }
}
