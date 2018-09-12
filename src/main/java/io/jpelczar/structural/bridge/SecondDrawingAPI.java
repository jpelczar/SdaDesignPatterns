package io.jpelczar.structural.bridge;

public class SecondDrawingAPI implements DrawingAPI {
    @Override
    public void drawCircle(double x, double y, double radius) {
        System.out.printf("Second API.circle at %f:%f radius %f\n", x, y, radius);
    }
}
