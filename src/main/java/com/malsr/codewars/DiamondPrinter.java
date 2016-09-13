package com.malsr.codewars;

public class DiamondPrinter {
    public String print(int numberOfDiamonds) {
        if (numberOfDiamonds < 0 || numberOfDiamonds % 2 == 0) {
            return null;
        }

        if (numberOfDiamonds == 1) {
            return "*";
        }

        StringBuilder result = new StringBuilder();
        for (int x = 1; x <= numberOfDiamonds; x = x + 2) {
            StringBuilder diamondsPerRow = new StringBuilder();

            if (x != numberOfDiamonds) {
                int numberOfSpaces = (numberOfDiamonds - x) / 2;
                for (int z = 0; z < numberOfSpaces; z++) {
                    diamondsPerRow.append(" ");
                }
            }

            for (int y = 0; y < x; y++) {
                diamondsPerRow.append("*");
            }
            diamondsPerRow.append("\n");

            result.append(diamondsPerRow);
        }

        for (int x = numberOfDiamonds - 2; x > 0; x = x - 2) {
            StringBuilder diamondsPerRow = new StringBuilder();

            int numberOfSpaces = (numberOfDiamonds - x) / 2;
            for (int z = 0; z < numberOfSpaces; z++) {
                diamondsPerRow.append(" ");
            }

            for (int y = 0; y < x; y++) {
                diamondsPerRow.append("*");
            }
            diamondsPerRow.append("\n");

            result.append(diamondsPerRow);
        }

        return result.toString();
    }
}
