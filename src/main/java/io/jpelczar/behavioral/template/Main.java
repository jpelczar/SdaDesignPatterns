package io.jpelczar.behavioral.template;

public class Main {

    public static void main(String[] args) {
        AbstractDraw draw = new RectangleDraw();

        draw.draw();

        draw = new SquareDraw();

        System.out.println();
        draw.draw();
    }
}
