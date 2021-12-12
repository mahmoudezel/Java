package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[100];
        Arrays.fill(numbers, 101);
        int i = 0;
        do {
            System.out.print("Enter a number (between 1 to 100): ");
            numbers[i++] = scanner.nextInt();
        } while (numbers[i - 1] != 0);
        Arrays.sort(numbers);
        numbers[i] = 0;
        for (i = 1; i < numbers.length; i += count(numbers[i], numbers)) {
            if (numbers[i] == 0)
                break;
            else {
                if (count(numbers[i], numbers) > 1)
                    System.out.printf("%d occurs %d times\n", numbers[i], count(numbers[i], numbers));
                else
                    System.out.printf("%d occurs %d time\n", numbers[i], count(numbers[i], numbers));
            }
        }
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
