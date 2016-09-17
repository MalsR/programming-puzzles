package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class FindParityOutlierTest {

    @Test
    public void returnsZeroWhenNoNumbersPresent() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        assertEquals("", 0, parityOutlier.find(new int[]{}));
    }

    @Test
    public void returnsTheOnlyOddNumberWhenAllOtherNumbersAreEven() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        int[] numbersToFind = new int[] {2, 4, 3, 8, 100, 220};

        assertEquals("", 3, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsTheOnlyNegativeOddNumberWhenAllOtherNumbersAreEven() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        int[] numbersToFind = new int[] {2, 4, -3, 8, 100, 220};

        assertEquals("", -3, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsTheOnlyEvenNumberWhenAllOtherNumbersAreOdd() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        int[] numbersToFind = new int[] {3, 5, 7, 99, 102};

        assertEquals("", 102, parityOutlier.find(numbersToFind));
    }
}