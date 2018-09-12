package io.jpelczar.behavioral.snapshot;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(Arrays.asList("Sword", "Meat"), 4);

        SnapshotManager snapshotManager = new SnapshotManager();
        SnapshotStorage snapshotStorage = new SnapshotStorage();

        snapshotManager.setCurrentGame(game);
        snapshotStorage.add(snapshotManager.createGameSave());

        game.setEquipment(Arrays.asList("Sword", "Meat", "Azbest", "Armor"));
        game.setLevel(25);

        snapshotManager.setCurrentGame(game);
        snapshotStorage.add(snapshotManager.createGameSave());

        game.setEquipment(Arrays.asList("Sword", "Meat", "Azbest", "Armor", "Axe"));
        game.setLevel(27);

        System.out.println("Current game: " + game);
        System.out.println("Restore previous...");

        snapshotManager.restoreGameSave(snapshotStorage.getLast());

        game = snapshotManager.getCurrentGame();

        System.out.println("Current game: " + game);
    }
}
