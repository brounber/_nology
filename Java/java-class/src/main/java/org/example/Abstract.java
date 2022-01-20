package org.example;

public abstract class Abstract {
    int waterPerTsp = 150;

    public void setWaterPerTsp(int newWaterPerTsp) {
        this.waterPerTsp = newWaterPerTsp;
    }

    public abstract double getVolume();

    public double teaspoons() {
        return this.getVolume()/ waterPerTsp;
    }
}
