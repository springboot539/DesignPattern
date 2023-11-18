package com.example.designpattern.StructuralPattern.CombinationPattern;

public class client {

    public static void main(String[] args) {

        //创建菜单树
        MenuComponent menu1 = new Menu("菜单管理", 2);
        menu1.add(new MenuItem("页面展开", 3));
        menu1.add(new MenuItem("展开菜单", 3));
        menu1.add(new MenuItem("编辑菜单", 3));
        menu1.add(new MenuItem("删除菜单", 3));
        menu1.add(new MenuItem("新增菜单", 3));

        MenuComponent menu12 = new Menu("权限配置", 2);
        menu12.add(new MenuItem("页面访问", 3));
        menu12.add(new MenuItem("提交保存", 3));

        MenuComponent menu13 = new Menu("角色管理", 2);
        menu13.add(new MenuItem("页面访问", 3));
        menu13.add(new MenuItem("新增角色", 3));
        menu13.add(new MenuItem("修改角色", 3));

        //一级菜单
        MenuComponent menuRoot = new Menu("系统管理", 1);
        menuRoot.add(menu1);
        menuRoot.add(menu12);
        menuRoot.add(menu13);

        System.out.println("----");
        menuRoot.print();
    }
}
