package eca.exercises.TUCO.answers;

public class AnswersTUCO {

    public static void main(String[] args) {
        // Create an Integer variable numberOfSeconds
        var numberOfSeconds = 3661;

        // Convert and print it as hours, minutes, and seconds

        var minutes = numberOfSeconds / 60; // Calculate the number of whole minutes
        var remainingSeconds = numberOfSeconds - (minutes * 60); // Calculate the remaining seconds

        var hours = minutes / 60; // Calculate the number of hours from the number of minutes
        var remainingMinutes = minutes - (hours * 60); // Calculate the number of minutes remaining from the hours

        System.out.println(hours + " hours, " + remainingMinutes + " minutes, and " + remainingSeconds + " seconds");
    }
}
