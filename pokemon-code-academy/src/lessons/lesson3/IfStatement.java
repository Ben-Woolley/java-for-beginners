package lessons.lesson3;

/**
 * If statements let us execute commands based off some condition.
 *
 * Play with the true/false values to change the outcome.
 * User input/interactivity change these in a real program.
 */
public class IfStatement {

    public static void main(String[] args) {

        // A standalone if, either does or does not execute
        if (true) {
            System.out.println("If branch executed");
        }

        // An if/else block, either one or the other executes
        if (true) {
            System.out.println("True branch executed");
        } else {
            System.out.println("False branch executed");
        }

        // A multiple if/else block
        //   the first true branch executes, otherwise the else executes
        if (true) {
            System.out.println("First branch executed");
        } else if (true) {
            System.out.println("Second branch executed");
        } else {
            System.out.println("Else branch executed");
        }
    }
}
