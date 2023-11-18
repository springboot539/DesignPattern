package com.example.designpattern.StructuralPattern.FlyWeightPattern;

public class Client {
    public static void main(String[] args) {
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");

        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box2.display("蓝色");

        AbstractBox box3 = BoxFactory.getInstance().getShape("L");
        box3.display("自由色");


        AbstractBox box43 = BoxFactory.getInstance().getShape("L");
        box43.display("无所谓色");

        boolean b = box3 == box43;
        System.out.println("享元模式对对象进行共享操作 ：" +b);
    }
}
