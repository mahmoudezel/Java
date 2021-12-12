package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double DegreesC, DegreesF;
        System.out.print("Enter a temperature: ");
        double degree = scanner.nextDouble();
        System.out.print("Enter a C for Celsius or F for Fahrenheit: ");
        char temperature = scanner.next().charAt(0);
        if (temperature == 'F' || temperature == 'f'){
            DegreesC = 5 * (degree - 32) / 9;
            System.out.printf("%.0f degrees Fahrenheit is %.1f degrees Celsius.\n", degree, DegreesC);
        }
        else if (temperature == 'C' || temperature == 'c'){
            DegreesF = 9 * (degree / 5) + 32;
            System.out.printf("%.0f degrees Celsius is %.1f degrees Fahrenheit.\n", degree, DegreesF);
        }
        else
            System.out.print("You Entered invalid temperature degree.\n");
    }
}
