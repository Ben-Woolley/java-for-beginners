package code.academy;

import java.util.Scanner;

class UserInputUtil
{
    private static Scanner reader = new Scanner(System.in);

    static String readString() {
        return reader.nextLine();
    }

    static Integer readInt() {
        return reader.nextInt();
    }
}