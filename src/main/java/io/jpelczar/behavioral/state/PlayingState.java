package io.jpelczar.behavioral.state;

public class PlayingState implements PlayerState {
    @Override
    public PlayerState play() {
        return this;
    }

    @Override
    public PlayerState pause() {
        return new PausedState();
    }

    @Override
    public PlayerState stop() {
        return new StoppedState();
    }
}
