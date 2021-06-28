package com.learning.datesandtimes;

import java.time.*;

public class Main {

    public static void main(String[] args) {

        // represents the start of a nanosecond on a timeline
        Instant instant = Instant.now();
        System.out.println("Instant: " + instant);

        // current date in year-month-day format
        LocalDate localDate = LocalDate.now();
        System.out.println("Local Date: " + localDate);

        // current time in hour:minute:second format
        LocalTime localTime = LocalTime.now();
        System.out.println("Local Time: " + localTime);

        // current date & time in year-month-day:Separator:hour:minute:second format
        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println("Local Date TIme: " + localDateTime);

        // same as Local Date Time with addition of time zone offset
        ZonedDateTime zonedDateTime = ZonedDateTime.now();
        System.out.println("Zoned Date Time: " + zonedDateTime);


    }
}
