package com.labs.oop;

public class Parallelepiped implements GeometricBody {
    private double len, width, height;

    Parallelepiped(double len, double width, double height) {
        this.len = len;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getSurface() {
        return 4*(len*height) + 2*len*width;
    }

    @Override
    public double getVolume() {
        return len*width*height;
    }

}
