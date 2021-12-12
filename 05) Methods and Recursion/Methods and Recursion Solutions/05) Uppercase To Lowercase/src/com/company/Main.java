package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char upperCase;
        char lowerCase;
        System.out.print("Enter the character in uppercase : ");
        upperCase = scanner.next().charAt(0);
        lowerCase = toLowerCase(upperCase);
        System.out.printf("%c\n", lowerCase);
    }

    public static char toLowerCase(char userUpperCase) {
        char[] lowerCase = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k'
                , 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        char[] upperCase = new char[]{'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K'
                , 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        for (int i = 0; i < upperCase.length; i++) {
            if (upperCase[i] == userUpperCase)
                return lowerCase[i];
        }
        return 0;
    }
}