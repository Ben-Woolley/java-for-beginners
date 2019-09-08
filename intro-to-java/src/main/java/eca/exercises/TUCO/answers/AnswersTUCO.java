package eca.exercises.TUCO.answers;

public class AnswersTUCO {

    public static void main(String[] args) {
        // Create an Integer variable numberOfSeconds
        Integer numberOfSeconds = 3661;

        // Convert and print it as hours, minutes, and seconds

        Integer minutes = numberOfSeconds / 60; // Calculate the number of whole minutes
        Integer remainingSeconds = numberOfSeconds - (minutes * 60); // Calculate the remaining seconds

        Integer hours = minutes / 60; // Calculate the number of hours from the number of minutes
        Integer remainingMinutes = minutes - (hours * 60); // Calculate the number of minutes remaining from the hours

        System.out.println(hours + " hours, " + remainingMinutes + " minutes, and " + remainingSeconds + " seconds");
    }
}
