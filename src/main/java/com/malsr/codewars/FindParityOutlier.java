package com.malsr.codewars;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class FindParityOutlier {

    public int find(int[] integers) {
        if (integers.length < 3) {
            throw new IllegalArgumentException("Array should contain three numbers or more");
        }

        Set<Integer> evenNumbers = new HashSet<>();
        Set<Integer> oddNumbers = new HashSet<>();

        for (int x = 0; x < integers.length; x++) {

            int numberToCheck = integers[x];

            if (numberToCheck * 2 == 0 || numberToCheck % 2 != 0) {
                oddNumbers.add(numberToCheck);
            } else {
                evenNumbers.add(numberToCheck);
            }
        }

        if (evenNumbers.size() > oddNumbers.size()) {
            return oddNumbers.stream().findFirst().get();
        } else {
            Optional<Integer> firstEvenNumber = evenNumbers.stream().findFirst();
            return firstEvenNumber.isPresent() ? firstEvenNumber.get() : 0;
        }
    }

    public int find2(int[] integers) {
        if (integers.length == 0) {
            return 0;
        }

        int result = 0;
        int sumOfNumbers = 0;
//        boolean isZeroPresent = false;
        for (int i = 0; i < integers.length; i++) {
            int numberToCheck = integers[i];

//            if (numberToCheck == 0) {
//                isZeroPresent = true;
//            }
            sumOfNumbers = sumOfNumbers + numberToCheck;
        }

        if (sumOfNumbers % 2 != 0) {
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 != 0) {
                    result = integers[i];
                }
            }
        } else {
//            if (isZeroPresent) {
//                return 0;
//            }
            for (int i = 0; i < integers.length; i++) {
                if (integers[i] % 2 == 0) {
                    result = integers[i];
                }
            }
        }

        return result;
    }
}
