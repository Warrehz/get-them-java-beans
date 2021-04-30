package com.learning.inheritance;

import java.util.Arrays;

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

        // interfaces example
        Passenger[] passengers = {
                new Passenger("Biscuit", 1, 180),
                new Passenger("Gravy", 1, 90),
                new Passenger("Pancakes", 3, 730),
                new Passenger("Waffles", 2, 150)
        };

        Arrays.sort(passengers); // utilizes comparable interface

        // multiple interfaces example with comparable and iterator
        Flight f175 = new Flight(175);
        f175.add1Passenger(new Passenger("Shalashaska"));
        f175.add1Passenger(new Passenger("Solid Snake"));
        f175.add1Passenger(new Passenger("Big Boss"));
        f175.add1Passenger(new Passenger("Raiden"));
        for (Passenger p : f175) {
            System.out.println(p.getName());
        }


    }
}
