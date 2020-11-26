package com.labs.oop;

public class Doctor extends Operations_Staff{
    public String[] specialty;
    public String[] locations;

    public Doctor(String[] specialty, String[] locations){
        super();
        this.specialty = specialty;
        this.locations = locations;
    }

}
