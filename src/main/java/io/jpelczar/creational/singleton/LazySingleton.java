package io.jpelczar.creational.singleton;

public class LazySingleton {

    private LazySingleton() {}

    private static class LazyHolder {
        static final LazySingleton INSTANCE = new LazySingleton();
    }

    public static LazySingleton getInstance(){
        return LazyHolder.INSTANCE;
    }

    public void print() {
        System.out.printf("Class: %s\n", LazySingleton.class.getSimpleName());
    }
}
