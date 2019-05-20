package com.company.task003;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        // Lottery lottery = new Lottery("Lottery Name",arrayPlayers);

        Scanner scanner = new Scanner(System.in);

        Lottery lottery = new Lottery("Lottery Name",2);

        while(lottery.hasFreeSlot()){
            System.out.println("Give player name: ");
            String name = scanner.nextLine();

            System.out.println("Give player age: ");
            int age = Integer.parseInt(scanner.nextLine());

            System.out.println("Give player points: ");
            int points = Integer.parseInt(scanner.nextLine());

            // based on input first we create player and than put it into addPlayer method

            Player player = new Player(name,age,points);
            lottery.addPlayer(player);
        }

        System.out.println(lottery.getWinner().getName());
    }
}
