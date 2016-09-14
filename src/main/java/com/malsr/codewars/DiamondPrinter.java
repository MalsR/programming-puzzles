package com.malsr.codewars;

public class DiamondPrinter {

    public String print(int numberOfDiamonds) {
        if (numberOfDiamonds < 0 || numberOfDiamonds % 2 == 0) {
            return null;
        }

        if (numberOfDiamonds == 1) {
            return "*";
        }

        final StringBuilder result = new StringBuilder();

        //Calculate upper half including middle diamonds
        for (int x = 1; x <= numberOfDiamonds; x = x + 2) {
            StringBuilder diamondsPerRow = new StringBuilder();

            if (x != numberOfDiamonds) {
                appendSpaces(numberOfDiamonds, x, diamondsPerRow);
            }
            appendDiamonds(result, x, diamondsPerRow);
        }

        //Calculate lower half only
        for (int x = numberOfDiamonds - 2; x > 0; x = x - 2) {
            StringBuilder diamondsPerRow = new StringBuilder();

            appendSpaces(numberOfDiamonds, x, diamondsPerRow);
            appendDiamonds(result, x, diamondsPerRow);
        }

        return result.toString();
    }

    private void appendSpaces(int numberOfDiamonds, int x, StringBuilder diamondsPerRow) {
        int numberOfSpaces = (numberOfDiamonds - x) / 2;
        for (int z = 0; z < numberOfSpaces; z++) {
            diamondsPerRow.append(" ");
        }
    }

    private void appendDiamonds(StringBuilder result, int x, StringBuilder diamondsPerRow) {
        for (int y = 0; y < x; y++) {
            diamondsPerRow.append("*");
        }
        diamondsPerRow.append("\n");

        result.append(diamondsPerRow);
    }
}
