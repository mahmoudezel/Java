package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a three-digit integer: ");
        int threeDigit = scanner.nextInt();
        if (threeDigit % 10 == threeDigit / 100)
            System.out.printf("%d is palindrome!\n", threeDigit);
        else
            System.out.printf("%d is not palindrome!\n", threeDigit);
    }
}
