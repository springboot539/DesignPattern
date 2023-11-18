package com.example.designpattern.BuilderPattern.PrototypePattern.demo;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {
        Realizetype realizetype = new Realizetype();
        //调用clone（） 进行对象的克隆
        Realizetype clone = realizetype.clone();
        System.out.println( clone == realizetype); //原型对象和克隆出来的结果是false

    }
}
