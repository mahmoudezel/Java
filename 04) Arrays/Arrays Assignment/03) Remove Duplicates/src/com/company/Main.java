package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] in = {'b', 'd', 'a', 'b', 'f', 'a', 'g', 'a', 'a', 'f'};
        in = removeDuplicates(in);
        System.out.print("Array after removing duplicates: ");
        for (char character : in)
            System.out.printf("%c, ", character);
        System.out.println();
    }
    
    public static char[] removeDuplicates(char[] in) {
        boolean[] duplicates = new boolean[in.length];
        Arrays.fill(duplicates, Boolean.TRUE);
        char[] out;
        int length = 0;
        for (int i = 0; i < duplicates.length; i++)
            for (int j = i + 1; j < duplicates.length; j++)
                if (in[i] == in[j])
                    duplicates[j] = false;
        for (boolean duplicate : duplicates)
            if (duplicate)
                length++;
        out = new char[length];
        for (int i = 0, j = 0; i < duplicates.length; i++)
            if (duplicates[i]){
                out[j] = in[i];
                j++;
            }
        return out;
    }
}
