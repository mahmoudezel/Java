package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        int n = 2;
        StringBuilder output = new StringBuilder();
        System.out.print("Enter the number : ");
        number = scanner.nextInt();
        while (number / n != 0) {
            if (number % n == 0) {
                output.append(n).append(",");
                number /= n;
            } else
                n++;
        }
        output = new StringBuilder(output.substring(0, output.length() - 1));
        System.out.println(output);
    }
}
