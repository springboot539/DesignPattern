package com.example.designpattern.StructuralPattern.DecoratorPattern.demo1;


/**
 * 具体的装饰者角色
 */
public class Egg extends Garnish{


    public Egg(FastFood fastFood) {
        super(fastFood, 1.0f, "鸡蛋");
    }

    public float cost(){
        //当前价格加上其他价格就是总价格
        return getPrice() + getFastFood().cost();
    }

    public String getDesc(){
        //比如 Egg + Bacon...
        return super.getDesc() + getFastFood().getDesc();
    }
}
