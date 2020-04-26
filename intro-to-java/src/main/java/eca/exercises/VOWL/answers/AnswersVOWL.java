package eca.exercises.VOWL.answers;

import eca.util.UserInputUtil;

public class AnswersVOWL {
    public static void main(String[] args) {
        // Choose a character
        System.out.print("Enter a character: ");
        var character = UserInputUtil.readLine();

        // Convert the character to lower case for comparison, making the comparisons case insensetive
        var characterToLowerCase = character.toLowerCase(); 

        // Determine whether it is a vowel or a consonant 
        // (i.e. if it is a, e, i, o, or u, it's a vowel)
        // We do that by using equality checks
        if (characterToLowerCase.equals("a") || characterToLowerCase.equals("e") || characterToLowerCase.equals("i")
                || characterToLowerCase.equals("o") || characterToLowerCase.equals("u")) {
            // Print the result
            System.out.println(character + " is a vowel");
        } else {
            // Print the result
            System.out.println(character + " is a consonant");
        }
    }
}