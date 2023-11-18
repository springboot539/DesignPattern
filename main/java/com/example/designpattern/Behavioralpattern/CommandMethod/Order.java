package com.example.designpattern.Behavioralpattern.CommandMethod;

import java.util.HashMap;
import java.util.Map;

public class Order {

    /**
     * 餐桌号码
     */
    private int dateingtable;

    private Map<String, Integer> foodDir = new HashMap<String, Integer>();

    public int getDateingtable() {
        return dateingtable;
    }

    public void setDateingtable(int dateingtable) {
        this.dateingtable = dateingtable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
