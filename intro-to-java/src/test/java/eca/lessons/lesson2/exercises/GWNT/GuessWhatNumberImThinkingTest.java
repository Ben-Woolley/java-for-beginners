package eca.lessons.lesson2.exercises.GWNT;

import org.junit.Test;

import java.io.ByteArrayInputStream;

import static eca.lessons.lesson2.exercises.GWNT.GuessWhatNumberImThinking.*;
import static org.junit.Assert.*;

public class GuessWhatNumberImThinkingTest {

    @Test
    public void shouldTryAndWinRandomNumberGame() {
        ByteArrayInputStream input = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(input);

        String result = guessWhatNumber();

        assertEquals(YOU_WIN, result);
    }

    @Test
    public void shouldTryAndLoseRandomNumberGame() {
        ByteArrayInputStream input = new ByteArrayInputStream("1\n".getBytes());
        System.setIn(input);

        String result = guessWhatNumber();

        assertEquals(YOU_LOSE, result);
    }

}