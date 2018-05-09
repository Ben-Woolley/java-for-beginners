package lessons.lesson3;

import java.util.HashMap;
import java.util.Map;

/**
 * There are many ways to do one thing.
 * Here are 3 separate solutions to demonstrate this.
 */
public class Homework {

    private static final String GOING_LEFT = "Going left";
    private static final String GOING_FORWARD = "Going forward";
    private static final String GOING_RIGHT = "Going right";
    private static final String GOING_BACKWARD = "Going backward";
    private static final String INVALID_INPUT = "Invalid input";

    private static final Map<Integer, String> DIRECTION_MAP;
    static {
        Map<Integer, String> tempDirectionMap = new HashMap<>();
        tempDirectionMap.put(1, GOING_LEFT);
        tempDirectionMap.put(2, GOING_FORWARD);
        tempDirectionMap.put(3, GOING_RIGHT);
        tempDirectionMap.put(4, GOING_BACKWARD);
        DIRECTION_MAP = java.util.Collections.unmodifiableMap(tempDirectionMap);
    }

    public static void main(String[] args) {
        Integer choice = 1;
        move1(choice);
    }

    private static void move1(Integer choice) {

        if (choice == 1) {
            System.out.println(GOING_LEFT);

        } else if (choice == 2) {
            System.out.println(GOING_FORWARD);

        } else if (choice == 3) {
            System.out.println(GOING_RIGHT);

        } else if (choice == 4) {
            System.out.println(GOING_BACKWARD);

        } else {
            System.out.println(INVALID_INPUT);
        }
    }

    private static void move2(Integer choice) {
        switch (choice) {
            case 1:
                System.out.println(GOING_LEFT);
                break;
            case 2:
                System.out.println(GOING_FORWARD);
                break;
            case 3:
                System.out.println(GOING_RIGHT);
                break;
            case 4:
                System.out.println(GOING_RIGHT);
                break;
            default:
                System.out.println(INVALID_INPUT);
        }
    }

    private static void move3(Integer choice) {
        System.out.println(DIRECTION_MAP.getOrDefault(choice, "Invalid input"));
    }
}
