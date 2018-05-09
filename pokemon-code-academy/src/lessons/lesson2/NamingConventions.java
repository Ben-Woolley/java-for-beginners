/*
  Even package/directory names have a convention.
  The package is to be all lower case.
 */
package lessons.lesson2;

/**
 * There can only be one 'public class' per file.
 * The name of this class must match the file name
 *
 * Class names by convention are UpperCamelCase
 * (every word starts with a capital letter)
 *
 * Every type you have used so far follows this convention.
 *   e.g. Boolean, Integer, String
 */
public class NamingConventions {

    /*
      Constants by convention are upper case with words
        separated by underscores.
      In this example we are using the constant for true in Boolean.
     */
    private static final Boolean MY_CONSTANT = Boolean.TRUE;


    /*
      By convention, method names, argument names, AND variable names
        are all lowerCamelCase
        (every word starts with a capital letter EXCEPT the first)
     */
    public Boolean myMethod(String myParameter) {
        Boolean myVariable = MY_CONSTANT;
        return myVariable;
    }
}
