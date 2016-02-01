package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class MaximumLengthDifferenceCalculatorTest {

    @Test
    public void returnsNegativeNumIfEitherFirstParameterIsEmpty() {
        MaximumLengthDifferenceCalculator maxDiffLength = new MaximumLengthDifferenceCalculator();

        assertEquals(-1, maxDiffLength.maxLengthDiff(new String[]{}, new String[]{"a", "bat"}));
    }

    @Test
    public void returnsNegativeNumIfEitherSecondParameterIsEmpty() {
        MaximumLengthDifferenceCalculator maxDiffLength = new MaximumLengthDifferenceCalculator();

        assertEquals(-1, maxDiffLength.maxLengthDiff(new String[]{"a", "bat"}, new String[]{}));
    }

    @Test
    public void returnsMaxLengthDifferenceForNonEmptyStringArrays() {
        String[] array1 = new String[] {"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
        String[] array2 = new String[] {"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};

        MaximumLengthDifferenceCalculator maxLengthDiff = new MaximumLengthDifferenceCalculator();

        assertEquals(13, maxLengthDiff.maxLengthDiff(array1, array2));
    }
}