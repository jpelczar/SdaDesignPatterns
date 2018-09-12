package io.jpelczar.behavioral.snapshot;

import java.time.LocalDateTime;

public class GameSave implements Cloneable {

    private LocalDateTime date;
    private Game game;

    public GameSave(LocalDateTime date, Game game) {
        this.date = date;
        this.game = game;
    }

    @Override
    protected GameSave clone() throws CloneNotSupportedException {
        return (GameSave) super.clone();
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Game getGame() {
        return game;
    }

    public void setGame(Game game) {
        this.game = game;
    }
}
