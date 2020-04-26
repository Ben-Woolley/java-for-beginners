package eca.samples.classesmethods;

public class UsingPerson {

    public static void main(String[] args) {
        // Create a Person from our Person class, using the **constructor**
        var bob = new Person("Bob", 30, 175);

        // Use the **methods** on the Person class to create a message about bob
        System.out.println("This person is " + bob.getName() + ", who is " + bob.getAge() + " years old, and " + bob.getHeight() + "cm tall");
    }

}