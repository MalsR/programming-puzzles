package com.malsr.random;

import java.util.HashSet;
import java.util.Set;

public class KaprekarRoutine {

    public int largestDigit(int number) {

        Set<Integer> digitSet = new HashSet<>();

        int numberToBreakDown = number;
        int divisor = 1000;

        for (int i = 1; i <= 4; i++) {
            int digit = numberToBreakDown / divisor;
            numberToBreakDown = numberToBreakDown - digit * divisor;
            divisor = divisor / 10;

            digitSet.add(digit);
        }

        System.out.println(digitSet);

        return (int) digitSet.toArray()[3];
    }
}
