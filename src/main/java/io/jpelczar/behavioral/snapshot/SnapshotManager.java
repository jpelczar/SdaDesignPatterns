package io.jpelczar.behavioral.snapshot;

import java.time.LocalDateTime;

public class SnapshotManager {

    private Game currentGame;

    public GameSave createGameSave() {
        try {
            return new GameSave(LocalDateTime.now(), currentGame.clone());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void restoreGameSave(GameSave gameSave) {
        try {
            currentGame = gameSave.getGame().clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }

    public Game getCurrentGame() {
        try {
            return currentGame.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    //Metoda do zamokowania procesu zmiany w grze
    public void setCurrentGame(Game currentGame) {
        try {
            this.currentGame = currentGame.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
