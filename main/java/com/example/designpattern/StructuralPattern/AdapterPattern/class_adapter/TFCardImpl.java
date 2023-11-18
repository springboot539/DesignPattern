package com.example.designpattern.StructuralPattern.AdapterPattern.class_adapter;

public class TFCardImpl implements TFCard{
    public String readTF() {
        return "TFCard read msg : -> hello world TFCard.";
    }

    public void writeTF(String data) {
        System.out.println("TFCard write msg : -> " + data);
    }
}
