package com.company;

class MotorBoat {
    private final int tankCapacity;
    private int tankAmount;
    private final int maximumSpeed;
    private int currentSpeed;
    private final double efficiency;
    private int distanceTraveled;

    MotorBoat(int tankCapacity, int tankAmount, int maximumSpeed, int currentSpeed, double efficiency, int distanceTraveled) {
        this.tankCapacity = tankCapacity;
        this.maximumSpeed = maximumSpeed;
        this.efficiency = efficiency;
        this.distanceTraveled = distanceTraveled;
        if (tankAmount <= tankCapacity)
            this.tankAmount = tankAmount;
        if (currentSpeed <= maximumSpeed)
            this.currentSpeed = currentSpeed;
    }

    public void changeSpeed(int currentSpeed) {
        if (currentSpeed <= maximumSpeed)
            this.currentSpeed = currentSpeed;
    }

    public void operate(int time) {
        if (efficiency * currentSpeed * currentSpeed * time <= tankAmount) {
            distanceTraveled += currentSpeed * time;
            tankAmount -= efficiency * currentSpeed * currentSpeed * time;
        }
        else
            System.out.println("No enough fuel to run the motor boat for the specified time.");
    }

    public void refuel(int tankAmount) {
        if (this.tankAmount + tankAmount <= tankCapacity)
            this.tankAmount += tankAmount;
    }

    public double getEfficiency() {
        return efficiency;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public int getTankAmount() {
        return tankAmount;
    }

    public int getCurrentSpeed() {
        return currentSpeed;
    }
}

public class Main {

    public static void main(String[] args) {
        MotorBoat motorBoat = new MotorBoat(1000, 800, 250, 60, .10, 200);
        motorBoat.operate(2);
        System.out.printf("Current Speed: %d\n", motorBoat.getCurrentSpeed());
        System.out.printf("Motor Efficiency: %.2f\n", motorBoat.getEfficiency());
        System.out.printf("Tank Amount: %d\n", motorBoat.getTankAmount());
        System.out.printf("Distance Traveled: %d\n", motorBoat.getDistanceTraveled());
        motorBoat.refuel(200);
        System.out.printf("Tank Amount: %d\n", motorBoat.getTankAmount());
    }
}