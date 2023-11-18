package com.example.designpattern.BuilderPattern.FactoryPattern.factory;

import com.example.designpattern.BuilderPattern.FactoryPattern.factory.CoffeeStore;

public class TestCoffeeFactory {
    public static void main(String[] args) {
        CoffeeStore coffeStore = new CoffeeStore();
        coffeStore.setCoffeeFactory(new AmericanCoffeeFactory());
        coffeStore.orderCoffee();

    }
}
