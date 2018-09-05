package io.jpelczar.creational.factory.method;

public class Main {
    public static void main(String[] args) {
        Factory factory = new ButterFactory();
        Product product = factory.createProduct();
        product.print();
    }
}
