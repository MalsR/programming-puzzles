package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStringsTest {

    @Test
    public void returnsTrueWhenStringsHaveCommonSubString() {
        assertTrue(CommonStrings.substringTest("Something", "HoMe"));

        assertTrue(CommonStrings.substringTestExample2("Something", "HoMe"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringReversedParameters() {
        assertTrue(CommonStrings.substringTest("Home", "Something"));

        assertTrue(CommonStrings.substringTestExample2("Home", "Something"));
    }

    @Test
    public void returnsTrueWhenBothStringsAreEqual() {
        assertTrue(CommonStrings.substringTest("home", "home"));

        assertTrue(CommonStrings.substringTestExample2("home", "home"));
    }

    @Test
    public void returnsTrueWhenStringsContainNumbers() {
        assertTrue(CommonStrings.substringTest("Hi345", "Bye245"));

        assertTrue(CommonStrings.substringTestExample2("Hi345", "Bye245"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringsIgnoringCase() {
        assertTrue("", CommonStrings.substringTest("HELlo", "Below"));

        assertTrue("", CommonStrings.substringTestExample2("HELlo", "Below"));
    }

    @Test
    public void returnsFalseWhenStringsDoesNotHaveCommonSubString() {
        assertFalse(CommonStrings.substringTest("Something", "Fun"));

        assertFalse(CommonStrings.substringTestExample2("Something", "Fun"));
    }

    @Test
    public void returnsFalseWhenEitherStringIsEmpty() {
        assertFalse(CommonStrings.substringTest("Test", ""));
        assertFalse(CommonStrings.substringTestExample2("Test", ""));

        assertFalse(CommonStrings.substringTest("", "Test"));
        assertFalse(CommonStrings.substringTestExample2("", "Test"));
    }

    @Test
    public void returnsFalseWhenStringsAreNull() {
        assertFalse(CommonStrings.substringTest(null, null));

        assertFalse(CommonStrings.substringTestExample2(null, null));
    }

    @Test
    public void returnsFalseWhenFirstStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.substringTest("U", "Under");
        assertFalse("Expected to return false as the first String param length is 1", actualValue);

        assertFalse("Expected to return false as the first String param length is 1",
                CommonStrings.substringTestExample2("U", "Under"));
    }

    @Test
    public void returnsFalseWhenSecondStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.substringTest("Fun", "u");
        assertFalse("Expected to return false as the second String param length is 1", actualValue);

        assertFalse("Expected to return false as the second String param length is 1",
                CommonStrings.substringTestExample2("Fun", "u"));
    }
}