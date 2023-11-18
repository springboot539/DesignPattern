package com.example.designpattern.StructuralPattern.ProxyPattern.jdk_proxy;

public class Client {
    public static void main(String[] args) {
//        创建代理对象工厂
       ProxyFactory factory = new ProxyFactory();
//       使用factory对象方法获取代理对象
        SellTickets sellTickets = factory.getProxyInstance();
        sellTickets.sell();

    }
}
