package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many numbers will you enter?");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        int sum = 0;
        System.out.println("Enter 4 integers, one per line: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextInt();
            sum += numbers[i];
        }
        System.out.printf("The sum is %d.", sum);
        System.out.println("The numbers are: ");
        for (int number : numbers) System.out.printf("%d, which is %.4f of the sum.\n", number,  ((double) number / sum) * 100);
    }
}
