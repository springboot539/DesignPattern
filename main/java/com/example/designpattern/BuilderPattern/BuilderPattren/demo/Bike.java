package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

/**
 * 建造者模式 - 产品
 */
public class Bike {
    String frame; //车架
    String seat; //车座

    public void setFrame(String frame) {
        this.frame = frame;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public String getFrame() {
        return frame;
    }

    public String getSeat() {
        return seat;
    }

    @Override
    public String toString() {
        return "Bike{" +
                "frame='" + frame + '\'' +
                ", seat='" + seat + '\'' +
                '}';
    }
}
