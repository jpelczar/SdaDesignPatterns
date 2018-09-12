package io.jpelczar.structural.adapter;

public class RectangleAdapter implements Shape {

    private Rectangle rectangle;

    public RectangleAdapter(int height, int width) {
        this.rectangle = new Rectangle(height, width);
    }

    @Override
    public float getArea() {
        return rectangle.getRectangleArea();
    }
}
