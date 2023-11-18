package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

/**
 * 构建者 - 装配
 */
public class Director {
    private Builder mBuilder;

    public Director(Builder builder){
        this.mBuilder = builder;
    }

    public Bike construct(){
        mBuilder.buildFrame();
        mBuilder.buildSeat();
       return mBuilder.createBike();
    }
}
