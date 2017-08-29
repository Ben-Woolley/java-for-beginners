package code.academy.template;

import java.util.Scanner;

class UserInputUtil
{
    //TODO NEEDED from WEEK 6
    static Scanner reader = new Scanner(System.in);

    static String readString() {
        return reader.nextLine();
    }

    static int readInt() {
        return reader.nextInt();
    }
}
