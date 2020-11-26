package oop;

public class X {
    protected String x;

    X(String x){
        x = x;
    }

    @Override
    public String toString() {
        return "X{" +
                "x='" + x + '\'' +
                '}';
    }
}
