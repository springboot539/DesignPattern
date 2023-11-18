package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

/**
 * 注意如果两个子类都有用到某个成员变量，可以声明在父类中，实现更好的复用效果
 * 注意：变量的初始化放到父类中，子类中直接使用就可以了
 */
public abstract class Builder {
    protected Bike mBike = new Bike();

    public abstract void buildFrame();
    public abstract void buildSeat();
    public abstract Bike createBike();
}
