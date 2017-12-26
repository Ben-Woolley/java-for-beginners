package code.academy;

import java.util.Scanner;

class UserInputUtil
{
    //TODO NEEDED from WEEK 6
    private static Scanner reader = new Scanner(System.in);

    static String readString() {
        return reader.nextLine();
    }

    static Integer readInt() {
        return reader.nextInt();
    }
}
