package io.jpelczar.behavioral.template;

public abstract class AbstractDraw {

    abstract int getWidth();

    abstract int getHeight();


    public void draw() {
        for (int i = 0; i < getHeight(); i++) {
            for (int j = 0; j < getWidth(); j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
