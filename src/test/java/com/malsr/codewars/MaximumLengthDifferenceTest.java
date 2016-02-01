package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthDifferenceTest {

    @Test
    public void returnsNegativeNumIfEitherFirstParameterIsEmpty() {
        MaximumLengthDifference maxDiffLength = new MaximumLengthDifference();

        assertEquals(-1, maxDiffLength.mxdiflg(new String[] {}, new String[] {"a", "bat"}));
    }

    @Test
    public void returnsNegativeNumIfEitherSecondParameterIsEmpty() {
        MaximumLengthDifference maxDiffLength = new MaximumLengthDifference();

        assertEquals(-1, maxDiffLength.mxdiflg(new String[] {"a", "bat"}, new String[] {}));
    }

    @Test
    public void returnsMaxLengthDifferenceForNonEmptyStringArrays() {
        String[] array1 = new String[] {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] array2 = new String[] {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        MaximumLengthDifference maxLengthDiff = new MaximumLengthDifference();

        assertEquals(13, maxLengthDiff.mxdiflg(array1, array2));
    }
}