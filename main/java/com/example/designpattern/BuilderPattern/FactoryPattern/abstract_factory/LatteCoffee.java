package com.example.designpattern.BuilderPattern.FactoryPattern.abstract_factory;

public class LatteCoffee extends Coffee {

    @Override
    public String getName() {
        return LatteCoffee.class.getSimpleName();
    }
}
