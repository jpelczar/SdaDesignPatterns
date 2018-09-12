package io.jpelczar.behavioral.state;

public class StoppedState implements PlayerState {
    @Override
    public PlayerState play() {
        return new PlayingState();
    }

    @Override
    public PlayerState pause() {
        throw new IllegalStateException("Playback in stop state can't be paused");
    }

    @Override
    public PlayerState stop() {
        return this;
    }
}
