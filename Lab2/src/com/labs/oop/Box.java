package com.labs.oop;

public class Box {
    double length;
    double width;
    double height;

    public Box(){
        this.length = 1;
        this.height = 1;
        this.width = 1;
    }

    public Box(double side){
        this.length = side;
        this.height = side;
        this.width = side;
    }

    public Box(double length, double height, double width){
        this.length = length;
        this.height = height;
        this.width = width;
    }

    public double getVolume(){
        return(this.length * this.height * this.width);
    }

    public double getSurface_area() {
        return (2 * (this.length * this.width + this.width * this.height + this.length * this.height));
    }

}
