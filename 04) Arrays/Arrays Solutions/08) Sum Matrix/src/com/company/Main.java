package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length;
        System.out.print("Enter the length of the matrix : ");
        length = scanner.nextInt();
        int[][] matrix = new int[length][length];
        System.out.print("Enter the elements of the matrix\n");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.printf("Enter element [%d][%d] : ", i, j);
                matrix[i][j] = scanner.nextInt();
            }
        }
        System.out.printf("Sum of the matrix is %d\n", sumMatrix(matrix));
    }

    public static int sumMatrix(int[][] matrix) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++)
            for (int j = 0; j < matrix[i].length; j++)
                sum += matrix[i][j];
        return sum;
    }
}