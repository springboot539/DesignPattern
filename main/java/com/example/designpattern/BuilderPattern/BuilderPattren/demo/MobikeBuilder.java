package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

public class MobikeBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("摩拜车架");
        System.out.println("构建摩拜单车-- 车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("摩拜车座");
        System.out.println("构建摩拜单车-- 车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
