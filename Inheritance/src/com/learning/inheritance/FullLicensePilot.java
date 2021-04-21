package com.learning.inheritance;

public class FullLicensePilot extends Pilot {

    @Override
    public boolean canAccept(Flight f) {
        return true;
    }

}
