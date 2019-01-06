package eca.answers.lesson2;

public class PrintingVariables {

    public static void main(String[] args) {

        /*
         * A variable lets us store a value for later use, it's a way to avoid repeating ourselves
         *  and in doing so avoid duplicating calculations (e.g. if you need to call a website and use its
         *  data twice, you want to call it once and store it for later use).
         *
         *  Variables are defined by typing:
         *  *type* *variableName* = *valueToStore*;
         */
        String courseName = "Java 101";
        Integer numberOfSemesters = 10;
        Boolean courseRunning = true;

        /*
         * System.out.print(ln) is how we output text to the console/terminal.
         * In this case we are *concatenating* smaller values to create one sentence or String in java terms by using +.
         */
        System.out.println("Semester " + numberOfSemesters + " of " + courseName + " is running = " + courseRunning);
    }
}
