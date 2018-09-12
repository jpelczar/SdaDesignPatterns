package io.jpelczar.behavioral.nullobject;

import java.util.ArrayList;
import java.util.List;

public class Pizza {
    private List<String> ingredients = new ArrayList<>();
    private float price;
    private String name;

    public Pizza() {
    }

    public Pizza(List<String> ingredients, float price, String name) {
        this.ingredients = ingredients;
        this.price = price;
        this.name = name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public void setIngredients(List<String> ingredients) {
        this.ingredients = ingredients;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "ingredients=" + ingredients +
                ", price=" + price +
                ", name='" + name + '\'' +
                '}';
    }
}
