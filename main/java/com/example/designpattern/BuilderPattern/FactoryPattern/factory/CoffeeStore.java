package com.example.designpattern.BuilderPattern.FactoryPattern.factory;

public class CoffeeStore {

    private CoffeeFactory coffeeFactory;

    public void setCoffeeFactory(CoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public Coffee orderCoffee(){
        Coffee coffe = coffeeFactory.createCoffee();
        coffe.addMilk();
        coffe.addSugar();
        return coffe;
    }
}
