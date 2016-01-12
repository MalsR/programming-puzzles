package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStringsTest {

    @Test
    public void returnsTrueWhenBothStringsHaveCommonSubString() {
        assertTrue(CommonStrings.SubstringTest("Something", "Home"));
        //assertTrue(CommonStrings.SubstringTest("Something", "ng"));
    }

    @Test
    public void returnsTrueWhenBothStringsAreEqual() {
        assertTrue(CommonStrings.SubstringTest("home", "home"));
    }

    @Test
    public void returnsTrueWhenStringsHaveCommonSubStringsIgnoringCase() {
        assertTrue("", CommonStrings.SubstringTest("HELlo", "Below"));
    }

    @Test
    public void returnsFalseWhenStringsDoesNotHaveCommonSubString() {
        assertFalse(CommonStrings.SubstringTest("Something", "Fun"));
    }

    @Test
    public void returnsFalseWhenStringsAreNull() {
        assertFalse(CommonStrings.SubstringTest(null, null));
    }

    @Test
    public void returnsFalseWhenFirstStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.SubstringTest("U", "Under");
        assertFalse("Expected to return false as the first String param length is 1", actualValue);
    }

    @Test
    public void returnsFalseWhenSecondStringHasLengthOfOne() {
        boolean actualValue = CommonStrings.SubstringTest("Fun", "u");
        assertFalse("Expected to return false as the second String param length is 1", actualValue);
    }
}