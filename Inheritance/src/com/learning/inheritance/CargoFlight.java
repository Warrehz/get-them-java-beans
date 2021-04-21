package com.learning.inheritance;

public class CargoFlight extends Flight {

    float maxCargoSpace = 1000.0f;
    float usedCargoSpace;

    public CargoFlight() {}

    public CargoFlight(float maxCargoSpace) {
        this.maxCargoSpace = maxCargoSpace;
    }

    // super allows us to call the constructor of base class
    // calls to super must be first line in constructor
    public CargoFlight(int flightNumber) {
        super(flightNumber);
    }

    // this class already has a constructor that accepts a flightNumber
    // use the this keyword to call its constructor rather than super for base class constructor
    public CargoFlight(int flightNumber, float maxCargoSpace) {
        this(flightNumber);
        this.maxCargoSpace = maxCargoSpace;
    }

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
