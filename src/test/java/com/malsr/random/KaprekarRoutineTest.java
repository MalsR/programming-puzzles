package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class KaprekarRoutineTest {

    @Test
    public void returnsLargestDigitInFourDigitNumber() {
        KaprekarRoutine kaprekarRoutine = new KaprekarRoutine();

        assertEquals(4, kaprekarRoutine.largestDigit(2431));
        assertEquals(9, kaprekarRoutine.largestDigit(9078));
    }

    @Test
    public void returnsLargestDigitInThreeDigitNumber() {
        KaprekarRoutine kaprekarRoutine = new KaprekarRoutine();

        assertEquals(5, kaprekarRoutine.largestDigit(254));
    }

    @Test
    public void returnsLargestDigitInTwoDigitNumber() {
        KaprekarRoutine kaprekarRoutine = new KaprekarRoutine();

        assertEquals(8, kaprekarRoutine.largestDigit(28));
    }
}