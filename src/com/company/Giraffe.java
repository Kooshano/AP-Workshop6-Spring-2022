package com.company;

public class Giraffe extends Mammal implements Prey{
    String giraffeSpeciality;

    public Giraffe(String name, int age, int speed, String giraffeSpeciality) {
        super(name, age, speed);
        this.giraffeSpeciality = giraffeSpeciality;
    }

    @Override
    public String toString() {
        return "";
    }
}
