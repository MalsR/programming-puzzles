package com.malsr.codewars;

public class FindParityOutlier {

    public int find(int[] integers) {
        if (integers.length == 0) {
            return 0;
        }

        int result = 0;
        int sumOfNumbers = 0;
        for (int i = 0; i < integers.length; i++) {
            int numberToCheck = integers[i];
            sumOfNumbers = sumOfNumbers + numberToCheck;
        }

        if (sumOfNumbers % 2 != 0) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    result = integers[i];
                }
            }
        } else {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    result = integers[i];
                }
            }
        }

        return result;
    }
}
