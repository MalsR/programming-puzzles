package com.malsr.codewars;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class ParityOutlier {

    public int find(int[] integers) {
        if (integers.length < 3) {
            throw new IllegalArgumentException("Array should contain three numbers or more");
        }

        final Set<Integer> evenNumbers = new HashSet<>();
        final Set<Integer> oddNumbers = new HashSet<>();

        Arrays.stream(integers).forEach(numberToCheck -> {
            if (numberToCheck % 2 != 0) {
                oddNumbers.add(numberToCheck);
            } else {
                evenNumbers.add(numberToCheck);
            }
        });

        if (evenNumbers.size() > oddNumbers.size()) {
            return oddNumbers.stream().findFirst().get();
        } else {
            Optional<Integer> firstEvenNumber = evenNumbers.stream().findFirst();
            return firstEvenNumber.isPresent() ? firstEvenNumber.get() : 0;
        }
    }
}
