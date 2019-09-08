package eca.exercises.PYCA.answers;

public class AnswersPYCA {

    public static Double calculatePythagoras(Integer sideA, Integer sideB) {
        // Using sideA and sideB, calculate the length of sideC of the triangle using Pythagoras' theorem
        Double aSquared = Math.pow(sideA, 2);
        Double bSquared = Math.pow(sideB, 2);
        Double cSquared = aSquared + bSquared;

        Double sideC = Math.sqrt(cSquared);

        // Print your message
        System.out.println("A right angle triangle with first side length " + sideA + " and second side length " + sideB + " has third side length " + sideC);

        // Return the value of sideC
        return 0.0;
    }

    public static void main(String[] args) {
        Double length = calculatePythagoras(1, 2);
    }
}
