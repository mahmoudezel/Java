package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the year: ");
        int year = scanner.nextInt();
        System.out.print("Enter the first day of the year: ");
        int firstDayYear = scanner.nextInt();
        String firstDayMonth = "";
        for (int i = 1; i <= 12; i++) {
            switch (firstDayYear) {
                case 0:
                    firstDayMonth = "Sunday\n";
                    break;
                case 1:
                    firstDayMonth = "Monday\n";
                    break;
                case 2:
                    firstDayMonth = "Tuesday\n";
                    break;
                case 3:
                    firstDayMonth = "Wednesday\n";
                    break;
                case 4:
                    firstDayMonth = "Thursday\n";
                    break;
                case 5:
                    firstDayMonth = "Friday\n";
                    break;
                case 6:
                    firstDayMonth = "Saturday\n";
                    break;
            }
            switch (i) {
                case 1:
                    System.out.printf("January 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 2:
                    System.out.printf("February 1, %d, is %s", year, firstDayMonth);
                    if (year % 4 == 0 && (year % 400 == 0 || year % 100 != 0))
                        firstDayYear = (firstDayYear + 29) % 7;
                    else
                        firstDayYear = (firstDayYear + 28) % 7;
                    break;
                case 3:
                    System.out.printf("March 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 4:
                    System.out.printf("April 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 30) % 7;
                    break;
                case 5:
                    System.out.printf("May 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 6:
                    System.out.printf("June 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 30) % 7;
                    break;
                case 7:
                    System.out.printf("July 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 8:
                    System.out.printf("August 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 9:
                    System.out.printf("September 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 30) % 7;
                    break;
                case 10:
                    System.out.printf("October 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
                case 11:
                    System.out.printf("November 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 30) % 7;
                    break;
                case 12:
                    System.out.printf("December 1, %d, is %s", year, firstDayMonth);
                    firstDayYear = (firstDayYear + 31) % 7;
                    break;
            }
        }
    }
}
