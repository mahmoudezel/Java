package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double average;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();
        System.out.print("Enter the third number: ");
        double number3 = scanner.nextDouble();
        average = (number1 + number2 + number3) / 3;
        System.out.printf("Average is equal to: %.2f", average);
    }
}
