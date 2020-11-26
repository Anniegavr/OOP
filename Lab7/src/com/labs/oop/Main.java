package com.labs.oop;
import java.lang.Math;

public class Main {

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(4, 6);
        Square square = new Square(3);
        Triangle triangle = new Triangle(3, 4, 5);
        Figure[] arr = new Figure[4];

        arr[0] = rectangle;
        arr[1] = square;
        arr[2] = triangle;

        FigureController figureController = new FigureController();
        System.out.println("The figure with the biggest area is: " + figureController.biggestArea(arr).getClass().getSimpleName());
        System.out.println("The figure with the biggest perimeter is: " + figureController.biggestPerimeter(arr).getClass().getSimpleName());

        Square circle = new Square(6){
            double getArea() {
                return Math.PI * this.side*this.side;
            }

            double getPerimeter() {
                return 2 * Math.PI * this.side;
            }
        };

        System.out.println("The circle's perimeter is " + circle.getPerimeter());
        arr[3] = circle;
        System.out.println("Now, the figure with the biggest area is: "+ figureController.biggestArea(arr).getArea());
    }
}
