package com.malsr.codewars;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class FindParityOutlierTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionWhenNoNumbersArePresent() {
        expectedException.expect(IllegalArgumentException.class);

        FindParityOutlier parityOutlier = new FindParityOutlier();
        parityOutlier.find(new int[]{});
    }

    @Test
    public void throwsExceptionWhenLessThanThreeNumbersArePresent() {
        expectedException.expect(IllegalArgumentException.class);

        FindParityOutlier parityOutlier = new FindParityOutlier();
        parityOutlier.find(new int[] {2, 9});
    }

    @Test
    public void returnsTheOnlyOddNumberWhenAllOtherNumbersAreEven() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        int[] numbersToFind = new int[] {2, 4, 3, 8, 100, 220};

        assertEquals("", 3, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsTheOddNumberZeroWhenAllOtherNumbersAreEven() {
        FindParityOutlier parityOutlier = new FindParityOutlier();

        int[] numbersToFind = new int[] {0, 2 , 4, 6};

        assertEquals("", 0, parityOutlier.find(numbersToFind));
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