package com.company;

public class Bird extends Animal implements Prey{
    private int heightOfFlight;

    public Bird(String name, int age, int heightOfFlight) {
        super(name, age);
        this.heightOfFlight = heightOfFlight;
    }

    public int getHeightOfFlight() {
        return heightOfFlight;
    }
}
