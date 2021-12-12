package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = 0;
        System.out.print("Enter a number to calculate series sum: ");
        double number = scanner.nextInt();
        for (double i = 1; i <= number; i++)
            sum += 1 / i;
        System.out.printf("Series sum of number %.0f is %.2f.\n", number, sum);
    }
}
