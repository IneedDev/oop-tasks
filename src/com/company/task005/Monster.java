package com.company.task005;

import java.util.Random;

public class Monster {

    private int attack;
    private int chanceToAttack;
    private int def;
    private String name;
    private Random random;

    public Monster(int attack, int chanceToAttack, int def, String name) {
        this.attack = attack;
        this.chanceToAttack = chanceToAttack;
        this.def = def;
        this.name = name;
        this.random = new Random();
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getChanceToAttack() {
        return chanceToAttack;
    }

    public void setChanceToAttack(int chanceToAttack) {
        this.chanceToAttack = chanceToAttack;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void attackPlayer (Player player){
        int hit = random.nextInt(100);
        if (hit<=chanceToAttack){
            player.setDef(player.getDef()-attack);
        }
    }
}
