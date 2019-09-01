package eca.lessons.lesson2.exercises.OOEV.answers;

public class AnswersOOEV {

    public static Boolean isOddOrEven(Integer number) {
        // A number is odd if it has a remainder when divided by 2
        Boolean isOdd = number % 2 == 1;
        return isOdd;
    }
}
