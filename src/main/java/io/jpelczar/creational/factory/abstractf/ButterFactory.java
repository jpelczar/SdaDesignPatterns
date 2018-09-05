package io.jpelczar.creational.factory.abstractf;

public class ButterFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Butter();
    }
}
