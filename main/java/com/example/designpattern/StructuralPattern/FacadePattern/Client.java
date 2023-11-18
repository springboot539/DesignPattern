package com.example.designpattern.StructuralPattern.FacadePattern;

public class Client {
    public static void main(String[] args) {

        SmartApplicationFacade smartApplicationFacade = new SmartApplicationFacade();

        smartApplicationFacade.say("早上了 打开");
        System.out.println("------------");
        smartApplicationFacade.say("晚上了 关闭");
    }
}
