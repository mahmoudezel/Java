package com.company;

public class Main {

    public static void main(String[] args) {
        int startRight = 0, endSpace = 7;
        for (int i = 1; i <= 128; i += i) {
            for (int j = 0; j < endSpace; j++)
                System.out.print("    ");
            for (int l = 1; l <= i; l += l)
                System.out.printf("%4d", l);
            for (int r = startRight; r > 0 ; r /= 2 )
                System.out.printf("%4d", r);
            System.out.println();
            endSpace--;
            startRight = i;
        }
    }
}
