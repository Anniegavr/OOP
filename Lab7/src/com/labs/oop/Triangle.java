package com.labs.oop;

public class Triangle extends Figure{
    double a;
    double b;
    double c;

    Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    double getArea() {
        double square_per = getPerimeter() / 2;
        return square_per * (square_per - this.a) * (square_per - this.b) * (square_per - this.c);
    }

    @Override
    double getPerimeter() {
        return a + b + c;
    }
}
