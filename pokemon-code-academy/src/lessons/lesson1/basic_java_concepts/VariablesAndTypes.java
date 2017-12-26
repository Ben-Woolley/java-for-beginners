package lessons.lesson1.basic_java_concepts;

import java.util.Arrays;

public class VariablesAndTypes {

    /**
     * Variables are 'boxes' we use to store values in for later.
     * Variables in Java must have types - these tell us what sort
     *  of object is in our variable.
     *
     */
    public static void main(String[] args) {
        /*
          Integers

          We are going to use Integer for whole numbers
          (int works too, but it is a special type for older programs.
            types with lower case names are called primitive types)
         */
        Integer temperatureToday = 18;
        Integer myBankBalance = -65;

        // You can append anything to a string by using +
        // This is known as concatenation, and you can do it as much as you want
        System.out.println("My bank balance is " + myBankBalance);

        /*
          You can use the regular arithmetic operators on numbers
          e.g. 3 plus 5 multiplied by 10 divided by 3 to the power 2 modulus 10
          Regular order of precedence applies
          */
        System.out.print("10 + 5 * 10 / 3 ^ 2 % 10 = ");
        System.out.println(10 + 5 * 10 / 3 ^ 2 % 10);

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
          Strings

          Underneath are a sequence of characters e.g.
           ['H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!']
           (char is another primitive type for Character
         */
        char[] helloWorldArray = new char[]
                { 'H', 'e', 'l', 'l', 'o', ' ', 'W', 'o', 'r', 'l', 'd', '!' };
        String helloWorldFromArray = new String(helloWorldArray);
        String helloWorld = "Hello, World! (again)";

        System.out.println(helloWorldArray + " as array, this is the array's memory address, we have \n  to use Arrays.toString(helloWorldArray) to see its contents");

        System.out.println(Arrays.toString(helloWorldArray) + " from array");

        System.out.print(helloWorldArray);
        System.out.println(" from array in its own print method, java knows to convert it for us");

        System.out.println(helloWorldFromArray + " from converted array");

        System.out.println(helloWorld + " from String");


        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
          Booleans

          A true/false value, we are going to use Boolean,
            but the primitive boolean also exists.
         */
        boolean havePokeballs = true;
        boolean canCatch = false;
        System.out.println("I have Pokeballs is " + havePokeballs);
    }
}
