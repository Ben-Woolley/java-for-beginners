package eca.exercises.ANML.answers;

public class Animal {
    // Create properties for species, numberOfLegs, and noise
    private String species;
    private Integer numberOfLegs;
    private String noise;

    // Create the constructor
    public Animal(String species, Integer numberOfLegs, String noise) {
        this.species = species;
        this.numberOfLegs = numberOfLegs;
        this.noise = noise;
    }

    // Using the noise, implement call
    public void call() {
        System.out.println(noise + "!");
    }

    // Using the properties, implement facts
    public void facts() {
        System.out.println("The " + species + " has " + numberOfLegs + " legs and makes a " + noise + " noise");
    }

    public static void main(String[] args) {
        var dog = new Animal("Dog", 4, "woof");
        var bird = new Animal("Bird", 2, "tweet");

        dog.call();
        dog.facts();

        bird.call();
        bird.facts();
    }
}