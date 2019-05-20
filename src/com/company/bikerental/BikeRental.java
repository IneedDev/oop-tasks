package com.company.bikerental;

public class BikeRental {
    private int days;
    private double profit;

    private static int pontsOfColor(Color color){
        if(color.equals(Color.BLUE)){
            return 250;
        }else if (color.equals(Color.RED)){
            return 500;

        }else return 100;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public double getProfit() {
        return profit;
    }

    public void setProfit(double profit) {
        this.profit = profit;
    }

    public BikeRental() {
    }

    public double orderBike(int days, Color color, boolean frame, double widthOfTire){
        double price;
        int pointsOfColor = pontsOfColor(color);

        if (frame){
            price = days*((pointsOfColor+widthOfTire/3))/20;
        }else {
            price = days*2*((pointsOfColor+widthOfTire/3))/20;
        }profit+=price;

        return price;
    }
}
