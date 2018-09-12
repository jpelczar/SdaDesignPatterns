package io.jpelczar.structural.adapter;

public class Circle {

    private int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    public double getCircleArea() {
        return 2 * radius * Math.PI;
    }
}
