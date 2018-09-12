package io.jpelczar.behavioral.nullobject;

public class Main {
    public static void main(String[] args) {
        System.out.println(PizzaFactory.getPizza("Capriciosa").toString());
        System.out.println(PizzaFactory.getPizza("AAAA").toString()); //BRAK NullPointerException przy wywołaniu toString()
    }
}
