package com.malsr.codewars;

import com.malsr.random.GridRectanglesCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridRectanglesCalculatorTest {

    private GridRectanglesCalculator rectanglesCalculator;

    @Before
    public void setup() {
        rectanglesCalculator = new GridRectanglesCalculator();
    }

    @Test
    public void returnsNumberOfRectanglesForA1By1Grid() {
        assertEquals(1, rectanglesCalculator.numberOfRectangles(1, 1));
    }

    @Test
    public void returnsNumberOfRectanglesForA3By2Grid() {
        assertEquals(18, rectanglesCalculator.numberOfRectangles(3, 2));
    }

    @Test
    public void returnsNumberOfRectanglesForA4By4Grid() {
        assertEquals(100, rectanglesCalculator.numberOfRectangles(4, 4));
    }

    @Test
    public void returnsNumberOfRectanglesFor1By10Grid() {
        assertEquals(55, rectanglesCalculator.numberOfRectangles(1, 10));
    }
}