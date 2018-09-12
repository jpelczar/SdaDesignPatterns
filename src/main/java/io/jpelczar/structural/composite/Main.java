package io.jpelczar.structural.composite;

public class Main {
    public static void main(String[] args) {
        Widget button = new Button();
        Widget label = new Label();
        Widget textField = new TextField();

        Window window = new Window();

        window.addWidget(button);
        window.addWidget(label);
        window.addWidget(textField);

        window.printWidgets();
    }
}
