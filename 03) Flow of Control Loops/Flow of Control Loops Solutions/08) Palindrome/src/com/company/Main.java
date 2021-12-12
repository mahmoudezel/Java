package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String reversedWord = "";
        System.out.print("Enter a word to check palindrome: ");
        String word = scanner.next();
        for (int i = word.length() - 1; i >= 0; i--)
            reversedWord += word.charAt(i);
        if (word.equals(reversedWord))
            System.out.printf("word %s is palindrome.", word);
        else
            System.out.printf("word %s is not palindrome.", word);
    }
}
