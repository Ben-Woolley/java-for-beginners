package eca.samples.classesmethods;

public class Person { // We are defining the blueprint which defines a Person

    /**
     * All Persons have a name, age, and height that's unique to them.
     * 
     * This information is stored in **fields/properties** which are defined as below.
     * You can think of these as variables that are in the context of a particular Person
     * 
     * Note that these are **private** to prevent other Java files changing the fields in an unexpected way.
     */
    private String name;
    private Integer age;
    private Integer height;

    /**
     * This is a constructor, the method used to create a new Person from our class.
     * 
     * This constructor takes a name, age, and height as **arguments**, and uses them
     * to fill the fields of the Person.
     * 
     * Here `this.name` refers to the name belonging the Person class, `name` refers to the argument.
     */
    public Person(String name, Integer age, Integer height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    /**
     * These are **methods**
     * A method is a reusable block of code you can reuse.
     * It also lets us defing **What can and can't be done with a Person**
     * 
     * For example, `getName` allows us to get the Person's name, but there is no way to change the Person's name.
     */
    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Integer getHeight() {
        return height;
    }
}