package io.jpelczar.behavioral.state;

public class PlayerManager {

    private PlayerState currentState;

    public PlayerManager() {
        this.currentState = new StoppedState();
    }

    public void play() {
        printStateBefore();
        currentState = currentState.play();
        printStateAfter();
    }

    public void pause() {
        printStateBefore();
        currentState = currentState.pause();
        printStateAfter();
    }

    public void stop() {
        printStateBefore();
        currentState = currentState.stop();
        printStateAfter();
    }

    private void printStateBefore() {
        System.out.println("Before: " + currentState.getClass().getSimpleName());
    }

    private void printStateAfter() {
        System.out.println("After: " + currentState.getClass().getSimpleName());
        System.out.println("--------------");
    }
}
