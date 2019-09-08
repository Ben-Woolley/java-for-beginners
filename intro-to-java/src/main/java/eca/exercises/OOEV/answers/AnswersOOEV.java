package eca.exercises.OOEV.answers;

public class AnswersOOEV {

    public static Boolean isOdd(Integer number) {
        // A number is odd if it has a remainder when divided by 2
        Boolean isOdd = number % 2 == 1;
        return isOdd;
    }


    public static void main(String[] args) {
        System.out.println(isOdd(4));
    }
}
