package io.jpelczar.structural.facade;

public class Main {
    public static void main(String[] args) {
        BankAccount bankAccount = new BankAccount();
        System.out.println("Can John take 1000000: " + bankAccount.take(1000000, "John"));
        System.out.println("Can Tom take 100: " + bankAccount.take(100, "Tom"));
        System.out.println("Can John take 100: " + bankAccount.take(100, "John"));
    }
}
