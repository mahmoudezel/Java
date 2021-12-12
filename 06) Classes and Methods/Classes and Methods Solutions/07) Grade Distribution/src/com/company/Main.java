package com.company;

class GradeDistribution {
    private final int A;
    private final int B;
    private final int C;
    private final int D;
    private final int F;

    GradeDistribution(int A, int B, int C, int D, int F) {
        this.A = A;
        this.B = B;
        this.C = C;
        this.D = D;
        this.F = F;
    }

    public int totalGradesNumber() {
        return A + B + C + D + F;
    }

    public double percentage(int grade) {
        return ((double) grade / totalGradesNumber()) * 100;
    }

    public void graphDistribution() {
        String pattern = "|";
        System.out.print("\t");
        for (int i = 0; i <= 100; i += 10) {
            System.out.printf("%-10d", i);
        }
        System.out.println();
        System.out.print("\t");
        for (int i = 0; i <= 100; i += 10) {
            System.out.printf("%-10s", pattern);
        }
        System.out.println();
        System.out.print("A\t ");
        for (int i = 0; i < A; i += 2) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.print("B\t ");
        for (int i = 0; i < B; i += 2) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.print("C\t ");
        for (int i = 0; i < C; i += 2) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.print("D\t ");
        for (int i = 0; i < D; i += 2) {
            System.out.print("* ");
        }
        System.out.println();
        System.out.print("F\t ");
        for (int i = 0; i < F; i += 2) {
            System.out.print("* ");
        }
        System.out.println();
    }
}

public class Main {

    public static void main(String[] args) {
        int A = 10, B = 5, C = 20, D = 40, F = 20;
        GradeDistribution gradeDistribution = new GradeDistribution(A, B, C, D, F);
        System.out.println(gradeDistribution.totalGradesNumber());
        System.out.printf("%.2f\n", gradeDistribution.percentage(A));
        gradeDistribution.graphDistribution();
    }
}
