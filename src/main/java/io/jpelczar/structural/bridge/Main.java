package io.jpelczar.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[]{
                //CircleShape use only abstraction in definition - in that case it is separated form concrete implementations of DrawingAPI
                new CircleShape(1, 2, 3, new FirstDrawingAPI()),
                new CircleShape(5, 7, 11, new SecondDrawingAPI())
        };

        for (Shape shape : shapes) {
            shape.resizeByPercentage(2.5);
            shape.draw();
        }
    }
}
