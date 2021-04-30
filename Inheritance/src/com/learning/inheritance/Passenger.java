package com.learning.inheritance;

public class Passenger implements Comparable<Passenger> {
    private String name;
    private int memberLevel; // 3 (first priority), 2, 1
    private int memberDays;

    public Passenger() {}

    public Passenger(String name) {
        this.name = name;
    }

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }

    public String getName() {
        return name;
    }

    @Override
    public int compareTo(Passenger p) {
        int returnValue = p.memberLevel - memberLevel;
        return returnValue;
    }

}