package com.malsr.codewars;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class StringRotationCalculatorTest {

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {"coffee", "eecoff", 2},
                {"eecoff", "coffee", 4},
                {"isn't", "'tisn", 2},
                {"dog", "god", -1},
                {"plane", "plane", 0}
        });
    }

    private String originalString;
    private String rotatedString;
    private int expectedRotation;

    public StringRotationCalculatorTest(String originalString, String rotatedString, int expectedRotation) {
        this.originalString = originalString;
        this.rotatedString = rotatedString;
        this.expectedRotation = expectedRotation;
    }

    @Test
    public void returnsCorrectRotationNumber() {
        StringRotationCalculator rotationCalculator = new StringRotationCalculator();

        assertEquals(expectedRotation, rotationCalculator.rotatedCharacters(originalString, rotatedString));
    }
}