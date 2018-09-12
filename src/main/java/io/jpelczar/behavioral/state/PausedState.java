package io.jpelczar.behavioral.state;

public class PausedState implements PlayerState {
    @Override
    public PlayerState play() {
        return new PlayingState();
    }

    @Override
    public PlayerState pause() {
        return this;
    }

    @Override
    public PlayerState stop() {
        return new StoppedState();
    }
}
