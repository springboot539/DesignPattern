package com.example.designpattern.StructuralPattern.DecoratorPattern.demo1;

public class client {
    public static void main(String[] args) {
        FastFood friedNoodle = new FriedNoodle();
        System.out.println(friedNoodle.getDesc() + "cost :" + friedNoodle.cost() + "元");
        System.out.println("------");
        //炒面加鸡蛋
        friedNoodle = new Egg(friedNoodle);
        System.out.println(friedNoodle.getDesc() + "cost :" + friedNoodle.cost() + "元");

        //炒面加鸡蛋
        friedNoodle = new Egg(friedNoodle);
        System.out.println(friedNoodle.getDesc() + "cost :" + friedNoodle.cost() + "元");

        friedNoodle = new Bacon(friedNoodle);
        System.out.println(friedNoodle.getDesc() + "cost :" + friedNoodle.cost() + "元");
    }
}
