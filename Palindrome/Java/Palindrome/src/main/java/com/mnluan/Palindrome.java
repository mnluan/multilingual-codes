package com.mnluan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();

        PalindromeChecker checker = new PalindromeChecker(input);
        boolean isPalindrome = checker.check();

        if (isPalindrome) {
            System.out.println("The string '" + input + "' is a palindrome.");
        } else {
            System.out.println("The string '" + input + "' is not a palindrome.");
        }
    }
}

class PalindromeChecker {
    private final String input;

    public PalindromeChecker(String input) {
        this.input = input;
    }

    public boolean check() {
        // Remove all spaces from the input string
        String inputWithoutSpaces = input.replaceAll("\\s+", "");

        // A reverse version of the string stored in the "inputWithoutSpaces" variable is created
        String reversedInput = new StringBuilder(inputWithoutSpaces).reverse().toString();

        // Converts both the input without spaces and reversed strings to uppercase before comparison
        String upperCaseInput = inputWithoutSpaces.toUpperCase();
        String upperCaseReversedInput = reversedInput.toUpperCase();

        // Checks if the reverse string (in uppercase) is identical to the original (in uppercase)
        return upperCaseInput.equals(upperCaseReversedInput);
    }
}