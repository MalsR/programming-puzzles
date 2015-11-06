package com.malsr.random;

import org.junit.Test;

import static org.junit.Assert.*;

public class PalindromeTest {

    @Test
    public void returnsTrueWhenGivenSentenceIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue("Expected sentence to be a palindrome", palindrome.isPalindrome("Noel sees Leon."));
        assertTrue("Expected sentence to be a palindrome", palindrome.isPalindrome2("Noel sees Leon."));
    }

    @Test
    public void returnsTrueWhenComaSeparatedSentenceIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue("Expected comma separated sentence to be a palindrome",
                palindrome.isPalindrome("A car, a man, a maraca."));
        assertTrue("Expected comma separated sentence to be a palindrome",
                palindrome.isPalindrome2("A car, a man, a maraca."));
    }

    @Test
    public void returnsTrueWhenGivenWordIsAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertTrue("Expected given word to be a palindrome", palindrome.isPalindrome("NooN"));
        assertTrue("Expected given word to be a palindrome", palindrome.isPalindrome2("NooN"));
    }

    @Test
    public void returnsFalseWhenGivenSentenceIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse("Expected given sentence Not to be a palindrome", palindrome.isPalindrome("Noel sees a Leon."));
        assertFalse("Expected given sentence Not to be a palindrome", palindrome.isPalindrome2("Noel sees a Leon."));
    }

    @Test
    public void returnsFalseWhenGivenWordIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse("Expected given word not to be a palindrome", palindrome.isPalindrome("Onion"));
        assertFalse("Expected given word not to be a palindrome", palindrome.isPalindrome2("Onion"));
    }

    @Test
    public void returnsFalseWhenEmptyStringIsNotAPalindrome() {
        Palindrome palindrome = new Palindrome();

        assertFalse("Expected empty string not to be a palindrome", palindrome.isPalindrome(""));
        assertFalse("Expected empty string not to be a palindrome", palindrome.isPalindrome2(""));
    }
}