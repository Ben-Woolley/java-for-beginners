package eca.exercises.PYCA.answers;

public class AnswersPYCA {

    public static void main(String[] args) {
        // Using sideA and sideB, calculate the length of sideC of the triangle using Pythagoras' theorem
        var sideA = 2;
        var sideB = 3;

        var aSquared = Math.pow(sideA, 2);
        var bSquared = Math.pow(sideB, 2);
        var cSquared = aSquared + bSquared;

        var sideC = Math.sqrt(cSquared);

        // Print your message
        System.out.println("A right angle triangle with first side length " + sideA + " and second side length " + sideB + " has third side length " + sideC);    }
}
