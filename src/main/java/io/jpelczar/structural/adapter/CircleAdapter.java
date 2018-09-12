package io.jpelczar.structural.adapter;

public class CircleAdapter implements Shape {

    private Circle circle;

    public CircleAdapter(int radius) {
        this.circle = new Circle(radius);
    }

    @Override
    public float getArea() {
        return (float) circle.getCircleArea();
    }
}
