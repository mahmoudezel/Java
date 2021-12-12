package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n;
        System.out.print("Enter the number to get sum of digits : ");
        n = scanner.nextLong();
        System.out.printf("Sum of digits of number %d is %d\n", n, sumDigits(n));
    }

    public static int sumDigits(long n) {
        int sum = 0;
        while (n != 0) {
            long reminder = n % 10;
            sum += (int) reminder;
            n /= 10;
        }
        return sum;
    }
}