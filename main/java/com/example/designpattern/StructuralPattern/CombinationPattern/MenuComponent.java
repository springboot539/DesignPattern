package com.example.designpattern.StructuralPattern.CombinationPattern;

/**
 * 菜单组件 抽象根节点
 */
public abstract class MenuComponent {

    protected String name;
    protected int level; //菜单层级

    /**
     * 增加子菜单，如果已经是子菜单，抛异常；如果是是菜单项（还包含子菜单，重写该方法）
     * @param component
     */
    public void add(MenuComponent component){
        throw new UnsupportedOperationException("");
    }

    public void remove(MenuComponent component){
        throw new UnsupportedOperationException("");
    }

    public MenuComponent getChild(int index){
        throw new UnsupportedOperationException("");
    }

    public String getName(){
        return name;
    }

    //打印菜单名称的方法
    public abstract void print();
}
