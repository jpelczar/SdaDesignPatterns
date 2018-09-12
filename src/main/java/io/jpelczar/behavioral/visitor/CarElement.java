package io.jpelczar.behavioral.visitor;

public interface CarElement {
    void accept(CarElementVisitor visitor);
}
