package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        System.out.printf("Smallest factors of number %d is %s\n", number, smallestFactors(number));
    }

    public static String smallestFactors(int number) {
        int n = 2;
        String smallestFactors = "";
        while (number / n != 0) {
            if (number % n == 0) {
                smallestFactors = smallestFactors + n + ",";
                number /= n;
            } else
                n++;
        }
        smallestFactors = smallestFactors.substring(0, smallestFactors.length() - 1);
        return smallestFactors;
    }
}