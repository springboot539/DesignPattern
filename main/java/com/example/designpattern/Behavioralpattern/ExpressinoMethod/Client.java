package com.example.designpattern.Behavioralpattern.ExpressinoMethod;

public class Client {
    public static void main(String[] args) {
        Variable a = new Variable("a");
        Variable b = new Variable("b");
        Variable c = new Variable("c");
        Variable d = new Variable("d");

        Context context = new Context();
        context.accept(a, 1);
        context.accept(b, 2);
        context.accept(c, 3);
        context.accept(d, 4);

//        a - b + c - d
        AbstractMethod ans = new Minus(a, new Plus(new Minus(b, c), d));
        int result = ans.interpret(context);
        System.out.println(ans + " : " + result);
    }
}
