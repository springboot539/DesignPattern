package com.example.designpattern.BuilderPattern.FactoryPattern.simpleFactory;

public class CoffeeStore {

    public Coffee orderCoffer(String type){
        SimpleCoffeFactory factory = new SimpleCoffeFactory();
        Coffee coffee = factory.createCoffee(type);
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
