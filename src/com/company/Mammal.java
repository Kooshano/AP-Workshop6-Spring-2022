package com.company;

public abstract class Mammal extends Animal{
    int speed;

    public Mammal(String name, int age, int speed) {
        super(name, age);
        this.speed = speed;
    }
}
