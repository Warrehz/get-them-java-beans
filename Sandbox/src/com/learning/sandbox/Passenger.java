package com.learning.sandbox;

public class Passenger {

    // chaining constructors example

    private int freeBags;
    private int checkedBags;
    private double perBagFee;

    public Passenger() {

    }

    public Passenger(int freeBags) {
        // passenger considered elite if allowed more than one free bag
        this(freeBags > 1 ? 25.0d : 50.0);
        this.freeBags = freeBags;
    }

    public Passenger(int freeBags, int checkedBags) {
        this(freeBags);
        this.checkedBags = checkedBags;
    }

    private Passenger(double perBagFee) {
        this.perBagFee = perBagFee;
    }

}
