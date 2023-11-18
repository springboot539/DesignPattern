package com.example.designpattern.Behavioralpattern.MediatorMethod;

/**
 * 中介者实现类 聚合同事类
 */
public class MediatorStructure extends Mediator{
    private Tenant tenant;
    private HouseOwner houseOwner;

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public void constract(String msg, Person person) {
        if(person == tenant){
            houseOwner.getMessage(msg);
        } else if(person == houseOwner){
            tenant.getMessage(msg);
        } else {
            System.out.println("错误 person" + person);
        }
    }
}
