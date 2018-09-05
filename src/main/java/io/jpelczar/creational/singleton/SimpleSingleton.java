package io.jpelczar.creational.singleton;

public class SimpleSingleton {

    private static SimpleSingleton instance;

    private SimpleSingleton() {
    }

    public static SimpleSingleton getInstance() {
        if (instance == null) {
            instance = new SimpleSingleton();
        }
        return instance;
    }

    public void print() {
        System.out.printf("Class: %s\n", SimpleSingleton.class.getSimpleName());
    }
}
