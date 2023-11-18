package com.example.designpattern.StructuralPattern.FlyWeightPattern;

/**
 * 抽象享元角色 --模拟俄罗斯方块
 */
public abstract class AbstractBox {

    public abstract String getShape();

    public void display(String color){
        System.out.println("方块形状 " + getShape() + " 颜色 " + color);
    }
}
