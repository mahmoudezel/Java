package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String word = scanner.next();
        if (isPalindrome(word))
            System.out.println("The word is palindrome.");
        else
            System.out.println("The word is not palindrome.");
    }

    public static boolean isPalindrome(String word) {
        if (word.length() == 1)
            return true;
        else if (Character.toLowerCase(word.charAt(0)) != Character.toLowerCase(word.charAt(word.length() - 1)))
            return false;
        else
            return isPalindrome(word.substring(1, word.length() - 1));
    }
}
