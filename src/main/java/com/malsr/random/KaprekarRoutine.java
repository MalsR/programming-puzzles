package com.malsr.random;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class KaprekarRoutine {

    public int largestDigit(int number) {
        List<Integer> digitSet = getDigitsInNumber(number);

        Optional<Integer> first = digitSet.stream()
                .sorted((o1, o2) -> {return o1 > o2 ? -1 : 0;})
                .findFirst();

        return first.orElse(-1);
    }

    //Bonus#1
    public int descendingDigits(int number) {
        List<Integer> list = getDigitsInNumber(number);

        final StringBuilder stringBuilder = new StringBuilder();
        list.stream()
                .sorted((o1, o2) -> {return o1 > o2 ? -1 : 0;})
                .forEach(stringBuilder::append);

        return Integer.parseInt(stringBuilder.toString());
    }

    private List<Integer> getDigitsInNumber(int number) {
        final List<Integer> list = new ArrayList<>();
        int numberToBreakDown = number;
        int divisor = 1000;

        for (int i = 1; i <= 4; i++) {
            int digit = numberToBreakDown / divisor;
            numberToBreakDown = numberToBreakDown - digit * divisor;
            divisor = divisor / 10;

            list.add(digit);
        }
        return list;
    }
}
