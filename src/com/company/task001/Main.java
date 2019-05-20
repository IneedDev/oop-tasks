package com.company.task001;

public class Main {

    public static void main(String[] args) {

        String[] arrayPlayers = {"Paul", "John","Helmut"};
        Lottery lottery = new Lottery("Lottery Name",arrayPlayers);

        System.out.println(lottery.getRandomName());

    }
}
