package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int temp;
        System.out.print("Enter integer number 1 : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter integer number 2 : ");
        int number2 = scanner.nextInt();
        System.out.print("Enter integer number 3 : ");
        int number3 = scanner.nextInt();
        if (number1 > number2) {
            temp = number1;
            number1 = number2;
            number2 = temp;
        }
        if (number1 > number3) {
            temp = number1;
            number1 = number3;
            number3 = temp;
        }
        if (number2 > number3) {
            temp = number2;
            number2 = number3;
            number3 = temp;
        }
        System.out.printf("Numbers after sort\n%d  %d  %d\n", number1, number2, number3);
    }
}
