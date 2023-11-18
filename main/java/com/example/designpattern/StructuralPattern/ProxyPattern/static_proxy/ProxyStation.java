package com.example.designpattern.StructuralPattern.ProxyPattern.static_proxy;

public class ProxyStation implements SellTickets{

    //聚合 火车站买票
    private TrainStation trainStation = new TrainStation();

    @Override
    public void sell() {
        System.out.println("代理点收取服务费");
        trainStation.sell();
    }
}
