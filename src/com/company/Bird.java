package com.company;

public abstract class Bird extends Animal {
    int heightOfFlight;

    public Bird(String name, int age, int heightOfFlight) {
        super(name, age);
        this.heightOfFlight = heightOfFlight;
    }
}
