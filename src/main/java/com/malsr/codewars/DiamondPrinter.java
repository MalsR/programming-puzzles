package com.malsr.codewars;

public class DiamondPrinter {

    public String print(int maxDiamondsToPrint) {
        if (maxDiamondsToPrint < 0 || maxDiamondsToPrint % 2 == 0) {
            return null;
        }

        final StringBuilder result = new StringBuilder();

        //Calculate upper half including middle diamonds
        for (int x = 1; x <= maxDiamondsToPrint; x = x + 2) {
            if (x != maxDiamondsToPrint) {
                appendSpaces(maxDiamondsToPrint, x, result);
            }
            appendDiamonds(result, x);
            if (maxDiamondsToPrint != 1) {
                appendNewLine(result);
            }
        }

        //Calculate lower half only
        for (int x = maxDiamondsToPrint - 2; x > 0; x = x - 2) {
            appendSpaces(maxDiamondsToPrint, x, result);
            appendDiamonds(result, x);
            appendNewLine(result);
        }

        return result.toString();
    }

    private void appendSpaces(int maxDiamondsToPrint, int diamondsInRow, StringBuilder diamondsPerRow) {
        int numberOfSpaces = (maxDiamondsToPrint - diamondsInRow) / 2;
        for (int z = 0; z < numberOfSpaces; z++) {
            diamondsPerRow.append(" ");
        }
    }

    private void appendDiamonds(StringBuilder result, int diamondsInRow) {
        for (int y = 0; y < diamondsInRow; y++) {
            result.append("*");
        }
    }

    private void appendNewLine(StringBuilder result) {
        result.append("\n");
    }
}
