package io.jpelczar.creational.builder;

public class Main {
    public static void main(String[] args) {
        Butter butter = new Butter.Builder()
                .withManufacturer("Mlekovita")
                .withFat(72)
                .withWeight(250)
                .withBio()
                .build();

        System.out.println(butter.toString());

        butter = new Butter.Builder()
                .withManufacturer("Mlekpol")
                .withWeight(300)
                .build();

        System.out.println(butter.toString());
    }
}
