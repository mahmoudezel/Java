package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows of the pyramid: ");
        int rows = scanner.nextInt();
        for (int i = 1; i <= rows; i++){
            for (int j = rows - i; j >= 1; j--)
                System.out.print("    ");
            for (int j = i; j >= 1; j--)
                System.out.printf("%4d", j);
            for (int j = 2; j <= i; j++)
                System.out.printf("%4d", j);
            System.out.println();
        }
    }
}
