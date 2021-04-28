package com.learning.inheritance;

public class Passenger implements Comparable {
    private String name;
    private int memberLevel; // 3 (first priority), 2, 1
    private int memberDays;

    public Passenger() {}

    public Passenger(String name, int memberLevel, int memberDays) {
        this.name = name;
        this.memberLevel = memberLevel;
        this.memberDays = memberDays;
    }

    @Override
    public int compareTo(Object o) {
        Passenger p = (Passenger) o;
        int returnValue = p.memberLevel - memberLevel;
        return returnValue;
    }

}
