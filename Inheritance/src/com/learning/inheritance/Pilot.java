package com.learning.inheritance;

public abstract class Pilot {

    private Flight currentFlight;

    public void Fly(Flight f) {
        if (canAccept(f)) {
            currentFlight = f;
        } else {
            handleCantAccept();
        }
    }

    // will use abstract keyword to make derived classes of Pilot implement method
    public abstract boolean canAccept(Flight f);

    public void handleCantAccept() {
        System.out.println("Can't accept.");
    }

}
