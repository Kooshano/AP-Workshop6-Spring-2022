package com.company;

public class Parrot extends Bird implements Prey{
    String parrotSpecialty;

    public Parrot(String name, int age, int heightOfFlight, String parrotSpecialty) {
        super(name, age, heightOfFlight);
        this.parrotSpecialty = parrotSpecialty;
    }
}
