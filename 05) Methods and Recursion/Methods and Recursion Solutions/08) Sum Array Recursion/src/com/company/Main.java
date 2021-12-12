package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] numbers = new int[length];
        for (int i = 0; i < numbers.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            numbers[i] = scanner.nextInt();
        }
        System.out.printf("The sum of array is %d\n", sum(numbers, numbers.length));
    }

    public static int sum(int[] numbers, int length) {
        if (length == 1)
            return numbers[0];
        else
            return sum(numbers, length - 1) + numbers[length - 1];
    }
}
