package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompleteThePattern1Test {

    @Test
    public void returnsEmptyStringWhenNumberIsNegative() {
        CompleteThePattern1 completeThePattern1 = new CompleteThePattern1();

        assertEquals("", completeThePattern1.pattern(-5));
    }

    @Test
    public void returnsEmptyStringWhenNumberIsZero() {
        CompleteThePattern1 completeThePattern1 = new CompleteThePattern1();

        assertEquals("", completeThePattern1.pattern(0));
    }

    @Test
    public void returnsCorrectPatternWhenNumberIsTwo() {
        CompleteThePattern1 completeThePattern1 = new CompleteThePattern1();

        String expectedPattern = "1\n" +
                                 "22";

        assertEquals(expectedPattern, completeThePattern1.pattern(2));
    }

    @Test
    public void returnsCorrectPatternWhenNumberIsFive() {
        CompleteThePattern1 completeThePattern1 = new CompleteThePattern1();

        String expectedPattern = "1\n" +
                                 "22\n" +
                                 "333\n" +
                                 "4444\n" +
                                 "55555";

        assertEquals(expectedPattern, completeThePattern1.pattern(5));
    }

    @Test
    public void returnsCorrectPatternWhenNumberIsEleven() {
        CompleteThePattern1 completeThePattern1 = new CompleteThePattern1();

        String expectedPattern = "1\n" +
                                 "22\n" +
                                 "333\n" +
                                 "4444\n" +
                                 "55555\n" +
                                 "666666\n" +
                                 "7777777\n" +
                                 "88888888\n" +
                                 "999999999\n" +
                                 "10101010101010101010\n" +
                                 "1111111111111111111111";

        assertEquals(expectedPattern, completeThePattern1.pattern(11));
    }
}