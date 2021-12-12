package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        if (number >= 1 && number <= 1000)
            System.out.printf("number %d is between 1 and 1000.\n", number);
        else
            System.out.printf("number %d is not between 1 and 1000.\n", number);
    }
}
