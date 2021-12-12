package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the weight in pound: ");
        double pound = scanner.nextDouble();
        double kilogram = pound / 2.20462;
        System.out.printf("Weight in kilogram is %.2f\n", kilogram);
    }
}
