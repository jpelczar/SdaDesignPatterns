package io.jpelczar.behavioral.visitor;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.accept(new PrintVisitor());
    }
}
