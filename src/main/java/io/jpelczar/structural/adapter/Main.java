package io.jpelczar.structural.adapter;

public class Main {
    public static void main(String[] args) {
        System.out.println("Circle area: " + calculateArea(new CircleAdapter(3)));
        System.out.println("Square area: " + calculateArea(new SquareAdapter(12)));
        System.out.println("Rectangle area: " + calculateArea(new RectangleAdapter(2, 5)));
    }

    public static float calculateArea(Shape shape) {
        return shape.getArea();
    }
}
