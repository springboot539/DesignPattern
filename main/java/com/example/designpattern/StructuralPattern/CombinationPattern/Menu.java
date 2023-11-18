package com.example.designpattern.StructuralPattern.CombinationPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 树枝节点角色
 */
public class Menu extends MenuComponent{

    //菜单可以有多个子菜单或者菜单项
    private List<MenuComponent> menuComponentList = new ArrayList<MenuComponent>();

    //构造方法，指定名称级别
    public Menu(String name, int level){
        this.name = name;
        this.level = level;
    }

    @Override
    public void add(MenuComponent component) {
        menuComponentList.add(component);
    }

    @Override
    public void remove(MenuComponent component) {
        menuComponentList.remove(component);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }

    public void print() {
        for (int i = 0; i < level; i++) {
            System.out.print("-");
        }
        //先打印菜单名称 再打印子菜单或者子菜单项
        System.out.println(name);
        for (MenuComponent c : menuComponentList) {
           c.print();
        }
    }
}
