package io.jpelczar.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Window implements Widget {

    private List<Widget> widgets = new ArrayList<>();

    @Override
    public String getName() {
        return "Window";
    }

    public void addWidget(Widget widget) {
        widgets.add(widget);
    }

    public void printWidgets() {
        System.out.println(getName());
        widgets.forEach(w -> System.out.println("w.getName() = " + w.getName()));
    }
}
