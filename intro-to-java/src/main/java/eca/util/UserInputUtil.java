package eca.util;

import java.util.Scanner;

public class UserInputUtil {

    private static final Scanner SCANNER = new Scanner(System.in);

    public static String readLine() {
        return SCANNER.nextLine();
    }

    public static Integer readInteger() {
        var lineAsString = SCANNER.nextLine();
        return Integer.parseInt(lineAsString);
    }

    public static Double readDouble() {
        var lineAsString = SCANNER.nextLine();
        return Double.parseDouble(lineAsString);
    }

    public static Boolean readBoolean() {
        var lineAsString = SCANNER.nextLine();
        return Boolean.parseBoolean(lineAsString);
    }
}
