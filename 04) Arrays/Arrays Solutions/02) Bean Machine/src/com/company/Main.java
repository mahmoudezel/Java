package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of balls to drop: ");
        int balls = scanner.nextInt();
        System.out.print("Enter the number of slots in the bean machine: ");
        int slots = scanner.nextInt();
        int[] slot = new int[slots];
        for (int i = 0; i < balls; i++) {
            String path = scanner.next();
            slot[countR(path)]++;
        }
        for (int row = max(slot); row >= 1; row--) {
            for (int i = 0; i < slots; i++)
                if (slot[i] >= row)
                    System.out.print("O");

                else
                    System.out.print(" ");
            System.out.println();
        }
    }

    public static int countR(String path) {
        int count = 0;
        for (int i = 0; i < path.length(); i++)
            if (path.charAt(i) == 'R')
                count++;
        return count;
    }

    public static int max(int[] slot) {
        int max = Integer.MIN_VALUE;
        for (int j : slot)
            if (max < j)
                max = j;
        return max;
    }
}
