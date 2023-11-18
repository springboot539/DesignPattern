package com.example.designpattern.BuilderPattern.BuilderPattren.demo;

public class Client {
    public static void main(String[] args) {
        Builder builder = new MobikeBuilder();
        Director director = new Director(builder);
        director.construct();
    }
}
