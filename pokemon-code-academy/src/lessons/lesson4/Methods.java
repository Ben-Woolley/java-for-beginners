package lessons.lesson4;

/**
 * Methods are reusable blocks of code that when not static can use the state of the object.
 *
 * Exercise: try playing with the static modifier and looking at the errors that appear.
 */
public class Methods {
    private String name;

    public Methods(String name) {
        this.name = name;
    }

    /**
     * This is known as a getter, it returns a private field without allowing direct access.
     * This must be non-static as it's return value depends on the state of the object.
     */
    public String getName() {
        return name;
    }

    /**
     * This method is able to be static because it doesn't reference any of the state of the object that contains it.
     *
     * void defines a method that does not give a value back to the caller.
     */
    public static void printClassName() {
        System.out.println(Methods.class.toString());
    }

    public static void main(String[] args) {
        // I can use the static method without an instance
        Methods.printClassName();

        // But I need an instance that has its own state
        Methods methods = new Methods("My state");
        System.out.println(methods.getName());
    }
}
