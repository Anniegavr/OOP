package com.labs.oop;

public class Rectangle extends Figure{
    double length;
    double width;

    Rectangle(double length, double width){
        this.length = length;
        this.width = width;
    }

    @Override
    double getArea() {
        return this.length * this.width;
    }

    @Override
    double getPerimeter() {
        return (this.length + this.width) * 2;
    }
}
