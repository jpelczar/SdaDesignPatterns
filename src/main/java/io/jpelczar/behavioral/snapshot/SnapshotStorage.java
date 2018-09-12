package io.jpelczar.behavioral.snapshot;

import java.util.ArrayList;
import java.util.List;

public class SnapshotStorage {
    private List<GameSave> saveList = new ArrayList<>();

    public void add(GameSave gameSave) {
        saveList.add(gameSave);
    }


    public GameSave getLast() {
        if (saveList.isEmpty()) {
            return null;
        }
        return saveList.get(saveList.size() - 1);
    }

    public List<GameSave> getSaveList() {
        return saveList;
    }
}
