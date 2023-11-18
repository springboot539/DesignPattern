package com.example.designpattern.BuilderPattern.FactoryPattern.config_factory;

public class LatteCoffee extends Coffee {

    //Override the getName() method to return the name of the LatteCoffee class
    @Override
    public String getName() {
        return LatteCoffee.class.getSimpleName();
    }
}
