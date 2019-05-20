package com.company.task001;

// import Random package
import java.util.Random;

public class Lottery {
    private String name;
    private String[] playernames;
    private Random rand;

    // creates constructor which String[] object as argument
    public Lottery(String name, String[] playernames) {
        this.name = name;
        this.playernames = playernames;
        this.rand = new Random();
    }

    public String getRandomName(){
        return playernames[rand.nextInt(playernames.length)];
    }
}