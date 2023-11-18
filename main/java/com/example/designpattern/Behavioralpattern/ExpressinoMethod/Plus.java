package com.example.designpattern.Behavioralpattern.ExpressinoMethod;

public class Plus extends AbstractMethod{

    private AbstractMethod left;
    private AbstractMethod right;

    public Plus(AbstractMethod left, AbstractMethod right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 解释器子类，实现plus功能
     * @param context
     * @return
     */
    public int interpret(Context context) {
        return left.interpret(context)  + right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left.toString() +
                " + " + right.toString() +
                ")";
    }
}
