package com.example.designpattern.StructuralPattern.CombinationPattern;

/**
 * 属于 叶子节点
 */
public class MenuItem extends MenuComponent{

    public MenuItem(String name, int level){
        this.name = name;
        this.level = level;
    }

    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        System.out.println(this.name);
    }
}
