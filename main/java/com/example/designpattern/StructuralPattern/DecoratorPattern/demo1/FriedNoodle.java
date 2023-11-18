package com.example.designpattern.StructuralPattern.DecoratorPattern.demo1;

public class FriedNoodle extends FastFood{

    public FriedNoodle(){
        super(20, "炒面条！");
    }

    public float cost() {
        return getPrice();
    }
}
