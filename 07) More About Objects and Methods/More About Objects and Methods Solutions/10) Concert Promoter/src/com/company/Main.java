package com.company;

class ConcertPromoter {
    private final String bandName;
    private final int capacity;
    private int ticketsSold;
    private double soldByPhonePrice;
    private final double soldAtConcertPrice;
    private double totalSales;

    ConcertPromoter(String bandName, int capacity, double soldByPhonePrice, double soldAtConcertPrice) {
        this.bandName = bandName;
        this.capacity = capacity;
        this.soldByPhonePrice = soldByPhonePrice;
        this.soldAtConcertPrice = soldAtConcertPrice;
        this.ticketsSold = 0;
        this.totalSales = 0;
    }

    public void recordSale(int ticketsSold) {
        if (this.ticketsSold + ticketsSold <= capacity) {
            this.ticketsSold += ticketsSold;
            totalSales += ticketsSold * soldByPhonePrice;
        }
    }

    public void phoneSalesToConcertVenueSales() {
        soldByPhonePrice = soldAtConcertPrice;
    }

    public int getTicketsSold() {
        return ticketsSold;
    }

    public int getRemainingTickets() {
        return capacity - ticketsSold;
    }

    public double getTotalSales() {
        return totalSales;
    }
}

public class Main {

    public static void main(String[] args) {
        ConcertPromoter concertPromoter = new ConcertPromoter("Wegz", 5000, 100, 90);
        concertPromoter.recordSale(200);
        System.out.printf("Tickets Sold: %d\n", concertPromoter.getTicketsSold());
        System.out.printf("Total Sales: %.2f\n", concertPromoter.getTotalSales());
        System.out.printf("Remaining Tickets: %d\n", concertPromoter.getRemainingTickets());
        concertPromoter.phoneSalesToConcertVenueSales();
        concertPromoter.recordSale(1);
        System.out.printf("Total Sales: %.2f\n", concertPromoter.getTotalSales());
    }
}