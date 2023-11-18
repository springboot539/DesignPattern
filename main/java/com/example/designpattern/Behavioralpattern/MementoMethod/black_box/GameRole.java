package com.example.designpattern.Behavioralpattern.MementoMethod.black_box;

import com.example.designpattern.Behavioralpattern.MementoMethod.white_box.RoleStateMemento;

public class GameRole {

    private int vit;//生命力
    private int atk;//攻击力
    private int def;//防御力

    public void initState(){
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }

    public void fight(){
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }

    public Memento saveState(){
        return new RoleStateMemento(50, 50, 50);
    }

    public void displayState(){
        System.out.println("当前的生命力 ： " + vit);
        System.out.println("当前的攻击力 ： " + atk);
        System.out.println("当前的防御力 ： " + def);
    }

    public void recoverState(Memento memento1){
        RoleStateMemento memento = (RoleStateMemento) memento1;
        this.vit = memento.getVit();
        this.atk = memento.getAtk();
        this.def = memento.getDef();
    }

    public GameRole() {

    }

    public GameRole(int vit, int atk, int def) {
        this.vit = vit;
        this.atk = atk;
        this.def = def;
    }

    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    private class RoleStateMemento implements Memento{
        private int vit;//生命力
        private int atk;//攻击力
        private int def;//防御力

        public RoleStateMemento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
        }

        public int getVit() {
            return vit;
        }

        public void setVit(int vit) {
            this.vit = vit;
        }

        public int getAtk() {
            return atk;
        }

        public void setAtk(int atk) {
            this.atk = atk;
        }

        public int getDef() {
            return def;
        }

        public void setDef(int def) {
            this.def = def;
        }

        public RoleStateMemento(int vit) {
            this.vit = vit;
        }
    }
}
