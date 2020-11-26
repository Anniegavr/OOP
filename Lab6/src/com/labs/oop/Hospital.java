package com.labs.oop;

public class Hospital {
    protected String name;
    protected String address;
    protected double phoneNumber;
    protected Object[] Department = new Department[];

    public Hospital(String name, String address, int phoneNumber, Object[] Department){
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }


}
