package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.*;

public class CommonStringsTest {

    @Test
    public void ShouldBeTrue()
    {
        assertEquals(true, CommonStrings.SubstringTest("Something", "Home"));
        assertEquals(true, CommonStrings.SubstringTest("Something", "ng"));
        assertEquals(true, CommonStrings.SubstringTest("home", "dome"));
        assertEquals(true, CommonStrings.SubstringTest("Fun", "Un"));
    }

    @Test
    public void ShouldBeFalse()
    {
        assertEquals(false, CommonStrings.SubstringTest("Something", "Fun"));
    }
}