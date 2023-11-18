package com.example.designpattern.StructuralPattern.ProxyPattern.cglib_proxy;

public class TrainStation2 implements CellTickets{
    public void sell() {
        System.out.println("cglib 接口 动态代理测试 卖票----");
    }
}
