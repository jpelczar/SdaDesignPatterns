package io.jpelczar.structural.adapter;

public class Square {
    private int height;

    public Square(int height) {
        this.height = height;
    }

    public int getSquareArea() {
        return height * height;
    }
}
