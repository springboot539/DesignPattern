package com.example.designpattern.StructuralPattern.FlyWeightPattern;

import java.util.HashMap;

/**
 * 享元工厂（单例模式），负责创建和管理，
 */
public class BoxFactory {

    private HashMap<String, AbstractBox> boxMap;

    private BoxFactory() {
        boxMap = new HashMap<String, AbstractBox>();
        boxMap.put("I", new IBox());
        boxMap.put("O", new OBox());
        boxMap.put("L", new LBox());
    }

    public static BoxFactory getInstance(){
        return factory;
    }
    //饿汉式
    private static  BoxFactory factory = new BoxFactory();

    /**
     * 根据名称获取图形对象
     *
     * @param name
     * @return
     */
    public AbstractBox getShape(String name) {
        return boxMap.get(name);
    }
}
