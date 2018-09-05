package io.jpelczar.creational.builder;

public class Butter {
    private String manufacturer;
    private int fatPercent;
    private int weight;
    private boolean isBio;

    private Butter(String manufacturer, int fatPercent, int weight, boolean isBio) {
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
    public String toString() {
        return "Butter{" +
                "manufacturer='" + manufacturer + '\'' +
                ", fatPercent=" + fatPercent +
                ", weight=" + weight +
                ", isBio=" + isBio +
                '}';
    }

    public static class Builder {
        private String manufacturer;
        private int fatPercent;
        private int weight;
        private boolean isBio = false;

        public Builder withManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Builder withFat(int fatPercent) {
            this.fatPercent = fatPercent;
            return this;
        }

        public Builder withWeight(int weight) {
            this.weight = weight;
            return this;
        }

        public Builder withBio() {
            this.isBio = true;
            return this;
        }

        public Butter build() {
            return new Butter(manufacturer, fatPercent, weight, isBio);
        }
    }
}
