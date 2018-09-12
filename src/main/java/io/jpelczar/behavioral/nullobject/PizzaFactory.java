package io.jpelczar.behavioral.nullobject;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class PizzaFactory {

    private static final Map<String, Pizza> pizzas = new HashMap<>();

    static {
        pizzas.put("Capriciosa", new Pizza(Collections.singletonList("Ham"), 15, "Capriciosa"));
        pizzas.put("Margeritha", new Pizza(Collections.singletonList("Cheese"), 13, "Margeritha"));
    }


    public static Pizza getPizza(String name) {
        if (pizzas.containsKey(name)) {
            return pizzas.get(name);
        }

        return new NullPizza();
    }
}
