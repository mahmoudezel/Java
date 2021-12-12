package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] answers = new char[2][10];
        char[] keys = {'A', 'B', 'D', 'A', 'C', 'B', 'D', 'A', 'B', 'D'};
        int correctAnswers = 0;
        System.out.print("Enter the answers of the students\n");
        for (int i = 0; i < answers.length; i++) {
            System.out.printf("Enter the answers of the student number %d\n", i + 1);
            for (int j = 0; j < answers[i].length; j++) {
                System.out.printf("Enter answer for question number %d : ", j + 1);
                answers[i][j] = scanner.next().charAt(0);
            }
            System.out.println();
        }
        for (int i = 0; i < answers.length; i++) {
            for (int j = 0; j < answers[i].length; j++) {
                if (answers[i][j] == keys[j])
                    correctAnswers++;
            }
            System.out.printf("Student number %d answered %d question correctly\n", i + 1, correctAnswers);
            correctAnswers = 0;
        }
    }
}