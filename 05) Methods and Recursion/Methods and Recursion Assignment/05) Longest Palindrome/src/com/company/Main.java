package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Enter the string : ");
        word = scanner.nextLine();
        System.out.printf("The longest palindrome in the string %s is %s\n", word, findLongestPalindrome(word));
    }

    public static String findLongestPalindrome(String word) {
        String substring = "";
        String longestPalindrome = "";
        for (int i = 0; i < word.length(); i++) {
            for (int j = i; j < word.length(); j++) {
                substring += word.charAt(j);
                if (isPalindrome(substring) && longestPalindrome.length() < substring.length())
                    longestPalindrome = substring;
            }
            substring = "";
        }
        return longestPalindrome;
    }

    public static boolean isPalindrome(String word) {
        String inversedWord = "";
        for (int i = word.length() - 1; i >= 0; i--)
            inversedWord += word.charAt(i);
        return word.equals(inversedWord);
    }
}