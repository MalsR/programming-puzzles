package com.malsr.codewars;

import com.malsr.random.GridRectanglesCalculator;
import org.junit.Test;

import static org.junit.Assert.*;

public class GridRectanglesCalculatorTest {

    @Test
    public void returnsNumberOfRectanglesForA3By2Grid() {
        GridRectanglesCalculator rectanglesInGrid = new GridRectanglesCalculator();

        assertEquals(18, rectanglesInGrid.numberOfRectangles(3, 2));
    }

    @Test
    public void returnsNumberOfRectanglesForA4By4Grid() {
        GridRectanglesCalculator rectanglesInGrid = new GridRectanglesCalculator();

        assertEquals(100, rectanglesInGrid.numberOfRectangles(4, 4));
    }

}