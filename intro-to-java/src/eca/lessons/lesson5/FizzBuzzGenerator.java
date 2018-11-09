package eca.lessons.lesson5;

public class FizzBuzzGenerator {

    public String getStringForNumber(Integer number) {

        Boolean divisibleByThree = number % 3 == 0;
        Boolean divisibleByFive = number % 5 == 0;

        String fizzBuzzedNumber = "";

        if (!divisibleByThree && !divisibleByFive) {
            fizzBuzzedNumber = number.toString();
        } else {
            if (divisibleByThree) {
                fizzBuzzedNumber = fizzBuzzedNumber + "Fizz";
            }

            if (divisibleByFive) {
                fizzBuzzedNumber = fizzBuzzedNumber + "Buzz";
            }
        }

        return fizzBuzzedNumber;
    }
}
