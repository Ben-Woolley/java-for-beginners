package lessons.lesson2;

public class SillyEquation {
    private static final int MY_SUM = 5;

    public static void main(String[] args) {
        Integer numberOfApples = 2;
        Integer numberOfBananas = 4;
        Integer numberOfOranges = 2;
        System.out.println(MY_SUM == sum(numberOfApples, numberOfBananas));
        System.out.println(MY_SUM < sum(numberOfOranges, numberOfBananas));
    }

    private static Integer sum(Integer firstNumber, Integer secondNumber) {
        return firstNumber + secondNumber;
    }
}
