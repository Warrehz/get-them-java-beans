package com.learning.inheritance;

import java.util.ArrayList;
import java.util.Iterator;

public class Flight implements Comparable<Flight>, Iterable<Passenger> {

    private int passengers = 0;
    private int flightNumber;
    private ArrayList<Passenger> passengerList = new ArrayList<>();

    public Flight() {}

    public Flight(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void add1Passenger(Passenger passenger) {
        passengerList.add(passenger);
        passengers++;
    }

    public int getPassengers() {
        return passengers;
    }

    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public int compareTo(Flight flight) {
        return flight.flightNumber - flightNumber;
    }

    public Iterator<Passenger> iterator() {
        return passengerList.iterator();
    }

}
