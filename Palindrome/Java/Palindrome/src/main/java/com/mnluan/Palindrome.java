package com.mnluan;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a string: ");
        String input = scanner.nextLine();
        String string = input.toUpperCase();
        string = string.replace(" ", "");

        PalindromeChecker checker = new PalindromeChecker(string);
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
        //A reverse version of the string stored in the "input" variable is created
        String reversedInput = new StringBuilder(input).reverse().toString();

        //Checks if the reverse string is identical to the original
        return input.equals(reversedInput);
    }
}