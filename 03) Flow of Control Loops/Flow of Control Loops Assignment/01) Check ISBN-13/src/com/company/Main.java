package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first 12 digits of an ISBN-13 as a string: ");
        String ISBN12 = scanner.next();
        int ISBN13 = 0;
        if (ISBN12.length() == 12) {
            for (int i = 0; i < ISBN12.length(); i++) {
                int d = Integer.parseInt(String.valueOf(ISBN12.charAt(i)));
                if (i % 2 == 0)
                    ISBN13 += d;
                else
                    ISBN13 += 3 * d;
            }
        ISBN13 = 10 - ISBN13 % 10;
        if (ISBN13 == 10)
            ISBN12 += 0;
        else
            ISBN12 += ISBN13;
        System.out.printf("The ISBN-13 number is %s\n", ISBN12);
    }
        else
            System.out.printf("%s is an invalid input\n", ISBN12);
    }
}
