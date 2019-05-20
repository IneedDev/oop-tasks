package com.company.task004;

// import Random package

import java.util.Arrays;
import java.util.Random;

public class Lottery {
    private String name;
    private Player[] players;
    private Random rand;

    public Lottery(String name, int numberOfPlayers) {
        this.name = name;
        this.players = new Player[numberOfPlayers];
        this.rand = new Random();
    }

    public void addPlayer (Player player ){
        //check if there are any free slots in array to put player
        for (int i=0; i<players.length; i++){
            //condition checks if there are any free slots to place new player within String[] object
            if (players[i]==null){
                players[i]=player;
                break;
            }
        }

    }
    public Player getWinner(){
        Player winner = players[0];
        for (Player player : players) {
            if(player != null && winner.getPoints() < player.getPoints()){
                winner = player;
            }
        }
        return winner;
    }



    public boolean hasFreeSlot(){
        for (Player player:players ) {
            if (player==null){
                return true;
            }
        }return false;
    }

    public Player getRandomName(){
        return players[rand.nextInt(players.length)];
    }

    @Override
    public String toString() {
        return "Lottery{" +
                "name='" + name + '\'' +
                ", players=" + Arrays.toString(players) +
                ", rand=" + rand +
                '}';
    }
}