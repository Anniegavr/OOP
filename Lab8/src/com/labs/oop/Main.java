package com.labs.oop;

public class Main {

    public static void main(String[] args) {
        Parallelepiped parallelepiped = new Parallelepiped(1, 2, 3);
        Cube cube = new Cube(2);
        Sphere sphere = new Sphere(3);
        GeometricBody[] arr = new GeometricBody[4];

        arr[0] = parallelepiped;
        arr[1] = cube;
        arr[2] = sphere;

        GeometricBodyController geometricBodyController = new GeometricBodyController();
        System.out.println("The figure with the biggest surface is: " + geometricBodyController.biggestSurface(arr).getClass().getSimpleName());
        System.out.println("The figure with the biggest volume is: " + geometricBodyController.biggestVolume(arr).getClass().getSimpleName());

    }
}
