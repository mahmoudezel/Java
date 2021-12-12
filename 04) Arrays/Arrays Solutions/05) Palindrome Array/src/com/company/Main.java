package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[] a = new char[80];
        int i = 0;
        int exit = 1;
        do {
            System.out.print("Enter the character (press 0 to exit): ");
            a[i] = scanner.next().charAt(0);
            if (a[i] == '0')
                exit = Character.getNumericValue(a[i]);
            i++;
        } while (exit != 0);
        System.out.println(isPalindrome(a, i));
    }

    public static boolean isPalindrome(char[] a, int used) {
        String word = "", inversedWord = "";
        for (int i = 0; i < used - 1; i++)
            word += Character.toLowerCase(a[i]);
        for (int i = word.length() - 1; i >= 0; i--)
            inversedWord += word.charAt(i);
        return word.equals(inversedWord);
    }
}
