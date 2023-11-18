package com.example.designpattern.StructuralPattern.ProxyPattern.cglib_proxy;

public class client {
    public static void main(String[] args) {
        // 创建目标对象
        ProxyFactory factory = new ProxyFactory();
        ProxyFactory2 factory2 = new ProxyFactory2();
        // 创建代理对象
        TrainStation station = factory.getStation();
        TrainStation2 station2 = factory2.getStation();
        // 调用代理对象的foo方法
//        station.sell()
        station2.sell();
    }
}
