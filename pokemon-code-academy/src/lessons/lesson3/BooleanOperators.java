package lessons.lesson3;

public class BooleanOperators {

    public static void main(String[] args) {
        /*
          Boolean OR is inclusive OR -
            if one or both are true, then it returns true

                  | true | false
            true  | true | true
            false | true | false
         */
        System.out.println("true OR false = " + (true || false));

        /*
          Boolean AND -
            if one or both are false, then it returns false

                  | true  | false
            true  | true  | false
            false | false | false
         */
        System.out.println("true AND false = " + (true && false));

        /*
          Boolean XOR (exclusive OR) -
            if one is true, then it returns true

                  | true  | false
            true  | false | true
            false | true  | false
         */
        System.out.println("true XOR false = " + (true ^ false));
        System.out.println("true XOR true = " + (true ^ true));

    }
}
