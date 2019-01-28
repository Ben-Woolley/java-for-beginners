package eca.answers.lesson2;

import eca.util.UserInputUtil;

public class HelloInsertNameHere {

    public static void main(String[] args) {

        // Print some introductory text so the user knows to type into the console/terminal
        System.out.print("Hey, what's your name? : ");

        // Use UserinputUtil.readLine to take in what the user entered as a String
        String inputName = UserInputUtil.readLine();

        // Print out the formatted message by appending Strings using +
        System.out.println("Hello, " + inputName + "!");
    }
}
