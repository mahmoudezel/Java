package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] board = new char[3][3];
        char xPlayer = 'X', oPlayer = 'O';
        int row, column;
        printBoard(board);
        do {
            System.out.print("Enter a row (0, 1, or 2) for player X: ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player X: ");
            column = scanner.nextInt();
            board[row][column] = 'X';
            printBoard(board);
            if (win(board, xPlayer)) {
                System.out.println("X player won");
                break;
            }
            if (completeBoard(board)) {
                System.out.println("Draw");
                break;
            }
            System.out.print("Enter a row (0, 1, or 2) for player O: ");
            row = scanner.nextInt();
            System.out.print("Enter a column (0, 1, or 2) for player O: ");
            column = scanner.nextInt();
            board[row][column] = 'O';
            printBoard(board);
            if (win(board, oPlayer)) {
                System.out.println("O player won");
                break;
            }
            if (completeBoard(board)) {
                System.out.println("Draw");
                break;
            }
        } while (true);
    }

    public static void printBoard(char[][] board) {
        for (char[] chars : board) {
            System.out.println("—————————————");
            System.out.print("|");
            for (char c : chars) {
                if (c == '\u0000')
                    System.out.print("   ");
                else
                    System.out.printf(" %c ", c);
                System.out.print("|");
            }
            System.out.println();
        }
        System.out.println("—————————————");
    }

    public static boolean win(char[][] board, char player) {
        if (board[0][0] == player && board[0][1] == player && board[0][2] == player)
            return true;
        else if (board[1][0] == player && board[1][1] == player && board[1][2] == player)
            return true;
        else if (board[2][0] == player && board[2][1] == player && board[2][2] == player)
            return true;
        else if (board[0][0] == player && board[1][0] == player && board[2][0] == player)
            return true;
        else if (board[0][1] == player && board[1][1] == player && board[2][1] == player)
            return true;
        else if (board[0][2] == player && board[1][2] == player && board[2][2] == player)
            return true;
        else if (board[0][0] == player && board[1][1] == player && board[2][2] == player)
            return true;
        else return board[0][2] == player && board[1][1] == player && board[2][0] == player;
    }

    public static boolean completeBoard(char[][] board) {
        for (char[] chars : board) {
            for (char c : chars) {
                if (c == '\u0000')
                    return false;
            }
        }
        return true;
    }
}
