package eca.answers.lesson2;

import java.time.LocalDateTime;

public class PrettyDateTime {

    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();

        System.out.println(
                "Today is "
                + now.getDayOfMonth() + " "
                + now.getMonth().name() + " "
                + now.getYear() + " "
                + " and the time is "
                + now.getHour() + ":" + now.getMinute()
                );
    }
}
