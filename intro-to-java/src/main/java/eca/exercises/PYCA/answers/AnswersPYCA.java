package eca.exercises.PYCA.answers;

public class AnswersPYCA {

    public static void main(String[] args) {
        // Using sideA and sideB, calculate the length of sideC of the triangle using Pythagoras' theorem
        Integer sideA = 2;
        Integer sideB = 3;

        Double aSquared = Math.pow(sideA, 2);
        Double bSquared = Math.pow(sideB, 2);
        Double cSquared = aSquared + bSquared;

        Double sideC = Math.sqrt(cSquared);

        // Print your message
        System.out.println("A right angle triangle with first side length " + sideA + " and second side length " + sideB + " has third side length " + sideC);    }
}
