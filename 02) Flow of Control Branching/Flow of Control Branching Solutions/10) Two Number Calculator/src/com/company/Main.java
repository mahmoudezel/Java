package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double number1, number2, result = 0;
        System.out.print("Enter number 1: ");
        number1 = scanner.nextDouble();
        System.out.print("Enter number 2: ");
        number2 = scanner.nextDouble();
        System.out.print("Enter the operation (+ - / *): ");
        char operation = scanner.next().charAt(0);
        switch (operation){
            case '+':
                result = number1 + number2;
                break;
            case '-':
                result = number1 - number2;
                break;
            case '/':
                result = number1 / number2;
                break;
            case '*':
                result = number1 * number2;
                break;
            default:
                System.out.print("Please enter valid operation (+ - / *).\n");
        }
        System.out.printf("%.1f %c %.1f = %.1f\n", number1, operation, number2, result);
    }
}
