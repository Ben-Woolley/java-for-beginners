package eca.exercises.PVAR.answers;

public class AnswerPVAR {

    public static void main(String[] args) {
        // Define your String, Integer, and Boolean
        var brand = "Hotels.com";            // A String represents text
        var numberOfEmployees = 10000;      // An Integer is a whole number
        var memberOfExpediaGroup = true;    // A Boolean is a true/false value

        // Print them using System.out.println
        System.out.println(brand);
        System.out.println(numberOfEmployees);
        System.out.println(memberOfExpediaGroup);

        // Print them together, forming a sentence (that may or may not make sense!)
        System.out.println(brand + " has " + numberOfEmployees + " employees. Is it a member of Expedia Group? " + memberOfExpediaGroup);
    }
}
