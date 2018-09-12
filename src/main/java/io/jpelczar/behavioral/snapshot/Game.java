package io.jpelczar.behavioral.snapshot;

import java.util.List;

public class Game implements Cloneable {
    private List<String> equipment;
    private Integer level;

    public Game(List<String> equipment, Integer level) {
        this.equipment = equipment;
        this.level = level;
    }


    @Override
    protected Game clone() throws CloneNotSupportedException {
        return (Game) super.clone();
    }

    @Override
    public String toString() {
        return "Game{" +
                "equipment=" + equipment +
                ", level=" + level +
                '}';
    }

    public List<String> getEquipment() {
        return equipment;
    }

    public void setEquipment(List<String> equipment) {
        this.equipment = equipment;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }
}
