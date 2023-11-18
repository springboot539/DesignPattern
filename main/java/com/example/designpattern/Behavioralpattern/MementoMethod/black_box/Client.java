package com.example.designpattern.Behavioralpattern.MementoMethod.black_box;

/**
 * 白箱备忘录模式，因为备忘录管理者可以更改备忘录的内容
 */
public class Client {
    public static void main(String[] args) {

        System.out.println("-----------初始化角色");
        GameRole role = new GameRole();
        role.initState();
        role.displayState();
        System.out.println("-----------操作角色并且保存状态");
        role.fight();
        role.displayState();
        RoleStateCaretaker caretaker = new RoleStateCaretaker();
        caretaker.setMemento(role.saveState());
        System.out.println("-----------从状态中恢复角色");
        role.recoverState(caretaker.getMemento());
        role.displayState();

    }
}
