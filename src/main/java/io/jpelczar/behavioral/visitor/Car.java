package io.jpelczar.behavioral.visitor;

public class Car implements CarElement {
    private CarElement[] elements;

    public Car() {
        this.elements = new CarElement[]{
                new Body(), new Engine()
        };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for (CarElement element : elements) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
