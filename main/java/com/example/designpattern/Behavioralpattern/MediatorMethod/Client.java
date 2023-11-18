package com.example.designpattern.Behavioralpattern.MediatorMethod;

public class Client {
    public static void main(String[] args) {

        //中介者
        MediatorStructure mediator = new MediatorStructure();

        HouseOwner houseOwner = new HouseOwner("房东A", mediator);
        Tenant tenant = new Tenant("租户B", mediator);

        mediator.setHouseOwner(houseOwner);
        mediator.setTenant(tenant);
        tenant.constact("请问有合租的房间嘛？");
        houseOwner.constract("一个月1万住的起码你小子");


    }
}
