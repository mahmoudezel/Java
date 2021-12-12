package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the four-char string: ");
        String fourCharString = scanner.nextLine();
        System.out.printf("%c\n", fourCharString.charAt(0));
        System.out.printf("%c\n", fourCharString.charAt(1));
        System.out.printf("%c\n", fourCharString.charAt(2));
        System.out.printf("%c\n", fourCharString.charAt(3));
    }
}
