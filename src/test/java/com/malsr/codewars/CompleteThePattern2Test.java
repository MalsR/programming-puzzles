package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CompleteThePattern2Test {

    @Test
    public void returnsEmptyStringWhenNumberOfRowsToPrintIsLessThanOne() {
        CompleteThePattern2 completeThePattern = new CompleteThePattern2();

        assertEquals("", completeThePattern.pattern(0));
    }

    @Test
    public void returnsEmptyStringWhenNumberOfRowsToPrintIsNegative() {
        CompleteThePattern2 completeThePattern = new CompleteThePattern2();

        assertEquals("", completeThePattern.pattern(-2));
    }

    @Test
    public void returnsCorrectNumberOfRowsWhenRowsToPrintIsTwo() {
        CompleteThePattern2 completeThePattern = new CompleteThePattern2();

        String expectedPattern = "21\n" +
                                 "2";
        assertEquals(expectedPattern, completeThePattern.pattern(2));
    }

    @Test
    public void returnsCorrectNumberOfRowsWhenRowsToPrintIsFive() {
        CompleteThePattern2 completeThePattern = new CompleteThePattern2();

        String expectedPattern = "54321\n" +
                                 "5432\n" +
                                 "543\n" +
                                 "54\n" +
                                 "5";
        assertEquals(expectedPattern, completeThePattern.pattern(5));
    }

    @Test
    public void returnsCorrectNumberOfRowsWhenRowsToPrintIsEleven() {
        CompleteThePattern2 completeThePattern2 = new CompleteThePattern2();

        String expectedPattern = "1110987654321\n" +
                                 "111098765432\n" +
                                 "11109876543\n" +
                                 "1110987654\n" +
                                 "111098765\n" +
                                 "11109876\n" +
                                 "1110987\n" +
                                 "111098\n" +
                                 "11109\n" +
                                 "1110\n" +
                                 "11";

        assertEquals(expectedPattern, completeThePattern2.pattern(11));
    }
}