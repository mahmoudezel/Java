package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.print("Enter ten numbers: ");
        String tenNumbers = scanner.nextLine().replaceAll(" ", "");
        for (int i = 0, j = 0; i < numbers.length; i++) {
            if (count(Character.getNumericValue(tenNumbers.charAt(i)), numbers) > 0)
                continue;
            else
                numbers[j++] = Character.getNumericValue(tenNumbers.charAt(i));
        }
        System.out.printf("The number of distinct number is %d\n", numbers.length - count(0, numbers));
        System.out.print("The distinct numbers are: ");
        for (int number : numbers) {
            if (number == 0)
                break;
            System.out.printf("%d ", number);
        }
        System.out.println();
    }

    public static int count(int number, int[] numbers) {
        int count = 0;
        for (int i : numbers) {
            if (i == number)
                count++;
        }
        return count;
    }
}
