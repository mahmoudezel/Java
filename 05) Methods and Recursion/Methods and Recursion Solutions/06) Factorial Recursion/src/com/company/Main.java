package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        System.out.printf("%d! = %d\n", number, factorial(number));
    }

    private static int factorial(int number) {
        return number == 0 ? 1 : factorial(number - 1) * number;
    }
}
