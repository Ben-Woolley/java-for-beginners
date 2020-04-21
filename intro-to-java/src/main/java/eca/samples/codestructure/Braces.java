package eca.samples.codestructure;

public class Braces {

    public static void main(String[] args) {
        var sayHello = true;

        if (sayHello) { // context of if-statement starts here

            // sayHello is accessible here, because this block is inside main

            var helloMessage = "Hello there!";

            System.out.println(helloMessage);

        } // context of if-statement starts here

        // helloMessage is inaccessible here, we're not in the if statement's context
        // System.out.println(helloMessage); // This line would not work if uncommented
    }

}