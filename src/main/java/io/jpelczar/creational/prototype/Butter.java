package io.jpelczar.creational.prototype;

public class Butter implements Cloneable {
    private String manufacturer;
    private int fatPercent;
    private int weight;
    private boolean isBio;

    public Butter(String manufacturer, int fatPercent, int weight, boolean isBio) {
        this.manufacturer = manufacturer;
        this.fatPercent = fatPercent;
        this.weight = weight;
        this.isBio = isBio;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public int getFatPercent() {
        return fatPercent;
    }

    public void setFatPercent(int fatPercent) {
        this.fatPercent = fatPercent;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isBio() {
        return isBio;
    }

    public void setBio(boolean bio) {
        isBio = bio;
    }

    @Override
    protected Butter clone() {
        try {
            return (Butter) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public String toString() {
        return "Butter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fatPercent=" + fatPercent +
                ", weight=" + weight +
                ", isBio=" + isBio +
                '}';

    }
}
