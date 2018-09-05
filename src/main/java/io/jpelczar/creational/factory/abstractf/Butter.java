package io.jpelczar.creational.factory.abstractf;

public class Butter implements Product {
    @Override
    public void print() {
        System.out.printf("Class: %s\n", Butter.class.getSimpleName());
    }
}
