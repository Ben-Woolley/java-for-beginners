package eca.exercises.HINH.answers;

import eca.util.UserInputUtil;

public class AnswersHINH {

    public static void main(String[] args) {
        System.out.print("What is your name? "); // Print a message asking for the user's name, notice it uses print instead of println
        String name = UserInputUtil.readLine();  // Use UserInputUtil.readLine() to get text from the user

        System.out.println("Hello, " + name + "!"); // Construct and print the String
    }
}
