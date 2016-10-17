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

    //Bonus#2
    public int kaprekarConstantIterations(int numberToCheck) {
        if (numberToCheck == 6174)
            return 0;

        List<Integer> digitsInNumber = getDigitsInNumber(numberToCheck);

        //Collections.sort(digitsInNumber, Collections.reverseOrder());

        StringBuilder builder1 = new StringBuilder();
        digitsInNumber.stream().sorted((o1, o2) -> {return o1 > o2 ? -1 : (o1.intValue() == o2.intValue() ? 0 : 1);})
                .forEach(builder1::append);

        StringBuilder builder2 = new StringBuilder();
        digitsInNumber.stream().sorted().forEach(builder2::append);

        int reverseDescending = Integer.parseInt(builder1.toString());
        int ascending = Integer.parseInt(builder2.toString());

        numberToCheck = reverseDescending - ascending;
        int count = 1;

        if (numberToCheck == 6174) {
            return count;
        }
        return (kaprekarConstantIterations(numberToCheck) + count);
    }
}
