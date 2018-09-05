package io.jpelczar.creational.factory.abstractf;

public class Cheese implements Product {
    @Override
    public void print() {
        System.out.printf("Class: %s\n", Cheese.class.getSimpleName());
    }
}
