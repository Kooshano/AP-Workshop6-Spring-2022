package com.company;

public class Cheetah extends Mammal implements Hunter{
    String cheetahSpecialty;

    public Cheetah(String name, int age, int speed, String cheetahSpecialty) {
        super(name, age, speed);
        this.cheetahSpecialty = cheetahSpecialty;
    }
}
