package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number, factorial = 1;
        System.out.print("Enter a number to get the factorial: ");
        number = scanner.nextInt();
        for (int i = number; i >= 1; i--)
            factorial *= i;
        System.out.printf("factorial of number %d is %d.\n", number, factorial);
    }
}
