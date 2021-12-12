package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int length = scanner.nextInt();
        int[] in = new int[length];
        for (int i = 0; i < in.length; i++) {
            System.out.printf("Enter number %d: ", i + 1);
            in[i] = scanner.nextInt();
        }
        System.out.print("Enter the number you want to remove: ");
        int v = scanner.nextInt();
        in = removeInteger(v, in);
        System.out.print("Array after removing integer: ");
        for (int integer : in)
            System.out.printf("%d, ", integer);
        System.out.println();
    }

    public static int[] removeInteger(int v, int[] in) {
        int length = in.length;
        for (int j : in)
            if (j == v)
                length--;
        int[] out = new int[length];
        for (int i = 0, j = 0; i < in.length; i++)
            if (in[i] != v) {
                out[j] = in[i];
                j++;
            }
        return out;
    }
}
