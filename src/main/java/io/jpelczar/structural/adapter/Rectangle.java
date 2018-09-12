package io.jpelczar.structural.adapter;

public class Rectangle {

    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getRectangleArea() {
        return height * width;
    }
}
