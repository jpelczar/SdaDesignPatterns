package io.jpelczar.creational.factory.method;

public class ButterFactory implements Factory {
    @Override
    public Product createProduct() {
        return new Butter();
    }
}
