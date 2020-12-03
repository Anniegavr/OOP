package com.labs.oop;

public class Cube implements GeometricBody{
    private double side;

    Cube(double side){
        this.side = side;
    }

    @Override
    public double getSurface() {
        double surface = 6*side*side;
        return surface;
    }

    @Override
    public double getVolume() {
        double volume = side*side*side;
        return volume;
    }

}
