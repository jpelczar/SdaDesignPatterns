package io.jpelczar.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Button button = new Button();

        button.setActionListener(operation -> System.out.printf("Action operation: %s\n", operation));
        button.click();
        button.longClick();
        button.click();

        button.removeListener();
        button.click();
        button.longClick();
    }
}
