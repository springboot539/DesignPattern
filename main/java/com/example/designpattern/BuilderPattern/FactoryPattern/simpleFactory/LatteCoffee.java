package com.example.designpattern.BuilderPattern.FactoryPattern.simpleFactory;

public class LatteCoffee extends Coffee{

    @Override
    public String getName() {
        return LatteCoffee.class.getSimpleName();
    }
}
