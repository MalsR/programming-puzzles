package com.malsr.random;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

public class KaprekarRoutine {

    private static final int KAPREKAR_CONSTANT = 6174;

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
        long startTime = System.currentTimeMillis();
        if (numberToCheck == KAPREKAR_CONSTANT)
            return 0;

        List<Integer> digitsInNumber = getDigitsInNumber(numberToCheck);

        StringBuilder reverseDigitBuilder = new StringBuilder();
        digitsInNumber.stream()
                .sorted((o1, o2) -> {
                    return o1 > o2 ? -1 : (o1.intValue() == o2.intValue() ? 0 : 1);
                })
                .forEach(reverseDigitBuilder::append);

        StringBuilder naturalOrderDigitBuilder = new StringBuilder();
        digitsInNumber.stream()
                .sorted()
                .forEach(naturalOrderDigitBuilder::append);

        int reverseDescending = Integer.parseInt(reverseDigitBuilder.toString());
        int ascending = Integer.parseInt(naturalOrderDigitBuilder.toString());

        numberToCheck = reverseDescending - ascending;

        if (numberToCheck == KAPREKAR_CONSTANT) {
            return 1;
        }

        //quick benchmarking
        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);

        return (kaprekarConstantIterations(numberToCheck) + 1);
    }

    //Bonus#2 - Another way of sorting using Collections
    public int kaprekarConstantIterations_2(int numberToCheck) {
        long startTime = System.currentTimeMillis();
        if (numberToCheck == KAPREKAR_CONSTANT)
            return 0;

        List<Integer> digitsInNumber = getDigitsInNumber(numberToCheck);

        Collections.sort(digitsInNumber, Collections.reverseOrder());
        StringBuilder reverseDigitBuilder = new StringBuilder();
        digitsInNumber.forEach(reverseDigitBuilder::append);

        List<Integer> naturalOrderedList = new ArrayList<>();
        naturalOrderedList.addAll(digitsInNumber);
        StringBuilder naturalOrderDigitBuilder = new StringBuilder();
        Collections.sort(naturalOrderedList);
        naturalOrderedList.forEach(naturalOrderDigitBuilder::append);

        int reverseDescending = Integer.parseInt(reverseDigitBuilder.toString());
        int ascending = Integer.parseInt(naturalOrderDigitBuilder.toString());

        numberToCheck = reverseDescending - ascending;

        if (numberToCheck == KAPREKAR_CONSTANT) {
            return 1;
        }

        long endTime = System.currentTimeMillis() - startTime;
        System.out.println(endTime);
        
        return (kaprekarConstantIterations_2(numberToCheck) + 1);
    }
}
