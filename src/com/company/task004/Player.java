package com.company.task004;

public class Player {
    private String name;
    private int age;
    private int points;

    public Player(String name, int age, int points) {
        this.name = name;
        this.age = age;
        this.points = points;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }


}
