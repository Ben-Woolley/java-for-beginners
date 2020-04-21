package eca.samples.buildingblocks.pt1;

public class IfStatementsContinued {

    public static void main(String[] args) {

        var numberToCheck = 5;

        if (numberToCheck < 0) {

            System.out.println("The number is too small");

        } else if (numberToCheck > 100) {

            System.out.println("The number is too large");

        } else {

            System.out.println("The number is between 0 and 100");

        }

    }

}