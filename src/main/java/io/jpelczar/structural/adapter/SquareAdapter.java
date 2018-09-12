package io.jpelczar.structural.adapter;

public class SquareAdapter implements Shape {

    private Square square;

    public SquareAdapter(int height) {
        this.square = new Square(height);
    }

    @Override
    public float getArea() {
        return square.getSquareArea();
    }
}
