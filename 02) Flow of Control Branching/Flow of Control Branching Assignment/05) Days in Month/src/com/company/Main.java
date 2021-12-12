package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the month: ");
        int month = scanner.nextInt();
        switch (month) {
            case 1:
                System.out.printf("January %d had 31 days\n", year);
                break;
            case 2:
                if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
                    System.out.printf("February %d had 29 days\n", year);
                else
                    System.out.printf("February %d had 28 days\n", year);
                break;
            case 3:
                System.out.printf("March %d had 31 days\n", year);
                break;
            case 4:
                System.out.printf("April %d had 30 days\n", year);
                break;
            case 5:
                System.out.printf("May %d had 31 days\n", year);
                break;
            case 6:
                System.out.printf("June %d had 30 days\n", year);
                break;
            case 7:
                System.out.printf("July %d had 31 days\n", year);
                break;
            case 8:
                System.out.printf("August %d had 31 days\n", year);
                break;
            case 9:
                System.out.printf("September %d had 30 days\n", year);
                break;
            case 10:
                System.out.printf("October %d had 31 days\n", year);
                break;
            case 11:
                System.out.printf("November %d had 30 days\n", year);
                break;
            case 12:
                System.out.printf("December %d had 31 days\n", year);
                break;
            default:
                System.out.println("Invalid month");
        }
    }
}
