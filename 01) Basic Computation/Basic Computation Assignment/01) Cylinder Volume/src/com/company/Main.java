package com.company;

import java.util.Scanner;

import static java.lang.Math.PI;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of cylinder: ");
        double radius = scanner.nextDouble();
        System.out.print("Enter the length of cylinder: ");
        double length = scanner.nextDouble();
        double area = radius * radius * PI;
        double volume = area * length;
        System.out.printf("Volume is %.2f\n", volume);
    }
}
