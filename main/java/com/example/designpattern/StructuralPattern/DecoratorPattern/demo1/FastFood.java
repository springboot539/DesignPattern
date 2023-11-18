package com.example.designpattern.StructuralPattern.DecoratorPattern.demo1;

/**
 * 抽象构建角色
 */
public abstract class FastFood {

    private float price;
    private String desc;

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public FastFood(){

    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public String getDesc() {
        return desc;
    }

    public abstract float cost();
}
