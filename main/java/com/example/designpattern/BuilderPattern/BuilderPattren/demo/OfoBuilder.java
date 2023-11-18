package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

public class OfoBuilder extends Builder{
    @Override
    public void buildFrame() {
        mBike.setFrame("Ofo车架");
        System.out.println("构建Ofo单车-- 车架");
    }

    @Override
    public void buildSeat() {
        mBike.setSeat("Ofo车座");
        System.out.println("构建Ofo单车-- 车座");
    }

    @Override
    public Bike createBike() {
        return mBike;
    }
}
