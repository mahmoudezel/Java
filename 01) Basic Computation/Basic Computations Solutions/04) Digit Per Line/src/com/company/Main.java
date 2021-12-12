package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the four-digit integer: ");
        int fourDigitInt = scanner.nextInt();
        int reminder = fourDigitInt / 1000;
        fourDigitInt = fourDigitInt % 1000;
        System.out.printf("%d\n", reminder);
        reminder = fourDigitInt / 100;
        fourDigitInt = fourDigitInt % 100;
        System.out.printf("%d\n", reminder);
        reminder = fourDigitInt / 10;
        fourDigitInt = fourDigitInt % 10;
        System.out.printf("%d\n", reminder);
        reminder = fourDigitInt;
        System.out.printf("%d\n", reminder);
    }
}
