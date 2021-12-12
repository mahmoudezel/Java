package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the date in the corresponding format (mm/dd/yyyy): ");
        String date = scanner.next();
        int day = Integer.parseInt(date.split("/")[1]);
        int month = Integer.parseInt(date.split("/")[0]);
        int year = Integer.parseInt(date.split("/")[2]);
        if ((day > 31) || (day < 1) || (month > 12) || (month < 1) || (year > 2021) || (year < 1))
            System.out.print("The entered date is invalid.\n");
        else if (((day > 30) && (month == 4 || month == 6 || month == 9 || month == 11)) || ((day > 29) && (month == 2)))
            System.out.print("The entered date is invalid.\n");
        else if ((day > 28) && (month == 2) && !(year % 4 == 0 && (year % 400 == 0 || year % 100 != 0 )))
            System.out.print("The entered date is invalid.\n");
        else
            System.out.print("The entered date is valid.\n");
    }
}
