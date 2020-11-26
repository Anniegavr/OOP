package com.labs.oop;

public class Square extends Figure{
    double side;

    Square(double side){
        this.side = side;
    }

    @Override
    double getArea() {
        return this.side * this.side;
    }

    @Override
    double getPerimeter() {
        return this.side * 4;
    }
}
