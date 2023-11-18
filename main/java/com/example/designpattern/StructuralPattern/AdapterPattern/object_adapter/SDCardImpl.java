package com.example.designpattern.StructuralPattern.AdapterPattern.object_adapter;

public class SDCardImpl implements SDCard {
    public String readSD() {
        return "SDCard read SD msg-> hello world SDCard" ;
    }

    public void writeSD(String msg) {
        System.out.println("SCCard write SD msg -> " + msg );
    }
}
