package eca.samples.codestructure;

public class Parentheses {

    public static void main(String[] args) {
        var day = "Wednesday";

        String dayLowerCased = day.toLowerCase(); // call the toLowerCase method, which takes no arguments
        if (dayLowerCased.equals("wednesday")) { // call the equals method, which takes 1 argument, another String to compare to

            System.out.println("It is Wednesday my dudes"); // call println, which takes 1 argument to print to the console

        }
    }

    /*
     * This is a method that says it takes an Integer as an argument.
     * We need to define the type of the arguments when defining methods.
     */
    private Integer doubleNumber(Integer toDouble) {
        return toDouble * 2;
    }
}