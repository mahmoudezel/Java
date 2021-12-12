
package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("Enter the number of employees : ");
        length = scanner.nextInt();
        int[][] employeeHours = new int[length][7];
        int[] weeklyHours = new int[length];
        for (int i = 0; i < employeeHours.length; i++) {
            System.out.printf("Enter the number of hours of the week for employee number %d\n", i + 1);
            for (int j = 0; j < employeeHours[i].length; j++) {
                System.out.printf("Enter the number of hours of day %d : ", j + 1);
                employeeHours[i][j] = scanner.nextInt();
            }
            System.out.println();
        }
        for (int i = 0; i < employeeHours.length; i++) {
            for (int j = 0; j < employeeHours[i].length; j++) {
                weeklyHours[i] += employeeHours[i][j];
            }
            System.out.printf("Weekly hours for employee number %d is %d\n", i + 1, weeklyHours[i]);
        }
    }
}