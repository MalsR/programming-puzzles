package com.malsr.random;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.*;

@RunWith(Parameterized.class)
public class PalindromeTest {

    private String message;
    private boolean expectedResult;
    private String wordOrPhrase;

    private final Palindrome palindrome = new Palindrome();

    public PalindromeTest(String message, boolean expectedResult, String wordOrPhrase) {
        this.message = message;
        this.expectedResult = expectedResult;
        this.wordOrPhrase = wordOrPhrase;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> setupData() {
        return Arrays.asList(new Object[][] {
                {"Expected sentence to be a palindrome", true, "Noel sees Leon."},
                {"Expected comma separated sentence to be a palindrome", true, "A car, a man, a maraca."},
                {"Expected given word to be a palindrome", true, "NooN"},
                {"Expected given sentence Not to be a palindrome", false, "Noel sees a Leon."},
                {"Expected given word not to be a palindrome", false, "Onion"},
                {"Expected empty string not to be a palindrome", false, ""},
                {"Expected empty string with whitespace not to be a palindrome", false, " "}
        });
    }

    @Test
    public void returnsIfGivenWordOrPhraseIsPalindrome() {
        assertEquals(message, expectedResult, palindrome.isPalindrome(wordOrPhrase));
    }

    @Test
    public void returnsTrueIfGivenStringIsPalindrome_3() {
        assertEquals(message, expectedResult, palindrome.isPalindrome3(wordOrPhrase));
    }

    //Another way of checking for Palindrome
    @Test
    public void returnsIfGivenWordOrPhraseIsPalindrome_1() {
        assertEquals(message, expectedResult, palindrome.isPalindrome1(wordOrPhrase));
    }

    //Another way of checking for Palindrome
    @Test
    public void returnsIfGivenWordOrPhraseIsPalindrome_2() {
        assertEquals(message, expectedResult, palindrome.isPalindrome2(wordOrPhrase));
    }
}