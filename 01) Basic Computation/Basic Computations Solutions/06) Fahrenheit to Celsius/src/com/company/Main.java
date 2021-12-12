package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a temperature in degrees Fahrenheit: ");
        double DegreesF = scanner.nextDouble();
        double DegreesC = 5 * (DegreesF - 32) / 9;
        System.out.printf("%.0f degrees Fahrenheit is %.1f degrees Celsius.\n", DegreesF, DegreesC);
    }
}
