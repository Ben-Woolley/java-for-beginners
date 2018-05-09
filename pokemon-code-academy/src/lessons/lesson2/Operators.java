package lessons.lesson2;

public class Operators {

    public static void main(String[] args) {
        /*
          We can COMPARE values using comparison operators
            you are probably familiar with:
                < - less than
                > - greater than
                <= - less than or equal to
                >= - greater than or equal to
                == - equal to
                != - not equal to
          Using these will return (give back) a Boolean value.
         */
        // This example needs brackets for java to interpret
        //  the expression properly
        System.out.println("10 > 5 = " + (10 > 5));


        /*
          We also have Boolean logical operators:
            && - AND
            || - OR
            !  - NOT

            Notice we can use expressions with variables anywhere.
         */
        Boolean trueNotEqualFalse = true != false;
        System.out.println(10 > 5 && trueNotEqualFalse);
    }
}
