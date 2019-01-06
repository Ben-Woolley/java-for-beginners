package eca.answers.lesson2;

public class SwapVariableValues {

    public static void main(String[] args) {
        // Initialise greg and bob and print their contents
        String greg = "Greg";
        String bob = "Bob";

        System.out.println(greg);
        System.out.println(bob);

        String temp = greg; // store greg's value in a temporary variable
        greg = bob;         // assign bob's value to greg too
        bob = temp;         // assign greg's original value to bob from temp

        // print to prove we've swapped the variables
        System.out.println(greg);
        System.out.println(bob);

    }
}
