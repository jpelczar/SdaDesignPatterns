package io.jpelczar.creational.prototype;

public class Main {
    public static void main(String[] args) {
        Butter butterMlekovita = new Butter("Mlekovita", 72, 250, true);
        Butter butterMlekpol = butterMlekovita.clone();
        if (butterMlekpol != null) {
            butterMlekpol.setManufacturer("Mlekpol");
        }

        System.out.printf("Butter 1: %s\nButter 2: %s", butterMlekovita, butterMlekpol);
    }
}
