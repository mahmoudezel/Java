package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("Enter the length of the array : ");
        length = scanner.nextInt();
        double[] numbers = new double[length];
        System.out.print("Enter the elements of the array\n");
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter element number %d : ", i + 1);
            numbers[i] = scanner.nextDouble();
        }
        System.out.printf("Average of the array is %.2f\n", averageArray(numbers));
    }

    public static double averageArray(double[] numbers) {
        double average;
        double sum = 0;
        for (double number : numbers) sum += number;
        average = sum / numbers.length;
        return average;
    }
}