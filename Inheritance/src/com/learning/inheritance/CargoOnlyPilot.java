package com.learning.inheritance;

public class CargoOnlyPilot extends Pilot {

    int passengers;

    @Override
    public boolean canAccept(Flight f) {
        return f.getPassengers == 0;
    }

    public int getPassengers() {
        return passengers;
    }

}
