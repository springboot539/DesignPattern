package com.example.designpattern.Behavioralpattern.ExpressinoMethod;

public class Minus extends AbstractMethod{

    private AbstractMethod left;
    private AbstractMethod right;

    public Minus(AbstractMethod left, AbstractMethod right) {
        this.left = left;
        this.right = right;
    }

    /**
     * 解释器子类，实现minus功能
     * @param context
     * @return
     */
    public int interpret(Context context) {
        return left.interpret(context)  - right.interpret(context);
    }

    @Override
    public String toString() {
        return "(" + left +
                " - " + right +
                ")";
    }
}
