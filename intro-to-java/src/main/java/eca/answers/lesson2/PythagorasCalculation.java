package eca.answers.lesson2;

public class PythagorasCalculation {

    /*
     * Pythagoras' theorem lets us calculate the length of the the hypotenuse
     * (the side opposite the right angle in a right-angled triangle).
     *
     * a^2 + b^2 = c^2
     *
     * so we can either multiply the sides by themselves or use Math.pow function.
     */
    public static void main(String[] args) {
        Double side1 = 1.0;
        Double side2 = 2.0;

        Double side3 = Math.sqrt(Math.pow(side1, 2.0) + Math.pow(side2, 2.0));
        Double side3Alternative = Math.sqrt((side1 * side1) + (side2 * side2));

        System.out.println("Calculated hypotenuse = " + side3);
    }
}
