package com.company.task002;

public class Main {

    public static void main(String[] args) {

        // Lottery lottery = new Lottery("Lottery Name",arrayPlayers);

        Lottery lottery = new Lottery("Lottery Name",4);

        lottery.addPlayer("Adam");
        lottery.addPlayer("John");
        lottery.addPlayer("Felix");
        lottery.addPlayer("Mike");


        System.out.println("The winner is " + lottery.getRandomName());

    }
}