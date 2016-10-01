package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStringFinderTest {

    @Test
    public void returnsTrueWhenStringsHaveCommonSubString() {
        assertTrue(CommonStringFinder.hasCommonString("Something", "HoMe"));

        assertTrue(CommonStringFinder.hasCommonString_1("Something", "HoMe"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringReversedParameters() {
        assertTrue(CommonStringFinder.hasCommonString("Home", "Something"));

        assertTrue(CommonStringFinder.hasCommonString_1("Home", "Something"));
    }

    @Test
    public void returnsTrueWhenBothStringsAreEqual() {
        assertTrue(CommonStringFinder.hasCommonString("home", "home"));

        assertTrue(CommonStringFinder.hasCommonString_1("home", "home"));
    }

    @Test
    public void returnsTrueWhenStringsContainNumbers() {
        assertTrue(CommonStringFinder.hasCommonString("Hi345", "Bye245"));

        assertTrue(CommonStringFinder.hasCommonString_1("Hi345", "Bye245"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringsIgnoringCase() {
        assertTrue("", CommonStringFinder.hasCommonString("HELlo", "Below"));

        assertTrue("", CommonStringFinder.hasCommonString_1("HELlo", "Below"));
    }

    @Test
    public void returnsFalseWhenStringsDoesNotHaveCommonSubString() {
        assertFalse(CommonStringFinder.hasCommonString("Something", "Fun"));

        assertFalse(CommonStringFinder.hasCommonString_1("Something", "Fun"));
    }

    @Test
    public void returnsFalseWhenEitherStringIsEmpty() {
        assertFalse(CommonStringFinder.hasCommonString("Test", ""));
        assertFalse(CommonStringFinder.hasCommonString_1("Test", ""));

        assertFalse(CommonStringFinder.hasCommonString("", "Test"));
        assertFalse(CommonStringFinder.hasCommonString_1("", "Test"));
    }

    @Test
    public void returnsFalseWhenStringsAreNull() {
        assertFalse(CommonStringFinder.hasCommonString(null, null));

        assertFalse(CommonStringFinder.hasCommonString_1(null, null));
    }

    @Test
    public void returnsFalseWhenFirstStringHasLengthOfOne() {
        boolean actualValue = CommonStringFinder.hasCommonString("U", "Under");
        assertFalse("Expected to return false as the first String param length is 1", actualValue);

        assertFalse("Expected to return false as the first String param length is 1",
                CommonStringFinder.hasCommonString_1("U", "Under"));
    }

    @Test
    public void returnsFalseWhenSecondStringHasLengthOfOne() {
        boolean actualValue = CommonStringFinder.hasCommonString("Fun", "u");
        assertFalse("Expected to return false as the second String param length is 1", actualValue);

        assertFalse("Expected to return false as the second String param length is 1",
                CommonStringFinder.hasCommonString_1("Fun", "u"));
    }
}