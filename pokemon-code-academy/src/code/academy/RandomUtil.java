package code.academy;

import java.util.concurrent.ThreadLocalRandom;

public class RandomUtil {

    /**
     * Returns a random Integer between minValue and maxValue, inclusive of both.
     * e.g. randomInteger(0, 10) will return a random Integer between and including 0 and 10.
     *
     * source: https://stackoverflow.com/questions/363681/how-do-i-generate-random-integers-within-a-specific-range-in-java
     */
    public static Integer randomInteger(Integer minValue, Integer maxValue) {
        return ThreadLocalRandom.current().nextInt(minValue, maxValue + 1);
    }

    /**
     * Returns a random Double precision floating point number between 0 (inclusive) and 1 (exclusive).
     * i.e. This method cannot return the value 1.0
     */
    public static Double randomDouble() {
        return ThreadLocalRandom.current().nextDouble();
    }

    public static void main(String[] args) {
        System.out.println(RandomUtil.randomInteger(1, 10));
        System.out.println(RandomUtil.randomDouble());
    }

}
