package com.learning.inheritance;

public class Main {

    public static void main(String[] args) {

        CargoFlight cf = new CargoFlight();
        cf.addOnePackage(1.0f, 2.5f, 3.0f );

        // cargo flight with specified flight number
        CargoFlight cf294 = new CargoFlight(294);

        // cargo flight with specified flight number and cargo space
        CargoFlight cf85 = new CargoFlight(85, 2000.0f);

        // cargo flight with no specified arguments
        CargoFlight cf01 = new CargoFlight();



    }
}
