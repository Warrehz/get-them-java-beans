package com.learning.inheritance;

public class CargoFlight extends Flight {

    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public void addOnePackage(float h, float w, float d) {
        float size = h * w * d;
        if (hasCargoSpace(size)) {

        }
    }

    private boolean hasCargoSpace(float size) {
        return usedCargoSpace + size <= maxCargoSpace;
    }

    private void handleNoSpace() {
        System.out.println("Not enough space.");
    }

}
