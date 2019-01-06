package eca.answers.lesson2;

public class TimeUnitConversion {

    public static void main(String[] args) {
        // 1 day of seconds = 86400
        Integer numberOfSeconds = 86461;

        // Get the total number of minutes
        Integer numberOfMinutes = numberOfSeconds / 60;
        // Get the remainder of the division, which is the seconds left over
        Integer numberOfSecondsRemaining = numberOfSeconds % 60;

        // Get the total number of hours
        Integer numberOfHours = numberOfMinutes / 60;
        // Get the remaining minutes left over after the division
        Integer numberOfMinutesRemaining = numberOfMinutes % 60;

        System.out.println(numberOfHours + " hours, " + numberOfMinutesRemaining + " minutes, " + numberOfSecondsRemaining + " seconds");
    }
}
