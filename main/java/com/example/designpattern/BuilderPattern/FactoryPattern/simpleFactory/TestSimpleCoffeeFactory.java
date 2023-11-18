package com.example.designpattern.BuilderPattern.FactoryPattern.simpleFactory;

public class TestSimpleCoffeeFactory {
    public static void main(String[] args) {
        CoffeeStore store = new CoffeeStore();
        store.orderCoffer("American");
        System.out.println("点完了");
    }
}
