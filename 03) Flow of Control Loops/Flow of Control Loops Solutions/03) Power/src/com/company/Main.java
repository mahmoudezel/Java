package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, power, result = 1;
        System.out.print("Enter a number: ");
        number = scanner.nextInt();
        System.out.print("Enter a power: ");
        power = scanner.nextInt();
        for (int i = 1; i <= power; i++)
            result *= number;
        System.out.printf("number %d raised to power %d is %d.\n", number, power, result);
    }
}
