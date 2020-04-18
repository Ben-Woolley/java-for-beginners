package eca.exercises.PDTI.answers;

import java.time.LocalDate;
import java.time.LocalTime;

public class AnswesrPDTI {

    public static void main(String[] args) {
        // Using LocalDate.now() and LocalTime.now(), print some useful information about right now

        var today = LocalDate.now();
        var now = LocalTime.now();

        // This is an open-ended activity to discover what Java's standard libraries have to offer

        System.out.println("Day of week: " + today.getDayOfWeek());
        System.out.println("Day of month: " + today.getDayOfMonth());
        System.out.println("Day of year: " + today.getDayOfYear());

        System.out.println("Current time: " + now.toString());

        System.out.println(today.getMonth());
        System.out.println("Is leap year: " + today.isLeapYear());
    }
}
