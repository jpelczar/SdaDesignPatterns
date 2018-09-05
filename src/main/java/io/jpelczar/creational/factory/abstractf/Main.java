package io.jpelczar.creational.factory.abstractf;

public class Main {
    public static void main(String[] args) {
        if (args.length > 0 && "butter".equalsIgnoreCase(args[0])) {
            doSomething(new ButterFactory());
            return;
        }
        doSomething(new CheeseFactory());
    }

    private static void doSomething(Factory factory) {
        factory.createProduct().print();
    }
}
