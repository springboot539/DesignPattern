package com.example.designpattern.StructuralPattern.FacadePattern;


/**
 * 智能音箱
 */
public class SmartApplicationFacade {

    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicationFacade(){
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    public void say(String msg){
        if (msg.contains("打开")) {
            on();
        } else if(msg.contains("关闭")){
            close();
        } else {
            System.out.println("目前还不支持，请稍后再试！");
        }
    }

    private void on(){
        light.on();
        tv.on();
        airCondition.on();
    }

    private void close(){
        light.close();
        tv.close();
        airCondition.close();
    }
}
