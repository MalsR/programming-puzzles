package com.malsr.codewars;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import static org.junit.Assert.*;

public class ParityOutlierTest {

    @Rule
    public ExpectedException expectedException = ExpectedException.none();

    @Test
    public void throwsExceptionWhenNoNumbersArePresent() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should contain three numbers or more");

        ParityOutlier parityOutlier = new ParityOutlier();
        parityOutlier.find(new int[]{});
    }

    @Test
    public void throwsExceptionWhenLessThanThreeNumbersArePresent() {
        expectedException.expect(IllegalArgumentException.class);
        expectedException.expectMessage("Array should contain three numbers or more");

        ParityOutlier parityOutlier = new ParityOutlier();
        parityOutlier.find(new int[] {2, 9});
    }

    @Test
    public void returnsEvenNumberWhenOtherNumbersAreOdd() {
        ParityOutlier parityOutlier = new ParityOutlier();

        int[] numbersToFind = new int[] {2220, 3, 77, 999, 55, 5, 11};

        assertEquals(2220, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsOddNumberWhenOtherNumbersAreEven() {
        ParityOutlier parityOutlier = new ParityOutlier();

        int[] numbersToFind = new int[] {0, 1, 2 , 4, 6};

        assertEquals(1, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsOnlyNegativeOddNumberWhenOtherNumbersAreEven() {
        ParityOutlier parityOutlier = new ParityOutlier();
        System.out.println(-3 % 2);

        int[] numbersToFind = new int[] {2, 4, -3, 8, 100, 220};

        assertEquals(-3, parityOutlier.find(numbersToFind));
    }

    @Test
    public void returnsOnlyNegativeEvenNumberWhenOtherNumbersAreOdd() {
        ParityOutlier parityOutlier = new ParityOutlier();

        int[] numbersToFind = new int[] {3, 5, 7, 99, -102, Integer.MAX_VALUE};

        assertEquals(-102, parityOutlier.find(numbersToFind));
    }
}