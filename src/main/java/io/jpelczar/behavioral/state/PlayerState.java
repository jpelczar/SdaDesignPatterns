package io.jpelczar.behavioral.state;

public interface PlayerState {

    PlayerState play();

    PlayerState pause();

    PlayerState stop();
}
