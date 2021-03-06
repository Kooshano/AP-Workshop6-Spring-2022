package com.company;

public class Parrot extends Bird implements Prey{
    private String parrotSpecialty;

    public Parrot(String name, int age, int heightOfFlight, String parrotSpecialty) {
        super(name, age, heightOfFlight);
        this.parrotSpecialty = parrotSpecialty;
    }

    public void show(){
        System.out.println(getName() + "," + getAge() + "," + getHeightOfFlight() + "," + parrotSpecialty);
    }
}
