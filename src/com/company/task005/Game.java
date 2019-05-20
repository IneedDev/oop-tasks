package com.company.task005;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {

        Monster monster = new Monster(10,70,100,"Monster");
        Player player = new Player(10,5,100,"Player");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj liczbę rund");
        int numberOfRounds = scanner.nextInt();

        boolean isDead = false;
        for (int i=1;(i<numberOfRounds && isDead==false);i++){
            player.attackMonster(monster);
            monster.attackPlayer(player);
            System.out.println("Monster " + monster.getDef() + "   player" + player.getDef());
        }
        if (player.getDef()>monster.getDef()){
            System.out.println("The winner is " + player.getName());

        }
    }
}