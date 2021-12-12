package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int numberX = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int numberY = scanner.nextInt();
        if (numberX % numberY == 0)
            System.out.printf("number %d is divisible by number %d.\n", numberX, numberY);
        else
            System.out.printf("number %d is not divisible by number %d.\n", numberX, numberY);
    }
}
