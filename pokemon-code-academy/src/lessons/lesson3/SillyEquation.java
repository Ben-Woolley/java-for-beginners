package lessons.lesson3;

public class SillyEquation {
    public static void main(String[] args) {
        Integer numberOfApples = 2;
        Integer numberOfBananas = 4;
        Integer numberOfOranges = 2;
        System.out.println(
                (numberOfApples == numberOfBananas) &&
                        (numberOfApples.equals(numberOfOranges)));
    }
}
