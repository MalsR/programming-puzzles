package com.malsr.random;

public class GridRectanglesCalculator {

    public int numberOfRectangles(int x, int y) {
        int numberOfRectangles = 0;

        for (int i = 0; i < x; i++) {
            //For each x, starting with i=0 means we start with the original x value
            for (int j = 0; j < y; j++) {
                numberOfRectangles += (x - i) * (y - j);
            }
        }
        return numberOfRectangles;
    }
}
