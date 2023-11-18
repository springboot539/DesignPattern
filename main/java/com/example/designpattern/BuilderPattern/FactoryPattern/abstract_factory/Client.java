package com.example.designpattern.BuilderPattern.FactoryPattern.abstract_factory;

import java.time.LocalTime;

public class Client {
    public static void main(String[] args) {
        ItalyDessertFactory factory = new ItalyDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();

        System.out.println(coffee.getName());
        //输入当前的时间
        System.out.println(LocalTime.now());

    }
}
