package lessons.lesson4;

/**
 * A class is the representation of a type of an object in your program.
 *
 * It acts as a blueprint to create objects of the type, with state unique to that instance.
 */
public class ExampleClass {

    private String anExampleField;
    /**
     * This is the constructor of the class, this is what we call to create an instance of the blueprint.
     *
     * The constructor is written as "public *ClassName*(*whatever arguments you want*) {}"
     */
    public ExampleClass(String exampleArgument) {
        this.anExampleField = exampleArgument;
    }

    public String getAnExampleField() {
        return anExampleField;
    }
}
