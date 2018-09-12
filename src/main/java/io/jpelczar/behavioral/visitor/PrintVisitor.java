package io.jpelczar.behavioral.visitor;

public class PrintVisitor implements CarElementVisitor {
    @Override
    public void visit(final Body body) {
        System.out.println("Visiting body");
    }

    @Override
    public void visit(final Car car) {
        System.out.println("Visiting car");
    }

    @Override
    public void visit(final Engine engine) {
        System.out.println("Visiting engine");
    }
}
