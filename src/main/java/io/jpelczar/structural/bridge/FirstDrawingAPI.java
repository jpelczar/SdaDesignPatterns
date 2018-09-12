package io.jpelczar.structural.bridge;

public class FirstDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("First API.circle at %f:%f radius %f\n", x, y, radius);
    }
}
