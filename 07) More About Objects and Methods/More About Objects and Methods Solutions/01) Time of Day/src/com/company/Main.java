package com.company;

class Time {
    private int hour;
    private int minute;

    Time() {
        setTime(0, 0);
    }

    private boolean isValid(int hour, int minute) {
        return (hour > -1 && hour < 24) && (minute > -1 && minute < 60);
    }

    public void setTime(int hour, int minute) {
        if (isValid(hour, minute)){
            this.hour = hour;
            this.minute = minute;
        }
    }

    public void setTime(int hour, int minute, boolean isAM) {
        if (isValid(hour, minute) && (hour > -1 && hour < 12) == isAM){
            this.hour = hour;
            this.minute = minute;
        }
    }

    public void displayTime() {
        System.out.printf("%d:%d\n", hour, minute);
    }
}

public class Main {

    public static void main(String[] args) {
        Time time = new Time();
        time.setTime(18, 50);
        time.displayTime();
        time.setTime(11, 50,true);
        time.displayTime();
    }
}