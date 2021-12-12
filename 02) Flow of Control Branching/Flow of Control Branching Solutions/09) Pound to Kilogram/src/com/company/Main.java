package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double pound, kilogram;
        System.out.print("Enter a (P) to convert from Pound to Kilogram \n" +
                "or (K) to convert from Kilogram to Pound: ");
        char weight = scanner.next().charAt(0);
        switch (weight){
            case 'P':
            case 'p':
                System.out.print("Enter the weight in Pound: ");
                pound = scanner.nextDouble();
                kilogram = 0.45359237 * pound;
                System.out.printf("%.2f in Pound is equal to %.2f in Kilogram.\n", pound, kilogram);
                break;
            case 'K':
            case 'k':
                System.out.print("Enter the weight in kilogram: ");
                kilogram = scanner.nextDouble();
                pound = kilogram / 0.45359237;
                System.out.printf("%.2f in Kilogram is equal to %.2f in Pound.\n", kilogram, pound);
                break;
            default:
                System.out.print("Please enter valid character (P or K).\n");
        }
    }
}
