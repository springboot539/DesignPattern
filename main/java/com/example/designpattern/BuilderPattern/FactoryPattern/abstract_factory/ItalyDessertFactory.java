package com.example.designpattern.BuilderPattern.FactoryPattern.abstract_factory;

/**
 * 实现DessertFactory并重写方法
 */
public class ItalyDessertFactory implements DessertFactory {
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new Tiramisu();
    }
}
