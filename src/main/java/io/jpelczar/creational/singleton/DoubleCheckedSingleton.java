package io.jpelczar.creational.singleton;

public class DoubleCheckedSingleton {

    private static DoubleCheckedSingleton instance;

    private DoubleCheckedSingleton() {
    }

    public static DoubleCheckedSingleton getInstance() {
        if (instance == null) {
            synchronized (DoubleCheckedSingleton.class) {
                if (instance == null) {
                    instance = new DoubleCheckedSingleton();
                }
            }
        }
        return instance;
    }

    public void print() {
        System.out.printf("Class: %s\n", DoubleCheckedSingleton.class.getSimpleName());
    }
}
