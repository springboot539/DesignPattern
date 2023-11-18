package com.example.designpattern.StructuralPattern.ProxyPattern.static_proxy;

public class Client {
    public static void main(String[] args) {
        SellTickets sellTickets = new ProxyStation();
        sellTickets.sell();
    }
}
