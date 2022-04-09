package com.company;

public class Eagle extends Bird implements Hunter{
    String eagleSpecialty;

    public Eagle(String name, int age, int heightOfFlight, String eagleSpecialty) {
        super(name, age, heightOfFlight);
        this.eagleSpecialty = eagleSpecialty;
    }
}
