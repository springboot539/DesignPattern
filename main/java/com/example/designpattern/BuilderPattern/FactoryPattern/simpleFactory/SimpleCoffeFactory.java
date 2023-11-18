package com.example.designpattern.BuilderPattern.FactoryPattern.simpleFactory;

/**
 * 简单工厂模式，用于创建对象
 */
public class SimpleCoffeFactory {

    public Coffee createCoffee(String type) {
        Coffee coffee = null;
        if (type.equals("American")) {
            coffee = new AmericanCoffee();
        } else if (type.equals("Latte")) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("请检查输入的字段值 ：" + type);
        }
        return coffee;
    }
}
