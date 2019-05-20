package com.company.task005;

import java.util.Random;

public class Player {

    private int anttack;
    private int chanceToCriticalAttack;
    private int def;
    private String name;
    private Random random;

    public int getAnttack() {
        return anttack;
    }

    public void setAnttack(int anttack) {
        this.anttack = anttack;
    }

    public int getChanceToCriticalAttack() {
        return chanceToCriticalAttack;
    }

    public void setChanceToCriticalAttack(int chanceToCriticalAttack) {
        this.chanceToCriticalAttack = chanceToCriticalAttack;
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

    public Random getRandom() {
        return random;
    }

    public void setRandom(Random random) {
        this.random = random;
    }

    public Player(int anttack, int chanceToCriticalAttack, int def, String name) {
        this.anttack = anttack;
        this.chanceToCriticalAttack = chanceToCriticalAttack;
        this.def = def;
        this.name = name;
        this.random = new Random();
    }

    public void attackMonster (Monster monster){
        int hit = random.nextInt(100);
        if (hit <= chanceToCriticalAttack){
            monster.setDef(0);
        }else {
            monster.setDef(monster.getDef()-anttack);
        }

    }


}
