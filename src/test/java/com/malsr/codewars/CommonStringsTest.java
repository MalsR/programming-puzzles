package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStringsTest {

    @Test
    public void returnsTrueWhenStringsHaveCommonSubString() {
        assertTrue(CommonStrings.substringTest("Something", "HoMe"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringReversedParameters() {
        assertTrue(CommonStrings.substringTest("Home", "Something"));
    }

    @Test
    public void returnsTrueWhenBothStringsAreEqual() {
        assertTrue(CommonStrings.substringTest("home", "home"));
    }

    @Test
    public void returnsTrueWhenStringsContainNumbers() {
        assertTrue(CommonStrings.substringTest("Hi345", "Bye245"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringsIgnoringCase() {
        assertTrue("", CommonStrings.substringTest("HELlo", "Below"));
    }

    @Test
    public void returnsFalseWhenStringsDoesNotHaveCommonSubString() {
        assertFalse(CommonStrings.substringTest("Something", "Fun"));
    }

    @Test
    public void returnsFalseWhenEitherStringIsEmpty() {
        assertFalse(CommonStrings.substringTest("Test", ""));
        assertFalse(CommonStrings.substringTest("", "Test"));
    }

    @Test
    public void returnsFalseWhenStringsAreNull() {
        assertFalse(CommonStrings.substringTest(null, null));
    }

    @Test
    public void returnsFalseWhenFirstStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.substringTest("U", "Under");
        assertFalse("Expected to return false as the first String param length is 1", actualValue);
    }

    @Test
    public void returnsFalseWhenSecondStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.substringTest("Fun", "u");
        assertFalse("Expected to return false as the second String param length is 1", actualValue);
    }
}