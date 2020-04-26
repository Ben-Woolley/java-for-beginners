package eca.samples.buildingblocks.pt2;

public class UsingWhile {

    /**
     * TO STOP THE PROGRAM
     * Click into the terminal, then press Crtl+C
     */
    public static void main(String[] args) {
        var condition = true;
        while (condition) {
            System.out.println("I'm stuck here forever");
        }
    }
}