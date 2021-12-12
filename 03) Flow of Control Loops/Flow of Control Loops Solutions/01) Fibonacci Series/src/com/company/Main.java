package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number1 = 0, number2 = 1;
        System.out.print("Enter the number to print fibonacci series: ");
        int N = scanner.nextInt();
        for (int i = 0; i < N; i++){
            System.out.print(number1 + " ");
            int number3 = number2 + number1;
            number1 = number2;
            number2 = number3;
        }
    }
}
