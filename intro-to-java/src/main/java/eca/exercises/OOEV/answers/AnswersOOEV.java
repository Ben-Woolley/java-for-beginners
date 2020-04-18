package eca.exercises.OOEV.answers;

public class AnswersOOEV {

    public static void main(String[] args) {
        // Pick a number
        var number = 10;
        // Determine whether your number is odd or even
        var isEven = number % 2 == 0;

        // Print the result
        if (isEven) {
            System.out.println(number + " is even");
        } else {
            System.out.println(number + " is odd");
        }
    }
}
