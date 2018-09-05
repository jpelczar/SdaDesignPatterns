package io.jpelczar.creational.factory.simple;

public class Main {
    public static void main(String[] args) {
        Butter butter = ButterFactory.create();
        butter.print();
    }
}
