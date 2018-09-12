package io.jpelczar.behavioral.interpreter;

public class Main {
    public static void main(String[] args) {
        Expression julie = new TerminalExpression("Julie");
        Expression john = new TerminalExpression("John");

        System.out.println("Is Julie and John? " + new AndExpression(julie, john).interpret("Julie John"));
        System.out.println();
        System.out.println("Is Julie and John? " + new AndExpression(julie, john).interpret("Julie Michael"));
        System.out.println("Is Julie or John? " + new OrExpression(julie, john).interpret("Julie Michael"));
        System.out.println();
        System.out.println("Is Julie and John? " + new AndExpression(julie, john).interpret("Kim Michael"));
        System.out.println("Is Julie or John? " + new OrExpression(julie, john).interpret("Kim Michael"));
    }
}
