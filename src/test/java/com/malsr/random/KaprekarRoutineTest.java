package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class KaprekarRoutineTest {

    private final KaprekarRoutine kaprekarRoutine = new KaprekarRoutine();

    @Test
    public void returnsLargestDigitInFourDigitNumber() {
        assertEquals(4, kaprekarRoutine.largestDigit(2431));
    }

    @Test
    public void returnsLargestDigitInFourDigitNumberContainingZeroDigit() throws Exception {
        assertEquals(9, kaprekarRoutine.largestDigit(9078));
    }

    @Test
    public void returnsLargestDigitInFourDigitNumberAllContainingSameDigit() throws Exception {
        assertEquals(9, kaprekarRoutine.largestDigit(9999));
    }

    @Test
    public void returnsLargestDigitInThreeDigitNumber() {
        assertEquals(5, kaprekarRoutine.largestDigit(254));
    }

    @Test
    public void returnsLargestDigitInTwoDigitNumber() {
        assertEquals(8, kaprekarRoutine.largestDigit(28));
    }

    @Test
    public void returnsDescendingDigitsForFourDigitNumber() {
        assertEquals(9741, kaprekarRoutine.descendingDigits(7419));
    }

    @Test
    public void returnsDescendingDigitsForFourDigitNumberWithDuplicates() {
        assertEquals(7622, kaprekarRoutine.descendingDigits(2267));
    }

    @Test
    public void returnsDescendingDigitsForThreeDigitNumber() {
        assertEquals(3200, kaprekarRoutine.descendingDigits(320));
    }

    @Test
    public void returnsDescendingDigitsForTwoDigitNumber() throws Exception {
        assertEquals(2200, kaprekarRoutine.descendingDigits(22));

    }
}