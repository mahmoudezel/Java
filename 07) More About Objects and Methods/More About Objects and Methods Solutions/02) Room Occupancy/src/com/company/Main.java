package com.company;

class RoomOccupancy {
    private int numberInRoom;
    private static int totalNumber = 0;

    RoomOccupancy() {
        numberInRoom = 0;
    }

    RoomOccupancy(int numberInRoom) {
        this.numberInRoom = numberInRoom;
        totalNumber += numberInRoom;
    }

    public void addOneToRoom() {
        numberInRoom++;
        totalNumber++;
    }

    public void removeOneFromRoom() {
        if (numberInRoom > 0){
            numberInRoom--;
            totalNumber--;
        }
    }

    public int getNumber() {
        return numberInRoom;
    }

    public static int getTotal() {
        return totalNumber;
    }
}

public class Main {

    public static void main(String[] args) {
        RoomOccupancy roomOccupancy1 = new RoomOccupancy(5);
        RoomOccupancy roomOccupancy2 = new RoomOccupancy(10);
        System.out.printf("Number in the first room is: %d\n", roomOccupancy1.getNumber());
        System.out.printf("Total number in the first room and the second room is: %d\n", RoomOccupancy.getTotal());
        roomOccupancy2.removeOneFromRoom();
        System.out.printf("Number in the first room is: %d\n", roomOccupancy2.getNumber());
        System.out.printf("Total number in the first room and the second room is: %d\n", RoomOccupancy.getTotal());
        roomOccupancy1.addOneToRoom();
        System.out.printf("Number in the first room is: %d\n", roomOccupancy1.getNumber());
        System.out.printf("Total number in the first room and the second room is: %d\n", RoomOccupancy.getTotal());
    }
}