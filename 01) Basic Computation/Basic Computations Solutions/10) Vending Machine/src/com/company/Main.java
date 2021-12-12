package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter price of item \n(from 25 cents to a dollar, in 5-cent increments): ");
        int buyAmount = scanner.nextInt();
        int reminder = 100 - buyAmount;
        int quarter = reminder / 25;
        reminder = reminder - quarter * 25;
        int dimes = reminder / 10;
        reminder = reminder - dimes * 10;
        int nickel = reminder / 5;
        System.out.printf("You bought an item for %d cents and gave me a dollar,\n" +
                "so your change is\n" +
                "%d quarters,\n" +
                "%d dimes, and\n" +
                "%d nickel.\n",buyAmount, quarter, dimes, nickel);
    }
}
