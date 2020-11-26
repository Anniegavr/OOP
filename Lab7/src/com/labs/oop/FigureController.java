package com.labs.oop;

public class FigureController {
    public Figure biggestArea(Figure[] f){
        int big=0;
        for (int i=1; !(i>=f.length || f[i]==null);i++){
            big = f[i-1].getArea()<f[i].getArea()? i : i-1;
        }
        return f[big];
    }

    public Figure biggestPerimeter(Figure[] fig){
        int big=0;
        for (int i=1; !(i>=fig.length || fig[i]==null);i++){
            big = fig[i-1].getPerimeter()<fig[i].getPerimeter()? i : i-1;
        }
        return fig[big];
    }
}
