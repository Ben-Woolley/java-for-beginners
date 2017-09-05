package code.academy;

import java.util.Scanner;

class UserInputUtil
{
    static Scanner reader = new Scanner(System.in);

    static String readString() {
        return reader.nextLine();
    }

    static int readInt() {
        return reader.nextInt();
    }
}