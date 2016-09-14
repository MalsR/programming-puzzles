package com.malsr.codewars;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

public class DiamondPrinterTest {

    @Test
    public void returnNullWhenNumberIsEven() {
        DiamondPrinter diamondPrinter = new DiamondPrinter();

        assertNull(diamondPrinter.print(4));
    }

    @Test
    public void returnNullWhenNumberIsNegative() {
        DiamondPrinter diamondPrinter = new DiamondPrinter();

        assertNull(diamondPrinter.print(-19));
    }

    @Test
    public void returnsSingleDiamondWhenNumberIsOne() {
        DiamondPrinter diamondPrinter = new DiamondPrinter();

        assertEquals("", "*", diamondPrinter.print(1));
    }

    @Test
    public void printsDiamondsWhenNumberToPrintIsThree() {
        DiamondPrinter diamondPrinter = new DiamondPrinter();

        StringBuilder expectedString = new StringBuilder();
        expectedString.append(" *\n");
        expectedString.append("***\n");
        expectedString.append(" *\n");

        assertEquals(expectedString.toString(), diamondPrinter.print(3));
    }

    @Test
    public void printsDiamondsWhenNumberToPrintIsFive() {
        DiamondPrinter diamondPrinter = new DiamondPrinter();

        StringBuilder expectedString = new StringBuilder();
        expectedString.append("  *\n");
        expectedString.append(" ***\n");
        expectedString.append("*****\n");
        expectedString.append(" ***\n");
        expectedString.append("  *\n");

        assertEquals(expectedString.toString(), diamondPrinter.print(5));
    }
}