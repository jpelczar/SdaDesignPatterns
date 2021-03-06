package io.jpelczar.creational.factory.abstractf;

public class CheeseFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Cheese();
    }
}
