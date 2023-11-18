package com.example.designpattern.BuilderPattern.PrototypePattern.demo;

public class Realizetype implements Cloneable{

    public Realizetype(){
        System.out.println("原型类创建成功");
    }

    @Override
    protected Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体的复制成功");
        return (Realizetype) super.clone();
    }
}
