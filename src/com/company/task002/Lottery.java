package com.company.task002;

// import Random package
import java.util.Random;

public class Lottery {
    private String name;
    private String[] playernames;
    private Random rand;

    public Lottery(String name, int numberOfPlayers) {
        this.name = name;
        this.playernames = new String[numberOfPlayers];
        this.rand = new Random();
    }

    public void addPlayer (String playername){
        //check if there are any free slots in array to put player
        for (int i=0; i<playernames.length; i++){
            //condition checks if there are any free slots to place new player within String[] object
            if (playernames[i]==null){
                playernames[i]=playername;
                System.out.println("Player "+playername + " was added");
                break;
            }
        }

    }

    public String getRandomName(){
        return playernames[rand.nextInt(playernames.length)];
    }
}
