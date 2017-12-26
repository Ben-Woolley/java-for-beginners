package lessons.lesson1.basic_java_concepts;


/**
 * Braces "{ }" group statements, they define a context.
 * e.g. a class uses braces to contain its context here,
 *   in this case being its main method.
 * Anything you want to get from this class must be
 *   made intentionally accessible.
 */
public class CodeFormatting {

    /**
     * Parenthesis "( )" are used to define and give
     *   arguments for methods.
     * main takes an array/list of String arguments, so it
     * would be called like main(new String[] { "Test" }
     */
    public static void main(String[] args) {
        /*
          Parenthesis are also used as in maths to override
          order of precedence
          */
        System.out.println(10 ^ 3 + 2);
        System.out.println((10 ^ 3) + 2);

        System.out.println();
        System.out.println("--------------------");
        System.out.println();

        /*
          Brackets "[ ]" are used to define and access arrays
          Arrays in java are zero-indexed, meaning you start
            counting from 0 (the first element is the 0th)
         */
        Integer[] oneToFive = new Integer[] { 1, 2, 3, 4, 5 };
        System.out.println("\"The second element is \" + oneToFive[1]");
        System.out.println("The second element is " + oneToFive[1]);
    }
}
