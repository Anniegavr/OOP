package com.labs.oop;

public class GeometricBodyController {

    public GeometricBody biggestSurface(GeometricBody[] bodies){
        int bigPosition=0;
        for (int i=1; !(i>=bodies.length || bodies[i]==null); i++){
            bigPosition = bodies[i-1].getSurface() < bodies[i].getSurface()? i : i-1;
        }
        return bodies[bigPosition];
    }

    public GeometricBody biggestVolume(GeometricBody[] bodies){
        int bigPosition=0;
        for (int i=1; !(i>=bodies.length || bodies[i]==null);i++){
            bigPosition = bodies[i-1].getVolume()< bodies[i].getVolume()? i : i-1;
        }
        return bodies[bigPosition];
    }
}
