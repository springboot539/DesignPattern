package com.example.designpattern.StructuralPattern.DecoratorPattern.demo1;

/**
 * 装饰者 garnish 不但继承fastfood 还聚合fastfood, 也定义为抽象类
 * 属于抽象装饰者角色
 */
public abstract class Garnish extends FastFood{

    private FastFood fastFood;

    public Garnish(FastFood fastFood, float price, String desc){
        super(price, desc);
        this.fastFood = fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    public FastFood getFastFood() {
        return fastFood;
    }

}
