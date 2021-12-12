package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        System.out.print("Enter the index to get it's fibonacci number : ");
        n = scanner.nextInt();
        System.out.printf("Fibonacci number of index %d is %d\n", n, fib(n));
    }

    public static int fib(int n) {
        if (n == 0)
            return 0;
        else if (n == 1)
            return 1;
        return fib(n - 2) + fib(n - 1);
    }
}
