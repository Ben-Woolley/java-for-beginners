package eca.samples.buildingblocks.pt2;

import java.util.List;

public class UsingForEach {
    public static void main(String[] args) {
        var alphabet = List.of("a", "b", "c");

        // For each letter in the List alphabet
        for (var letter : alphabet) {
            // Print the current letter
            System.out.println(letter);
        }
    }
}