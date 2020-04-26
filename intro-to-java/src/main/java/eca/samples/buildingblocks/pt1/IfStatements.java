package eca.samples.buildingblocks.pt1;

public class IfStatements {

    public static void main(String[] args) {

        var condition = true;

        if (condition) {
            System.out.println("The condition is true");
        }

        if (condition) {
            System.out.println("The condition is still true");
        } else {
            System.out.println("The condition is false");
        }

    }
}