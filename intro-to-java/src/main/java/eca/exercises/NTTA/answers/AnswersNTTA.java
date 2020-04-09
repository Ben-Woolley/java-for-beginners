package eca.exercises.NTTA.answers;

public class AnswersNTTA {

    public static void main(String[] args) {
        // Print the times table of multiple up to 12 x multiple
        Integer multiple = 5;

        // for (an Integer multiplier from 1 to 12)
        for (Integer multiplier = 1; multiplier <= 12; multiplier++) {
            Integer result = multiple * multiplier; // calculate it * the multiple
            System.out.println(multiple + " x " + multiplier + " = " + result); // print the result in a pretty format
        }
    }
}
