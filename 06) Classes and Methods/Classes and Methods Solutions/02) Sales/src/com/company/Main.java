package com.company;

class Sales {
    private int numberSold;
    private double totalSales;
    private double totalDiscounts;
    private final double costPerItem;
    private final int bulkQuantity;
    private final double bulkDiscountPer;

    Sales(double costPerItem, int bulkQuantity, double bulkDiscountPer){
        this.numberSold = 0;
        this.totalSales = 0;
        this.totalDiscounts = 0;
        this.costPerItem = costPerItem;
        this.bulkQuantity = bulkQuantity;
        this.bulkDiscountPer = bulkDiscountPer;
    }

    public void registerSale(int n){
        numberSold += n;
        if (n >= bulkQuantity) {
            totalDiscounts += bulkDiscountPer * costPerItem * n;
            totalSales = totalSales + n * costPerItem - totalDiscounts;
        } else
            totalSales = totalSales + n * costPerItem;

    }

    public void displaySales(){
        System.out.printf("Number Sold: %d\nTotal Sales: %.2f\nTotal Discounts: %.2f\n", numberSold, totalSales, totalDiscounts);
    }
}

public class Main {

    public static void main(String[] args) {
        Sales remote = new Sales(5, 20, .1);
        remote.registerSale(20);
        remote.displaySales();
    }
}
