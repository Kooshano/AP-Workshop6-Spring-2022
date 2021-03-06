package com.company;

public class Eagle extends Bird implements Hunter{
    private String eagleSpecialty;

    public Eagle(String name, int age, int heightOfFlight, String eagleSpecialty) {
        super(name, age, heightOfFlight);
        this.eagleSpecialty = eagleSpecialty;
    }

    public void show(){
        System.out.println(getName() + "," + getAge() + "," + getHeightOfFlight() + "," + eagleSpecialty);
    }

    @Override
    public void hunt(String prey) {
        System.out.println(getName() + " hunted " + prey);
    }
}
