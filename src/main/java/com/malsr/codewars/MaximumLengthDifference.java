package com.malsr.codewars;

import java.util.SortedSet;
import java.util.TreeSet;

public class MaximumLengthDifference {

    public int mxdiflg(String[] firstArray, String[] secondArray) {

        if (firstArray.length == 0 || secondArray.length == 0) {
            return -1;
        }

        SortedSet<Integer> sortedResults = new TreeSet<>();

        for (String aArrayElement : firstArray) {
            for (String bArrayElement : secondArray) {
                int lengthDifference = Math.abs(aArrayElement.length() - bArrayElement.length());
                sortedResults.add(lengthDifference);
            }
        }

        return sortedResults.last();
    }
}
