package code.academy;

import java.util.Scanner;

/**
 * Read user input from the terminal (System.in, much like we used System.out to print to the terminal)
 */
class UserInputUtil
{
    private static final Scanner SCANNER = new Scanner(System.in);

    /**
     * Read the next line of user input and return it's String representation.
     */
    public static String readString() {
        return SCANNER.nextLine();
    }

    /**
     * Read the next line of user input and return it's Integer representation.
     *
     * From @link{java.util.Scanner}:
     * @throws java.util.InputMismatchException
     *         if the next token does not match the <i>Integer</i>
     *         regular expression, or is out of range
     */
    public static Integer readInteger() {
        return SCANNER.nextInt();
    }
}