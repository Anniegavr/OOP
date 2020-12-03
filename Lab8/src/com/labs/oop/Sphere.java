package com.labs.oop;
import java.lang.Math;

public class Sphere implements GeometricBody{
    private double radius;

    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    public double getSurface() {
        return 4.0*Math.PI*radius*radius;
    }

    @Override
    public double getVolume() {
        return (4.0/3.0)*Math.PI*radius*radius*radius;
    }

}
