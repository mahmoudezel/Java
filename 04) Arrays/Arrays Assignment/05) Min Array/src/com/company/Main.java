package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < array.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            array[i] = scanner.nextInt();
            if (min > array[i])
                min = array[i];
        }
        System.out.printf("Minimum of array is %d.\n", min);
    }
}
