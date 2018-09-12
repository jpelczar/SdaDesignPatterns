package io.jpelczar.behavioral.observer;

public class Button {

    private ActionListener actionListener;

    public void click() {
        if (actionListener == null) {
            return;
        }
        actionListener.onAction("Click!");
    }

    public void longClick() {
        if (actionListener == null) {
            return;
        }
        actionListener.onAction("Long Click!");
    }

    public void setActionListener(ActionListener actionListener) {
        this.actionListener = actionListener;
    }

    public void removeListener() {
        actionListener = null;
    }
}
