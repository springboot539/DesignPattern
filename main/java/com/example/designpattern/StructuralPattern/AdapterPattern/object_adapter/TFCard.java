package com.example.designpattern.StructuralPattern.AdapterPattern.object_adapter;

/**
 * Adaptee适配者类接口
 */
public interface TFCard {

    /**
     * 读数据
     * @return
     */
    String readTF();

    /**
     * 写数据
     * @param data
     */
    void writeTF(String data);
}
