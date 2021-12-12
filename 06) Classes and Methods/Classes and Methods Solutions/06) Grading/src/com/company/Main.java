package com.company;

class Grading {
    private double quiz1;
    private double quiz2;
    private double midtermExam;
    private double finalExam;

    Grading(double quiz1, double quiz2, double midtermExam, double finalExam) {
        if (quiz1 >= 0 && quiz1 <= 10)
            this.quiz1 = quiz1;
        if (quiz2 >= 0 && quiz2 <= 10)
            this.quiz2 = quiz2;
        if (midtermExam >= 0 && midtermExam <= 100)
            this.midtermExam = midtermExam;
        if (finalExam >= 0 && finalExam <= 100)
            this.finalExam = finalExam;
    }

    public void displayStudentRecord() {
        double totalScore = 0;
        totalScore += (quiz1 + quiz2) * 1.25;
        totalScore += midtermExam * .25;
        totalScore += finalExam * .5;
        System.out.printf("Quiz 1: %.2f\tQuiz 2: %.2f\tMidterm: %.2f\tFinal: %.2f\tTotal Score: %.2f\tGrade: %s\n",
                quiz1, quiz2, midtermExam, finalExam, totalScore, getGrade(totalScore));
    }

    public static char getGrade(double totalScore) {
        if (totalScore >= 90)
            return 'A';
        else if (totalScore >= 80)
            return 'B';
        else if (totalScore >= 70)
            return 'C';
        else if (totalScore >= 60)
            return 'D';
        else
            return 'F';
    }
}

public class Main {

    public static void main(String[] args) {
        Grading student = new Grading(8, 9, 70, 80);
        student.displayStudentRecord();
    }
}
