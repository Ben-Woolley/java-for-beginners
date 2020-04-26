package eca.samples.buildingblocks.pt2;

public class UsingForWithCounter {
    public static void main(String[] args) {

        // For a counter starting at 1, stopping at 10, and incrementing by 1
        // (Or "for each number between 1 and 10, incrementing by 1")
        for (var counter = 1; counter <= 10; counter = counter + 1) {

            // Print the world "Number" next to the current value of the counter
            System.out.println("Number " + counter);
        }

        // For clarity:
        for (
            var counter = 1; // For a counter starting at one 
            counter <= 10;  // Stopping at 10 (the loop will only run whilst this comparison is true)
            counter = counter + 1 // Incrementing by 1 (this happens after each run of the body of the loop)
            ) {
            // This is the body of the loop
            
            // Print the world "Number" next to the current value of the counter
            System.out.println("Number " + counter);
        }
    }
}