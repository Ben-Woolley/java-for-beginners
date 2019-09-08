package eca.exercises.NTTA.answers;

public class AnswersNTTA {

    public static void nTimesTable(Integer multiple) {
        // Print the times table of multiple up to 12 x multiple

        // for (an Integer multiplier from 1 to 12)
        for (Integer multiplier = 1; multiplier <= 12; multiplier++) {
            Integer result = multiple * multiplier; // calculate it * the multiple
            System.out.println(multiple + " x " + multiplier + " = " + result); // print the result in a pretty format
        }
    }

    public static void main(String[] args) {
        nTimesTable(5);
    }
}
