package com.example.designpattern.StructuralPattern.AdapterPattern.object_adapter;

/**
 * 目标接口Target
 */
public interface SDCard {

    String readSD();

    void writeSD(String msg);
}
