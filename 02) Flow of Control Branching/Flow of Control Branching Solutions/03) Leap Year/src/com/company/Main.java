package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0 ))
            System.out.printf("%d   Leap Year\n", year);
        else
            System.out.printf("%d   NOT a Leap Year\n", year);
    }
}
