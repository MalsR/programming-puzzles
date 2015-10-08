package com.malsr.random;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void returnsTrueWhenGivenSentenceIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("Noel sees Leon."));
    }

    @Test
    public void returnsTrueWhenComaSeparatedSentenceIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("A car, a man, a maraca."));
    }

    @Test
    public void returnsTrueWhenGivenWordIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue(palindrome.isPalindrome("NooN"));
    }

    @Test
    public void returnsFalseWhenGivenSentenceIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse(palindrome.isPalindrome("Noel sees a Leon."));
    }

    @Test
    public void returnsFalseWhenGivenWordIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse(palindrome.isPalindrome("Onion"));
    }

    @Test
    @Ignore
    public void returnsFalseWhenEmptyStringIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse(palindrome.isPalindrome(" "));
    }
}