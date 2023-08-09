package com.mnluan;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class PalindromeTest {

    @Test
    void testIsPalindrome() {
        // Test a palindrome:
        PalindromeChecker checker1 = new PalindromeChecker("racecar");
        assertTrue(checker1.check(), "racecar should be a palindrome");

        // Test a non-palindrome:
        PalindromeChecker checker2 = new PalindromeChecker("helloWorld");
        assertFalse(checker2.check(), "hello should not be a palindrome");

        // Test an empty string:
        PalindromeChecker checker3 = new PalindromeChecker("");
        assertTrue(checker3.check(), "Empty string should be considered a palindrome");

        // Test a palindrome with spaces (v1):
        PalindromeChecker checker4 = new PalindromeChecker("123 321");
        assertTrue(checker4.check(), "123 321 should be a palindrome");

        // Test a palindrome with spaces (V2):
        PalindromeChecker checker5 = new PalindromeChecker("Socorram Me Subi No Onibus Em Marrocos");
        assertTrue(checker5.check(), "'Socorram Me Subi no Onibus em Marrocos' should be a palindrome");

        // Test a non-palindrome with spaces:
        PalindromeChecker checker6 = new PalindromeChecker("not a palindrome");
        assertFalse(checker6.check(), "not a palindrome should not be a palindrome");
    }
}